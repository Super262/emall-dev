package com.lly835.bestpay.service;

public interface EncryptAndDecryptService {

    /**
     * 加密
     */
    Object encrypt(String key,String data);


    /**
     * 解密
     */
    Object decrypt(String key,String data);
}
