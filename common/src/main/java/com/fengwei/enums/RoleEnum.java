package com.fengwei.enums;

/**
 * 角色0-管理员,1-普通用户
 */
public enum RoleEnum {
    ADMIN(0),

    CUSTOMER(1);

    Integer code;

    RoleEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }
}
