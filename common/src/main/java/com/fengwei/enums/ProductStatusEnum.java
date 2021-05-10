package com.fengwei.enums;

/**
 * 商品状态.1-在售 2-下架 3-删除
 */
public enum ProductStatusEnum {

    ON_SALE(1),

    OFF_SALE(2),

    DELETE(3);

    Integer code;

    ProductStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }
}
