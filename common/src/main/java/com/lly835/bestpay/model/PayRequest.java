package com.lly835.bestpay.model;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.alipay.request.AliPayTradeCreateRequest;

/**
 * 支付时请求参数
 */
public class PayRequest {

    /**
     * 支付方式.
     */
    private BestPayTypeEnum payTypeEnum;

    /**
     * 订单号.
     */
    private String orderId;

    /**
     * 订单金额.
     */
    private Double orderAmount;

    /**
     * 订单名字.
     */
    private String orderName;

    /**
     * 微信openid, 仅微信公众号/小程序支付时需要
     */
    private String openid;

    /**
     * 客户端访问Ip  外部H5支付时必传，需要真实Ip
     * 20191015测试，微信h5支付已不需要真实的ip
     */
    private String spbillCreateIp;

    /**
     * 附加内容，发起支付时传入
     */
    private String attach;

    /**
     * 支付后跳转（支付宝PC网站支付）
     * 优先级高于PayConfig.returnUrl
     */
    private String returnUrl;

    /**
     * 买家支付宝账号
     * {@link AliPayTradeCreateRequest.BizContent}
     */
    private String buyerLogonId;

    /**
     * 买家的支付宝唯一用户号（2088开头的16位纯数字）
     * {@link AliPayTradeCreateRequest.BizContent}
     */
    private String buyerId;

    public PayRequest() {
    }

    public BestPayTypeEnum getPayTypeEnum() {
        return this.payTypeEnum;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public Double getOrderAmount() {
        return this.orderAmount;
    }

    public String getOrderName() {
        return this.orderName;
    }

    public String getOpenid() {
        return this.openid;
    }

    public String getSpbillCreateIp() {
        return this.spbillCreateIp;
    }

    public String getAttach() {
        return this.attach;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public String getBuyerLogonId() {
        return this.buyerLogonId;
    }

    public String getBuyerId() {
        return this.buyerId;
    }

    public void setPayTypeEnum(BestPayTypeEnum payTypeEnum) {
        this.payTypeEnum = payTypeEnum;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PayRequest)) return false;
        final PayRequest other = (PayRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$payTypeEnum = this.getPayTypeEnum();
        final Object other$payTypeEnum = other.getPayTypeEnum();
        if (this$payTypeEnum == null ? other$payTypeEnum != null : !this$payTypeEnum.equals(other$payTypeEnum))
            return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$orderAmount = this.getOrderAmount();
        final Object other$orderAmount = other.getOrderAmount();
        if (this$orderAmount == null ? other$orderAmount != null : !this$orderAmount.equals(other$orderAmount))
            return false;
        final Object this$orderName = this.getOrderName();
        final Object other$orderName = other.getOrderName();
        if (this$orderName == null ? other$orderName != null : !this$orderName.equals(other$orderName)) return false;
        final Object this$openid = this.getOpenid();
        final Object other$openid = other.getOpenid();
        if (this$openid == null ? other$openid != null : !this$openid.equals(other$openid)) return false;
        final Object this$spbillCreateIp = this.getSpbillCreateIp();
        final Object other$spbillCreateIp = other.getSpbillCreateIp();
        if (this$spbillCreateIp == null ? other$spbillCreateIp != null : !this$spbillCreateIp.equals(other$spbillCreateIp))
            return false;
        final Object this$attach = this.getAttach();
        final Object other$attach = other.getAttach();
        if (this$attach == null ? other$attach != null : !this$attach.equals(other$attach)) return false;
        final Object this$returnUrl = this.getReturnUrl();
        final Object other$returnUrl = other.getReturnUrl();
        if (this$returnUrl == null ? other$returnUrl != null : !this$returnUrl.equals(other$returnUrl)) return false;
        final Object this$buyerLogonId = this.getBuyerLogonId();
        final Object other$buyerLogonId = other.getBuyerLogonId();
        if (this$buyerLogonId == null ? other$buyerLogonId != null : !this$buyerLogonId.equals(other$buyerLogonId))
            return false;
        final Object this$buyerId = this.getBuyerId();
        final Object other$buyerId = other.getBuyerId();
        if (this$buyerId == null ? other$buyerId != null : !this$buyerId.equals(other$buyerId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PayRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $payTypeEnum = this.getPayTypeEnum();
        result = result * PRIME + ($payTypeEnum == null ? 43 : $payTypeEnum.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $orderAmount = this.getOrderAmount();
        result = result * PRIME + ($orderAmount == null ? 43 : $orderAmount.hashCode());
        final Object $orderName = this.getOrderName();
        result = result * PRIME + ($orderName == null ? 43 : $orderName.hashCode());
        final Object $openid = this.getOpenid();
        result = result * PRIME + ($openid == null ? 43 : $openid.hashCode());
        final Object $spbillCreateIp = this.getSpbillCreateIp();
        result = result * PRIME + ($spbillCreateIp == null ? 43 : $spbillCreateIp.hashCode());
        final Object $attach = this.getAttach();
        result = result * PRIME + ($attach == null ? 43 : $attach.hashCode());
        final Object $returnUrl = this.getReturnUrl();
        result = result * PRIME + ($returnUrl == null ? 43 : $returnUrl.hashCode());
        final Object $buyerLogonId = this.getBuyerLogonId();
        result = result * PRIME + ($buyerLogonId == null ? 43 : $buyerLogonId.hashCode());
        final Object $buyerId = this.getBuyerId();
        result = result * PRIME + ($buyerId == null ? 43 : $buyerId.hashCode());
        return result;
    }

    public String toString() {
        return "PayRequest(payTypeEnum=" + this.getPayTypeEnum() + ", orderId=" + this.getOrderId() + ", orderAmount=" + this.getOrderAmount() + ", orderName=" + this.getOrderName() + ", openid=" + this.getOpenid() + ", spbillCreateIp=" + this.getSpbillCreateIp() + ", attach=" + this.getAttach() + ", returnUrl=" + this.getReturnUrl() + ", buyerLogonId=" + this.getBuyerLogonId() + ", buyerId=" + this.getBuyerId() + ")";
    }
}
