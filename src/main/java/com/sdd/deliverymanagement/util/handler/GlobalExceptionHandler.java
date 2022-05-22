package com.sdd.deliverymanagement.util.handler;

import com.sdd.deliverymanagement.util.BusinessException;
import com.sdd.deliverymanagement.util.keywords.Keywords;
import com.sdd.deliverymanagement.util.service.MessageByLocaleService;
import com.sdd.deliverymanagement.util.vo.APIResponse;
import com.sdd.deliverymanagement.util.vo.ErrorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler extends AbstractExceptionHandler{

    @Autowired
    private MessageByLocaleService messageByLocaleService;

    @ExceptionHandler({ BusinessException.class})
    public ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request){
        APIResponse response = new APIResponse();
        ErrorDetails error = new ErrorDetails();
        error.setResponseStatus(Keywords.RESPONSE_FAILURE);
        error.setErrorCode(e.getErrorCode());
        error.setResponseMessage(messageByLocaleService.getMessage(String.valueOf(e.getErrorCode())));
        response.setError(error);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return handleExceptionInternal(e,response,headers, HttpStatus.OK,request);
    }
}
