package com.sdd.deliverymanagement.vo;

import com.sdd.GenericCode.vo.BaseVO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ShipmentVO extends BaseVO implements Serializable {

    private String shipmentDate;
    private boolean isShipped;
    private String orderId;
    private List<String> orderIds;
    private List<OrderVO> orders;
}
