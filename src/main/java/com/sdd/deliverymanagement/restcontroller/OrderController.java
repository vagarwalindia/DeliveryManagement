package com.sdd.deliverymanagement.restcontroller;

import com.sdd.deliverymanagement.entity.Order;
import com.sdd.deliverymanagement.spec.OrderSpec;
import com.sdd.deliverymanagement.vo.OrderVO;
import com.sdd.deliverymanagement.vo.filter.OrderFilterVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(OrderController.CONTROLLERURL)
public class OrderController extends RESTController<OrderVO, OrderFilterVO, OrderSpec, Order, String>{

    public static final String CONTROLLERURL = "v1/order";
}
