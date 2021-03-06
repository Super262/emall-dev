package com.lly835.bestpay.model.alipay.response;

import java.util.Objects;

/**
 * alipay.trade.query(统一收单线下交易查询) 响应
 * https://docs.open.alipay.com/api_1/alipay.trade.query
 */
public class AliPayOrderQueryResponse {

    private AlipayTradeQueryResponse alipayTradeQueryResponse;

    private String sign;

    public AliPayOrderQueryResponse() {
    }

    public AlipayTradeQueryResponse getAlipayTradeQueryResponse() {
        return this.alipayTradeQueryResponse;
    }

    public void setAlipayTradeQueryResponse(AlipayTradeQueryResponse alipayTradeQueryResponse) {
        this.alipayTradeQueryResponse = alipayTradeQueryResponse;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AliPayOrderQueryResponse)) return false;
        final AliPayOrderQueryResponse other = (AliPayOrderQueryResponse) o;
        if (!other.canEqual(this)) return false;
        final Object this$alipayTradeQueryResponse = this.getAlipayTradeQueryResponse();
        final Object other$alipayTradeQueryResponse = other.getAlipayTradeQueryResponse();
        if (!Objects.equals(this$alipayTradeQueryResponse,other$alipayTradeQueryResponse)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        return Objects.equals(this$sign,other$sign);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AliPayOrderQueryResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $alipayTradeQueryResponse = this.getAlipayTradeQueryResponse();
        result = result * PRIME + ($alipayTradeQueryResponse == null ? 43 : $alipayTradeQueryResponse.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        return result;
    }

    public String toString() {
        return "AliPayOrderQueryResponse(alipayTradeQueryResponse=" + this.getAlipayTradeQueryResponse() + ", sign=" + this.getSign() + ")";
    }

    public static class AlipayTradeQueryResponse {

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

        /**
         * 买家支付宝账号
         */
        private String buyerLogonId;

        /**
         * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
         */
        private String tradeStatus;

        /**
         * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
         */
        private String totalAmount;

        /**
         * 本次交易打款给卖家的时间
         */
        private String sendPayDate;

        /**
         * 买家在支付宝的用户id
         */
        private String buyerUserId;

        /**
         * 订单标题；
         * 只在间连场景下返回；
         */
        private String subject;

        /**
         * 订单描述;
         * 只在间连场景下返回；
         */
        private String body;

        public AlipayTradeQueryResponse() {
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

        public String getBuyerLogonId() {
            return this.buyerLogonId;
        }

        public void setBuyerLogonId(String buyerLogonId) {
            this.buyerLogonId = buyerLogonId;
        }

        public String getTradeStatus() {
            return this.tradeStatus;
        }

        public void setTradeStatus(String tradeStatus) {
            this.tradeStatus = tradeStatus;
        }

        public String getTotalAmount() {
            return this.totalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        public String getSendPayDate() {
            return this.sendPayDate;
        }

        public void setSendPayDate(String sendPayDate) {
            this.sendPayDate = sendPayDate;
        }

        public String getBuyerUserId() {
            return this.buyerUserId;
        }

        public void setBuyerUserId(String buyerUserId) {
            this.buyerUserId = buyerUserId;
        }

        public String getSubject() {
            return this.subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getBody() {
            return this.body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof AlipayTradeQueryResponse)) return false;
            final AlipayTradeQueryResponse other = (AlipayTradeQueryResponse) o;
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
            if (!Objects.equals(this$outTradeNo,other$outTradeNo)) return false;
            final Object this$buyerLogonId = this.getBuyerLogonId();
            final Object other$buyerLogonId = other.getBuyerLogonId();
            if (!Objects.equals(this$buyerLogonId,other$buyerLogonId)) return false;
            final Object this$tradeStatus = this.getTradeStatus();
            final Object other$tradeStatus = other.getTradeStatus();
            if (!Objects.equals(this$tradeStatus,other$tradeStatus)) return false;
            final Object this$totalAmount = this.getTotalAmount();
            final Object other$totalAmount = other.getTotalAmount();
            if (!Objects.equals(this$totalAmount,other$totalAmount)) return false;
            final Object this$sendPayDate = this.getSendPayDate();
            final Object other$sendPayDate = other.getSendPayDate();
            if (!Objects.equals(this$sendPayDate,other$sendPayDate)) return false;
            final Object this$buyerUserId = this.getBuyerUserId();
            final Object other$buyerUserId = other.getBuyerUserId();
            if (!Objects.equals(this$buyerUserId,other$buyerUserId)) return false;
            final Object this$subject = this.getSubject();
            final Object other$subject = other.getSubject();
            if (!Objects.equals(this$subject,other$subject)) return false;
            final Object this$body = this.getBody();
            final Object other$body = other.getBody();
            return Objects.equals(this$body,other$body);
        }

        protected boolean canEqual(final Object other) {
            return other instanceof AlipayTradeQueryResponse;
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
            final Object $buyerLogonId = this.getBuyerLogonId();
            result = result * PRIME + ($buyerLogonId == null ? 43 : $buyerLogonId.hashCode());
            final Object $tradeStatus = this.getTradeStatus();
            result = result * PRIME + ($tradeStatus == null ? 43 : $tradeStatus.hashCode());
            final Object $totalAmount = this.getTotalAmount();
            result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
            final Object $sendPayDate = this.getSendPayDate();
            result = result * PRIME + ($sendPayDate == null ? 43 : $sendPayDate.hashCode());
            final Object $buyerUserId = this.getBuyerUserId();
            result = result * PRIME + ($buyerUserId == null ? 43 : $buyerUserId.hashCode());
            final Object $subject = this.getSubject();
            result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
            final Object $body = this.getBody();
            result = result * PRIME + ($body == null ? 43 : $body.hashCode());
            return result;
        }

        public String toString() {
            return "AliPayOrderQueryResponse.AlipayTradeQueryResponse(code=" + this.getCode() + ", msg=" + this.getMsg() + ", subCode=" + this.getSubCode() + ", subMsg=" + this.getSubMsg() + ", tradeNo=" + this.getTradeNo() + ", outTradeNo=" + this.getOutTradeNo() + ", buyerLogonId=" + this.getBuyerLogonId() + ", tradeStatus=" + this.getTradeStatus() + ", totalAmount=" + this.getTotalAmount() + ", sendPayDate=" + this.getSendPayDate() + ", buyerUserId=" + this.getBuyerUserId() + ", subject=" + this.getSubject() + ", body=" + this.getBody() + ")";
        }
    }
}
