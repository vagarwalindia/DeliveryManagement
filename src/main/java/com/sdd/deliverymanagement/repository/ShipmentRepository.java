package com.sdd.deliverymanagement.repository;

import com.sdd.deliverymanagement.entity.Shipment;
import com.sdd.deliverymanagement.util.CustomRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CustomRepository<Shipment,String> {
}
