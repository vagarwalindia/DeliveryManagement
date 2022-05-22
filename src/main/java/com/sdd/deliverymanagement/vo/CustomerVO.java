package com.sdd.deliverymanagement.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CustomerVO extends BaseVO implements Serializable {

    private String name;
    private String emailId;
    private String address;
    private String mobileNo;

}
