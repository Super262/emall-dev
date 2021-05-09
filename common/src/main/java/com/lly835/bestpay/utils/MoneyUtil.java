package com.lly835.bestpay.utils;

import java.math.BigDecimal;

public class MoneyUtil {

    /**
     * 元转分
     */
    public static Integer Yuan2Fen(Double yuan) {
        return BigDecimal.valueOf(yuan).movePointRight(2).intValue();
    }

    /**
     * 分转元
     */
    public static Double Fen2Yuan(Integer fen) {
        return new BigDecimal(fen).movePointLeft(2).doubleValue();
    }
}
