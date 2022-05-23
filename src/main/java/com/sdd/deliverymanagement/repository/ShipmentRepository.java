package com.sdd.deliverymanagement.repository;

import com.sdd.GenericCode.util.CustomRepository;
import com.sdd.deliverymanagement.entity.Shipment;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CustomRepository<Shipment,String> {
}
