package com.sdd.deliverymanagement.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderVO extends BaseVO implements Serializable {

    private String orderDate;
    private String description;
    private Integer amount;
    private IdNameVO customer;
    private String customerId;
}
