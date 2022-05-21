package com.sdd.deliverymanagement.restcontroller;

import com.sdd.deliverymanagement.entity.Shipment;
import com.sdd.deliverymanagement.spec.ShipmentSpec;
import com.sdd.deliverymanagement.vo.ShipmentVO;
import com.sdd.deliverymanagement.vo.filter.ShipmentFilterVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ShipmentController.CONTROLLERURL)
public class ShipmentController extends RESTController<ShipmentVO, ShipmentFilterVO, ShipmentSpec, Shipment, String>{

    public static final String CONTROLLERURL = "v1/shipment";
}
