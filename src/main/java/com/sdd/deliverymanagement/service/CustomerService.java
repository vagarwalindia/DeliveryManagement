package com.sdd.deliverymanagement.service;

import com.sdd.GenericCode.service.GenericService;
import com.sdd.deliverymanagement.entity.Customer;
import com.sdd.deliverymanagement.spec.CustomerSpec;
import com.sdd.deliverymanagement.vo.CustomerVO;
import com.sdd.deliverymanagement.vo.filter.CustomerFilterVO;

public interface CustomerService extends GenericService<CustomerVO, CustomerFilterVO, CustomerSpec, Customer, String> {
}
