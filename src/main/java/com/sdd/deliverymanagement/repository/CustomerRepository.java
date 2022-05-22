package com.sdd.deliverymanagement.repository;

import com.sdd.deliverymanagement.entity.Customer;
import com.sdd.deliverymanagement.util.CustomRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CustomRepository<Customer,String> {
    Customer findByEmailId(String emailId);
}
