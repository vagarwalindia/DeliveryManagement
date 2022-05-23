package com.sdd.deliverymanagement.repository;

import com.sdd.GenericCode.util.CustomRepository;
import com.sdd.deliverymanagement.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CustomRepository<Order,String> {
}
