package com.lly835.bestpay.model.wxpay.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

/**
 * 微信扫码异步调用请求
 */

@Root(name = "xml", strict = false)
public class WxQrCodeAsyncResponse {

    @Element(name = "appid", required = false)
    private String appid;

    @Element(name = "openid", required = false)
    private String openId;

    @Element(name = "mch_id", required = false)
    private String mchId;

    @Element(name = "is_subscribe", required = false)
    private String isSubscribe;

    @Element(name = "nonce_str", required = false)
    private String nonceStr;

    @Element(name = "product_id", required = false)
    private String productId; //商品ID

    @Element(name = "sign", required = false)
    private String sign;

    public WxQrCodeAsyncResponse() {
    }

    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getMchId() {
        return this.mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getIsSubscribe() {
        return this.isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxQrCodeAsyncResponse)) return false;
        final WxQrCodeAsyncResponse other = (WxQrCodeAsyncResponse) o;
        if (!other.canEqual(this)) return false;
        final Object this$appid = this.getAppid();
        final Object other$appid = other.getAppid();
        if (!Objects.equals(this$appid,other$appid)) return false;
        final Object this$openId = this.getOpenId();
        final Object other$openId = other.getOpenId();
        if (!Objects.equals(this$openId,other$openId)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (!Objects.equals(this$mchId,other$mchId)) return false;
        final Object this$isSubscribe = this.getIsSubscribe();
        final Object other$isSubscribe = other.getIsSubscribe();
        if (!Objects.equals(this$isSubscribe,other$isSubscribe)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (!Objects.equals(this$nonceStr,other$nonceStr)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (!Objects.equals(this$productId,other$productId)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        return Objects.equals(this$sign,other$sign);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxQrCodeAsyncResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appid = this.getAppid();
        result = result * PRIME + ($appid == null ? 43 : $appid.hashCode());
        final Object $openId = this.getOpenId();
        result = result * PRIME + ($openId == null ? 43 : $openId.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $isSubscribe = this.getIsSubscribe();
        result = result * PRIME + ($isSubscribe == null ? 43 : $isSubscribe.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        return result;
    }

    public String toString() {
        return "WxQrCodeAsyncResponse(appid=" + this.getAppid() + ", openId=" + this.getOpenId() + ", mchId=" + this.getMchId() + ", isSubscribe=" + this.getIsSubscribe() + ", nonceStr=" + this.getNonceStr() + ", productId=" + this.getProductId() + ", sign=" + this.getSign() + ")";
    }
}
