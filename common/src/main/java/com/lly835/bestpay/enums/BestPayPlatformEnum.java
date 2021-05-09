package com.lly835.bestpay.enums;

/**
 * 支付平台
 */
public enum BestPayPlatformEnum {

    ALIPAY("alipay","支付宝"),

    WX("wx","微信"),
    ;

    private final String code;

    private final String name;

    BestPayPlatformEnum(String code,String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
