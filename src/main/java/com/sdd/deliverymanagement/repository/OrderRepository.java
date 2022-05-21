package com.sdd.deliverymanagement.repository;

import com.sdd.deliverymanagement.entity.Order;
import com.sdd.deliverymanagement.util.CustomRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CustomRepository<Order,String> {
}
