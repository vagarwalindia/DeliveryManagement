package com.sdd.deliverymanagement.spec;

import com.sdd.GenericCode.spec.BaseSpec;
import com.sdd.deliverymanagement.entity.Order;
import com.sdd.deliverymanagement.vo.OrderVO;
import com.sdd.deliverymanagement.vo.filter.OrderFilterVO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

public class OrderSpec extends BaseSpec<Order, OrderFilterVO, OrderVO> {
    @Override
    public Specification<Order> filter(OrderFilterVO orderFilterVO, Sort sort) {
        return null;
    }
}
