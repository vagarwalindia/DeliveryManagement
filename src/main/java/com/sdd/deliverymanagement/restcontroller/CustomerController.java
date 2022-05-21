package com.sdd.deliverymanagement.restcontroller;

import com.sdd.deliverymanagement.entity.Customer;
import com.sdd.deliverymanagement.spec.CustomerSpec;
import com.sdd.deliverymanagement.vo.CustomerVO;
import com.sdd.deliverymanagement.vo.filter.CustomerFilterVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CustomerController.CONTROLLERURL)
public class CustomerController extends RESTController<CustomerVO, CustomerFilterVO, CustomerSpec, Customer, String>{

    public static final String CONTROLLERURL = "v1/customer";
}
