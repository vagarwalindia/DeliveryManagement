package com.sdd.deliverymanagement.service.impl;

import com.sdd.deliverymanagement.entity.Order;
import com.sdd.deliverymanagement.repository.CustomerRepository;
import com.sdd.deliverymanagement.service.OrderService;
import com.sdd.deliverymanagement.spec.OrderSpec;
import com.sdd.deliverymanagement.vo.IdNameVO;
import com.sdd.deliverymanagement.vo.OrderVO;
import com.sdd.deliverymanagement.vo.filter.OrderFilterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl extends AbstractService<OrderVO, OrderFilterVO, Order, OrderSpec, String> implements OrderService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public OrderVO convertToVO(Order t) {
        OrderVO v = new OrderVO();
        v.setId(t.getId());
        v.setOrderDate(t.getOrderDate().toString());
        v.setAmount(t.getAmount());
        v.setDescription(t.getDescription());
        v.setCustomerId(t.getCustomer().getId());
        IdNameVO customer = new IdNameVO();
        customer.setId(t.getCustomer().getId());
        customer.setName(t.getCustomer().getName());
        v.setCustomer(customer);
        return v;
    }

    @Override
    public Order convertToEntity(OrderVO v) {
        Order t;
        if(v.getId()==null || v.getId().isBlank()){
            t = new Order();
        }
        else {
            t = this.getTById(v.getId());
        }
        t.setAmount(v.getAmount());
        t.setOrderDate(new Date());
        t.setAmount(v.getAmount());
        t.setDescription(v.getDescription());
        t.setCustomer(customerRepository.getById(v.getCustomerId()));
        return t;
    }

    @Override
    public Order setAdditionalDataToEntity(Order t,OrderVO v) {
        return t;
    }

    @Override
    public OrderSpec filter() {
        return new OrderSpec();
    }
}
