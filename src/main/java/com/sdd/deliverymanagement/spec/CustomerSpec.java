package com.sdd.deliverymanagement.spec;

import com.sdd.GenericCode.spec.BaseSpec;
import com.sdd.deliverymanagement.entity.Customer;
import com.sdd.deliverymanagement.vo.CustomerVO;
import com.sdd.deliverymanagement.vo.filter.CustomerFilterVO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

public class CustomerSpec extends BaseSpec<Customer, CustomerFilterVO, CustomerVO> {
    @Override
    public Specification<Customer> filter(CustomerFilterVO customerFilterVO, Sort sort) {
        return null;
    }
}
