package com.lly835.bestpay.model.wxpay.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;


@Root(name = "xml", strict = false)
public class WxPayUnifiedorderRequest {

    @Element(name = "appid")
    private String appid;

    @Element(name = "mch_id")
    private String mchId;

    @Element(name = "nonce_str")
    private String nonceStr;

    @Element(name = "sign")
    private String sign;

    @Element(name = "attach", required = false)
    private String attach;

    @Element(name = "body", required = false)
    private String body;

    @Element(name = "detail", required = false)
    private String detail;

    @Element(name = "notify_url")
    private String notifyUrl;

    @Element(name = "openid", required = false)
    private String openid;

    @Element(name = "out_trade_no")
    private String outTradeNo;

    @Element(name = "spbill_create_ip")
    private String spbillCreateIp;

    @Element(name = "total_fee")
    private Integer totalFee;

    @Element(name = "trade_type")
    private String tradeType;

    public WxPayUnifiedorderRequest() {
    }

    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchId() {
        return this.mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAttach() {
        return this.attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getSpbillCreateIp() {
        return this.spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public Integer getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxPayUnifiedorderRequest)) return false;
        final WxPayUnifiedorderRequest other = (WxPayUnifiedorderRequest) o;
        if (!other.canEqual(this)) return false;
        final Object this$appid = this.getAppid();
        final Object other$appid = other.getAppid();
        if (!Objects.equals(this$appid,other$appid)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (!Objects.equals(this$mchId,other$mchId)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (!Objects.equals(this$nonceStr,other$nonceStr)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (!Objects.equals(this$sign,other$sign)) return false;
        final Object this$attach = this.getAttach();
        final Object other$attach = other.getAttach();
        if (!Objects.equals(this$attach,other$attach)) return false;
        final Object this$body = this.getBody();
        final Object other$body = other.getBody();
        if (!Objects.equals(this$body,other$body)) return false;
        final Object this$detail = this.getDetail();
        final Object other$detail = other.getDetail();
        if (!Objects.equals(this$detail,other$detail)) return false;
        final Object this$notifyUrl = this.getNotifyUrl();
        final Object other$notifyUrl = other.getNotifyUrl();
        if (!Objects.equals(this$notifyUrl,other$notifyUrl)) return false;
        final Object this$openid = this.getOpenid();
        final Object other$openid = other.getOpenid();
        if (!Objects.equals(this$openid,other$openid)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (!Objects.equals(this$outTradeNo,other$outTradeNo)) return false;
        final Object this$spbillCreateIp = this.getSpbillCreateIp();
        final Object other$spbillCreateIp = other.getSpbillCreateIp();
        if (!Objects.equals(this$spbillCreateIp,other$spbillCreateIp)) return false;
        final Object this$totalFee = this.getTotalFee();
        final Object other$totalFee = other.getTotalFee();
        if (!Objects.equals(this$totalFee,other$totalFee)) return false;
        final Object this$tradeType = this.getTradeType();
        final Object other$tradeType = other.getTradeType();
        return Objects.equals(this$tradeType,other$tradeType);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxPayUnifiedorderRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appid = this.getAppid();
        result = result * PRIME + ($appid == null ? 43 : $appid.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $attach = this.getAttach();
        result = result * PRIME + ($attach == null ? 43 : $attach.hashCode());
        final Object $body = this.getBody();
        result = result * PRIME + ($body == null ? 43 : $body.hashCode());
        final Object $detail = this.getDetail();
        result = result * PRIME + ($detail == null ? 43 : $detail.hashCode());
        final Object $notifyUrl = this.getNotifyUrl();
        result = result * PRIME + ($notifyUrl == null ? 43 : $notifyUrl.hashCode());
        final Object $openid = this.getOpenid();
        result = result * PRIME + ($openid == null ? 43 : $openid.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $spbillCreateIp = this.getSpbillCreateIp();
        result = result * PRIME + ($spbillCreateIp == null ? 43 : $spbillCreateIp.hashCode());
        final Object $totalFee = this.getTotalFee();
        result = result * PRIME + ($totalFee == null ? 43 : $totalFee.hashCode());
        final Object $tradeType = this.getTradeType();
        result = result * PRIME + ($tradeType == null ? 43 : $tradeType.hashCode());
        return result;
    }

    public String toString() {
        return "WxPayUnifiedorderRequest(appid=" + this.getAppid() + ", mchId=" + this.getMchId() + ", nonceStr=" + this.getNonceStr() + ", sign=" + this.getSign() + ", attach=" + this.getAttach() + ", body=" + this.getBody() + ", detail=" + this.getDetail() + ", notifyUrl=" + this.getNotifyUrl() + ", openid=" + this.getOpenid() + ", outTradeNo=" + this.getOutTradeNo() + ", spbillCreateIp=" + this.getSpbillCreateIp() + ", totalFee=" + this.getTotalFee() + ", tradeType=" + this.getTradeType() + ")";
    }
}
