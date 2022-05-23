package com.sdd.deliverymanagement.repository;

import com.sdd.GenericCode.util.CustomRepository;
import com.sdd.deliverymanagement.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CustomRepository<Customer,String> {
    Customer findByEmailId(String emailId);
}
