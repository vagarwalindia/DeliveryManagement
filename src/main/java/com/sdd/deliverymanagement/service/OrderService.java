package com.sdd.deliverymanagement.service;

import com.sdd.deliverymanagement.entity.Order;
import com.sdd.deliverymanagement.spec.OrderSpec;
import com.sdd.deliverymanagement.vo.OrderVO;
import com.sdd.deliverymanagement.vo.filter.OrderFilterVO;

public interface OrderService extends GenericService<OrderVO, OrderFilterVO, OrderSpec, Order, String>{
}
