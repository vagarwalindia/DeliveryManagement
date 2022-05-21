package com.sdd.deliverymanagement.util;

import lombok.AllArgsConstructor;

import java.util.function.Supplier;

@AllArgsConstructor
public class BusinessException extends RuntimeException {

    private final int errorCode;
}
