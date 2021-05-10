package com.fengwei.enums;


public enum PaymentTypeEnum {

    PAY_ONLINE(1);

    Integer code;

    PaymentTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }
}
