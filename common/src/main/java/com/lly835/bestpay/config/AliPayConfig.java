package com.lly835.bestpay.config;

import java.util.Objects;

/**
 * Created by this on 2019/9/8 16:31
 */
public class AliPayConfig extends PayConfig {
    /**
     * appId
     */
    private String appId;
    /**
     * 商户私钥
     */
    private String privateKey;
    /**
     * 支付宝公钥
     */
    private String aliPayPublicKey;
    /**
     * 默认非沙箱测试
     */
    private boolean sandbox = false;

    public AliPayConfig() {
    }

    public void check() {
        Objects.requireNonNull(appId,"config param 'appId' is null.");
        Objects.requireNonNull(privateKey,"config param 'privateKey' is null.");
        Objects.requireNonNull(aliPayPublicKey,"config param 'aliPayPublicKey' is null.");

        if (appId.length() > 32) {
            throw new IllegalArgumentException("config param 'appId' is incorrect: size exceeds 32.");
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getAliPayPublicKey() {
        return this.aliPayPublicKey;
    }

    public void setAliPayPublicKey(String aliPayPublicKey) {
        this.aliPayPublicKey = aliPayPublicKey;
    }

    public boolean isSandbox() {
        return this.sandbox;
    }

    public void setSandbox(boolean sandbox) {
        this.sandbox = sandbox;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AliPayConfig)) return false;
        final AliPayConfig other = (AliPayConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$privateKey = this.getPrivateKey();
        final Object other$privateKey = other.getPrivateKey();
        if (this$privateKey == null ? other$privateKey != null : !this$privateKey.equals(other$privateKey))
            return false;
        final Object this$aliPayPublicKey = this.getAliPayPublicKey();
        final Object other$aliPayPublicKey = other.getAliPayPublicKey();
        if (this$aliPayPublicKey == null ? other$aliPayPublicKey != null : !this$aliPayPublicKey.equals(other$aliPayPublicKey))
            return false;
        if (this.isSandbox() != other.isSandbox()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AliPayConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $privateKey = this.getPrivateKey();
        result = result * PRIME + ($privateKey == null ? 43 : $privateKey.hashCode());
        final Object $aliPayPublicKey = this.getAliPayPublicKey();
        result = result * PRIME + ($aliPayPublicKey == null ? 43 : $aliPayPublicKey.hashCode());
        result = result * PRIME + (this.isSandbox() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "AliPayConfig(appId=" + this.getAppId() + ", privateKey=" + this.getPrivateKey() + ", aliPayPublicKey=" + this.getAliPayPublicKey() + ", sandbox=" + this.isSandbox() + ")";
    }
}
