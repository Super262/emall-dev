package com.lly835.bestpay.enums;

/**
 * 订单状态
 */
public enum OrderStatusEnum {

    SUCCESS("支付成功"),

    REFUND("转入退款"),

    NOTPAY("未支付"),

    CLOSED("已关闭"),

    REVOKED("已撤销（刷卡支付）"),

    USERPAYING("用户支付中"),

    PAYERROR("支付失败"),

    UNKNOW("未知状态"),
    ;

    /**
     * 描述 微信退款后有内容
     */
    private final String desc;

    OrderStatusEnum(String desc) {
        this.desc = desc;
    }

    public static OrderStatusEnum findByName(String name) {
        for (OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()) {
            if (name.equalsIgnoreCase(orderStatusEnum.name())) {
                return orderStatusEnum;
            }
        }
        throw new RuntimeException("错误的微信支付状态");
    }

    public String getDesc() {
        return this.desc;
    }
}
