package com.sdd.deliverymanagement.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "custom-uuid")
    @GenericGenerator(
            name = "custom-uuid",
            strategy = "com.sdd.deliverymanagement.util.CustomUUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private String id;
}
