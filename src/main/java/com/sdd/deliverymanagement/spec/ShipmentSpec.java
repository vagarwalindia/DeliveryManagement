package com.sdd.deliverymanagement.spec;

import com.sdd.deliverymanagement.entity.Shipment;
import com.sdd.deliverymanagement.vo.ShipmentVO;
import com.sdd.deliverymanagement.vo.filter.ShipmentFilterVO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

public class ShipmentSpec extends BaseSpec<Shipment, ShipmentFilterVO, ShipmentVO>{
    @Override
    public Specification<Shipment> filter(ShipmentFilterVO shipmentFilterVO, Sort sort) {
        return null;
    }
}
