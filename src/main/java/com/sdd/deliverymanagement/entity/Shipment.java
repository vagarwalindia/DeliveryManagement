package com.sdd.deliverymanagement.entity;

import com.sdd.GenericCode.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shipments")
public class Shipment extends BaseEntity implements Serializable {

    private Date shipmentDate;
    private boolean isShipped;
    @OneToMany
    @JoinColumn(name = "order_id")
    private List<Order> orders;
}
