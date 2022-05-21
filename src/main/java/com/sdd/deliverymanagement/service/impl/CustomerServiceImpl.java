package com.sdd.deliverymanagement.service.impl;

import com.sdd.deliverymanagement.entity.Customer;
import com.sdd.deliverymanagement.service.CustomerService;
import com.sdd.deliverymanagement.spec.CustomerSpec;
import com.sdd.deliverymanagement.util.EncriptAndDecryptString;
import com.sdd.deliverymanagement.vo.CustomerVO;
import com.sdd.deliverymanagement.vo.filter.CustomerFilterVO;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends AbstractService<CustomerVO, CustomerFilterVO, Customer, CustomerSpec, String> implements CustomerService {
    @Override
    public CustomerVO convertToVO(Customer t) {

        CustomerVO v = new CustomerVO();
        v.setAddress(t.getAddress());
        v.setId(t.getId());
        v.setName(t.getName());
        v.setEmailId(EncriptAndDecryptString.decryptString(t.getEmailId()));
        return v;
    }

    @Override
    public Customer convertToEntity(CustomerVO v) {
        Customer t;
        if(v.getId()==null || v.getId().isBlank()){
            t = new Customer();
        }
        else{
            t = this.getTById(v.getId());
        }
        t.setAddress(v.getAddress());
        t.setEmailId(EncriptAndDecryptString.encryptString(v.getEmailId()));
        t.setName(v.getName());
        t.setAddress(v.getAddress());
        return t;
    }

    @Override
    public Customer setAdditionalDataToEntity(Customer customer, CustomerVO customerVO) {
        return customer;
    }

    @Override
    public CustomerSpec filter() {
        return new CustomerSpec();
    }
}
