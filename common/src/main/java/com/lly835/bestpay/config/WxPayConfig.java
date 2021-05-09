package com.lly835.bestpay.config;

import org.apache.http.ssl.SSLContexts;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;

public class WxPayConfig extends PayConfig {

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 公众号appSecret
     */
    private String appSecret;

    /**
     * 小程序appId
     */
    private String miniAppId;

    /**
     * app应用appid
     */
    private String appAppId;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 证书内容
     */
    private SSLContext sslContext;

    public WxPayConfig() {
    }

    /**
     * 初始化证书
     * @return
     */
    public SSLContext initSSLContext() {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(this.keyPath));
        } catch (IOException e) {
            throw new RuntimeException("读取微信商户证书文件出错", e);
        }

        try {
            KeyStore keystore = KeyStore.getInstance("PKCS12");
            char[] partnerId2charArray = mchId.toCharArray();
            keystore.load(inputStream, partnerId2charArray);
            this.sslContext = SSLContexts.custom().loadKeyMaterial(keystore, partnerId2charArray).build();
            return this.sslContext;
        } catch (Exception e) {
            throw new RuntimeException("证书文件有问题，请核实！", e);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public String getMiniAppId() {
        return this.miniAppId;
    }

    public String getAppAppId() {
        return this.appAppId;
    }

    public String getMchId() {
        return this.mchId;
    }

    public String getMchKey() {
        return this.mchKey;
    }

    public String getKeyPath() {
        return this.keyPath;
    }

    public SSLContext getSslContext() {
        return this.sslContext;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public void setMiniAppId(String miniAppId) {
        this.miniAppId = miniAppId;
    }

    public void setAppAppId(String appAppId) {
        this.appAppId = appAppId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public void setMchKey(String mchKey) {
        this.mchKey = mchKey;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    public void setSslContext(SSLContext sslContext) {
        this.sslContext = sslContext;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxPayConfig)) return false;
        final WxPayConfig other = (WxPayConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$appSecret = this.getAppSecret();
        final Object other$appSecret = other.getAppSecret();
        if (this$appSecret == null ? other$appSecret != null : !this$appSecret.equals(other$appSecret)) return false;
        final Object this$miniAppId = this.getMiniAppId();
        final Object other$miniAppId = other.getMiniAppId();
        if (this$miniAppId == null ? other$miniAppId != null : !this$miniAppId.equals(other$miniAppId)) return false;
        final Object this$appAppId = this.getAppAppId();
        final Object other$appAppId = other.getAppAppId();
        if (this$appAppId == null ? other$appAppId != null : !this$appAppId.equals(other$appAppId)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (this$mchId == null ? other$mchId != null : !this$mchId.equals(other$mchId)) return false;
        final Object this$mchKey = this.getMchKey();
        final Object other$mchKey = other.getMchKey();
        if (this$mchKey == null ? other$mchKey != null : !this$mchKey.equals(other$mchKey)) return false;
        final Object this$keyPath = this.getKeyPath();
        final Object other$keyPath = other.getKeyPath();
        if (this$keyPath == null ? other$keyPath != null : !this$keyPath.equals(other$keyPath)) return false;
        final Object this$sslContext = this.getSslContext();
        final Object other$sslContext = other.getSslContext();
        if (this$sslContext == null ? other$sslContext != null : !this$sslContext.equals(other$sslContext))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxPayConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $appSecret = this.getAppSecret();
        result = result * PRIME + ($appSecret == null ? 43 : $appSecret.hashCode());
        final Object $miniAppId = this.getMiniAppId();
        result = result * PRIME + ($miniAppId == null ? 43 : $miniAppId.hashCode());
        final Object $appAppId = this.getAppAppId();
        result = result * PRIME + ($appAppId == null ? 43 : $appAppId.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $mchKey = this.getMchKey();
        result = result * PRIME + ($mchKey == null ? 43 : $mchKey.hashCode());
        final Object $keyPath = this.getKeyPath();
        result = result * PRIME + ($keyPath == null ? 43 : $keyPath.hashCode());
        final Object $sslContext = this.getSslContext();
        result = result * PRIME + ($sslContext == null ? 43 : $sslContext.hashCode());
        return result;
    }

    public String toString() {
        return "WxPayConfig(appId=" + this.getAppId() + ", appSecret=" + this.getAppSecret() + ", miniAppId=" + this.getMiniAppId() + ", appAppId=" + this.getAppAppId() + ", mchId=" + this.getMchId() + ", mchKey=" + this.getMchKey() + ", keyPath=" + this.getKeyPath() + ", sslContext=" + this.getSslContext() + ")";
    }
}
