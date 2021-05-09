package com.lly835.bestpay.model.alipay.response;

import java.util.Objects;

/**
 * alipay.trade.create(统一收单交易创建接口)
 * https://docs.open.alipay.com/api_1/alipay.trade.create
 */
public class AliPayOrderCreateResponse {

    private AlipayTradeCreateResponse alipayTradeCreateResponse;

    private String sign;

    public AliPayOrderCreateResponse() {
    }

    public AlipayTradeCreateResponse getAlipayTradeCreateResponse() {
        return this.alipayTradeCreateResponse;
    }

    public void setAlipayTradeCreateResponse(AlipayTradeCreateResponse alipayTradeCreateResponse) {
        this.alipayTradeCreateResponse = alipayTradeCreateResponse;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AliPayOrderCreateResponse)) return false;
        final AliPayOrderCreateResponse other = (AliPayOrderCreateResponse) o;
        if (!other.canEqual(this)) return false;
        final Object this$alipayTradeCreateResponse = this.getAlipayTradeCreateResponse();
        final Object other$alipayTradeCreateResponse = other.getAlipayTradeCreateResponse();
        if (!Objects.equals(this$alipayTradeCreateResponse,other$alipayTradeCreateResponse)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        return Objects.equals(this$sign,other$sign);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AliPayOrderCreateResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $alipayTradeCreateResponse = this.getAlipayTradeCreateResponse();
        result = result * PRIME + ($alipayTradeCreateResponse == null ? 43 : $alipayTradeCreateResponse.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        return result;
    }

    public String toString() {
        return "AliPayOrderCreateResponse(alipayTradeCreateResponse=" + this.getAlipayTradeCreateResponse() + ", sign=" + this.getSign() + ")";
    }

    public static class AlipayTradeCreateResponse {

        private String code;

        private String msg;

        private String subCode;

        private String subMsg;

        /**
         * 支付宝交易号
         */
        private String tradeNo;

        /**
         * 商家订单号
         */
        private String outTradeNo;

        public AlipayTradeCreateResponse() {
        }

        public String getCode() {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getSubCode() {
            return this.subCode;
        }

        public void setSubCode(String subCode) {
            this.subCode = subCode;
        }

        public String getSubMsg() {
            return this.subMsg;
        }

        public void setSubMsg(String subMsg) {
            this.subMsg = subMsg;
        }

        public String getTradeNo() {
            return this.tradeNo;
        }

        public void setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
        }

        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public void setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof AlipayTradeCreateResponse)) return false;
            final AlipayTradeCreateResponse other = (AlipayTradeCreateResponse) o;
            if (!other.canEqual(this)) return false;
            final Object this$code = this.getCode();
            final Object other$code = other.getCode();
            if (!Objects.equals(this$code,other$code)) return false;
            final Object this$msg = this.getMsg();
            final Object other$msg = other.getMsg();
            if (!Objects.equals(this$msg,other$msg)) return false;
            final Object this$subCode = this.getSubCode();
            final Object other$subCode = other.getSubCode();
            if (!Objects.equals(this$subCode,other$subCode)) return false;
            final Object this$subMsg = this.getSubMsg();
            final Object other$subMsg = other.getSubMsg();
            if (!Objects.equals(this$subMsg,other$subMsg)) return false;
            final Object this$tradeNo = this.getTradeNo();
            final Object other$tradeNo = other.getTradeNo();
            if (!Objects.equals(this$tradeNo,other$tradeNo)) return false;
            final Object this$outTradeNo = this.getOutTradeNo();
            final Object other$outTradeNo = other.getOutTradeNo();
            return Objects.equals(this$outTradeNo,other$outTradeNo);
        }

        protected boolean canEqual(final Object other) {
            return other instanceof AlipayTradeCreateResponse;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $code = this.getCode();
            result = result * PRIME + ($code == null ? 43 : $code.hashCode());
            final Object $msg = this.getMsg();
            result = result * PRIME + ($msg == null ? 43 : $msg.hashCode());
            final Object $subCode = this.getSubCode();
            result = result * PRIME + ($subCode == null ? 43 : $subCode.hashCode());
            final Object $subMsg = this.getSubMsg();
            result = result * PRIME + ($subMsg == null ? 43 : $subMsg.hashCode());
            final Object $tradeNo = this.getTradeNo();
            result = result * PRIME + ($tradeNo == null ? 43 : $tradeNo.hashCode());
            final Object $outTradeNo = this.getOutTradeNo();
            result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
            return result;
        }

        public String toString() {
            return "AliPayOrderCreateResponse.AlipayTradeCreateResponse(code=" + this.getCode() + ", msg=" + this.getMsg() + ", subCode=" + this.getSubCode() + ", subMsg=" + this.getSubMsg() + ", tradeNo=" + this.getTradeNo() + ", outTradeNo=" + this.getOutTradeNo() + ")";
        }
    }
}
