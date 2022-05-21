package com.sdd.deliverymanagement.service.impl;

import com.sdd.deliverymanagement.entity.Order;
import com.sdd.deliverymanagement.entity.Shipment;
import com.sdd.deliverymanagement.repository.OrderRepository;
import com.sdd.deliverymanagement.service.ShipmentService;
import com.sdd.deliverymanagement.spec.ShipmentSpec;
import com.sdd.deliverymanagement.vo.ShipmentVO;
import com.sdd.deliverymanagement.vo.filter.ShipmentFilterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShipmentServiceImpl extends AbstractService<ShipmentVO, ShipmentFilterVO, Shipment, ShipmentSpec,String> implements ShipmentService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public ShipmentVO convertToVO(Shipment t) {

        ShipmentVO v = new ShipmentVO();
        v.setShipmentDate(t.getShipmentDate().toString());
        //v.setOrders(t.getOrders());
        v.setShipped(t.isShipped());
        v.setId(t.getId());
        return v;
    }

    @Override
    public Shipment convertToEntity(ShipmentVO v) {
        Shipment t;
        if(v.getId()==null || v.getId().isBlank()){
            t = new Shipment();
        }
        else{
            t = this.getTById(v.getId());
        }
        t.setShipmentDate(new Date());
        t.setShipped(v.isShipped());
        return setAdditionalDataToEntity(t,v);
    }

    @Override
    public Shipment setAdditionalDataToEntity(Shipment t, ShipmentVO v) {
        List<Order> orders = new ArrayList<>();
        if(v.getOrderIds()!=null && !v.getOrderIds().isEmpty()){
            for (String id:v.getOrderIds()) {
                if(orderRepository.getById(id)!=null){
                    orders.add(orderRepository.getById(id));
                }
            }
        }
        t.setOrders(orders);

        return t;
    }

    @Override
    public ShipmentSpec filter() {
        return new ShipmentSpec();
    }
}
