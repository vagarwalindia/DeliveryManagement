package com.sdd.deliverymanagement.service;

import com.sdd.deliverymanagement.entity.Shipment;
import com.sdd.deliverymanagement.spec.ShipmentSpec;
import com.sdd.deliverymanagement.vo.ShipmentVO;
import com.sdd.deliverymanagement.vo.filter.ShipmentFilterVO;

public interface ShipmentService extends GenericService<ShipmentVO, ShipmentFilterVO, ShipmentSpec, Shipment, String> {
}
