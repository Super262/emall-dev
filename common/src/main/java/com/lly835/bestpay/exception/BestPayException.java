package com.lly835.bestpay.exception;

import com.lly835.bestpay.enums.BestPayResultEnum;

public class BestPayException extends RuntimeException {

    private final Integer code;

    public BestPayException(BestPayResultEnum resultEnum) {
        super(resultEnum.getMsg());
        code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
