package com.sdd.deliverymanagement.service.impl;

import com.sdd.deliverymanagement.entity.Customer;
import com.sdd.deliverymanagement.repository.CustomerRepository;
import com.sdd.deliverymanagement.service.CustomerService;
import com.sdd.deliverymanagement.spec.CustomerSpec;
import com.sdd.deliverymanagement.util.BusinessException;
import com.sdd.deliverymanagement.util.EncriptAndDecryptString;
import com.sdd.deliverymanagement.util.MessageConstant;
import com.sdd.deliverymanagement.vo.CustomerVO;
import com.sdd.deliverymanagement.vo.filter.CustomerFilterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends AbstractService<CustomerVO, CustomerFilterVO, Customer, CustomerSpec, String> implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public CustomerVO convertToVO(Customer t) {

        CustomerVO v = new CustomerVO();
        v.setAddress(t.getAddress());
        v.setId(t.getId());
        v.setName(t.getName());
        v.setEmailId(EncriptAndDecryptString.decrypt(t.getEmailId()));
        v.setMobileNo(EncriptAndDecryptString.decrypt(t.getMobileNo()));
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
        t.setEmailId(EncriptAndDecryptString.encrypt(v.getEmailId()));
        t.setName(v.getName());
        t.setMobileNo(EncriptAndDecryptString.encrypt(v.getMobileNo()));
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

    @Override
    public void validateAdd(CustomerVO v) {
        Customer  t = customerRepository.findByEmailId(EncriptAndDecryptString.encrypt(v.getEmailId()));
        if(t!=null)
            throw new BusinessException(MessageConstant.ALREADY_RECORD_EXIST_WITH_SAME_EMAIL);
        super.validateAdd(v);
    }

    @Override
    public void validateUpdate(CustomerVO v) {
        Customer  t = customerRepository.findByEmailId(EncriptAndDecryptString.encrypt(v.getEmailId()));
        if(t==null)
            throw new BusinessException(MessageConstant.EMAIL_ID_CANNOT_CHANGE);
        super.validateUpdate(v);
    }
}
