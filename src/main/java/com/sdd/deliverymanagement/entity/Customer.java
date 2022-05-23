package com.sdd.deliverymanagement.entity;

import com.sdd.GenericCode.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
@Entity
public class Customer extends BaseEntity implements Serializable {

    private String name;
    private String emailId;
    private String address;
    private String mobileNo;
}
