package com.lly835.bestpay.utils;

import com.lly835.bestpay.constants.AliPayConstants;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

public class WebUtil {

    public static String buildForm(String baseUrl,Map<String, String> parameters) {
        return "<form id='bestPayForm' name=\"punchout_form\" method=\"post\" action=\"" + baseUrl + "\">\n" + buildHiddenFields(parameters) + "<input type=\"submit\" value=\"立即支付\" style=\"display:none\" >\n" + "</form>\n" + "<script>document.getElementById('bestPayForm').submit();</script>";
    }

    private static String buildHiddenFields(Map<String, String> parameters) {
        if (parameters != null && !parameters.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Set<String> keys = parameters.keySet();

            for (String key : keys) {
                String value = parameters.get(key);
                if (key != null && value != null) {
                    sb.append(buildHiddenField(key,value));
                }
            }

            return sb.toString();
        } else {
            return "";
        }
    }

    private static String buildHiddenField(String key, String value) {
        StringBuilder sb = new StringBuilder();
        sb.append("<input type=\"hidden\" name=\"");
        sb.append(key);
        sb.append("\" value=\"");
        String a = value.replace("\"", "&quot;");
        sb.append(a).append("\">\n");
        return sb.toString();
    }

    public static String buildQuery(Map<String, String> params, String charset) throws IOException {
        if (params != null && !params.isEmpty()) {
            StringBuilder query = new StringBuilder();
            Set<Map.Entry<String, String>> entries = params.entrySet();
            boolean hasParam = false;

            for (Map.Entry<String, String> stringStringEntry : entries) {
                String name = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                if (StringUtil.areNotEmpty(name,value)) {
                    if (hasParam) {
                        query.append("&");
                    } else {
                        hasParam = true;
                    }
                    query.append(name).append("=").append(URLEncoder.encode(value,charset));
                }
            }
            return query.toString();
        } else {
            return null;
        }
    }

    public static String getRequestUrl(Map<String,String> parameters,Boolean isSandbox)  {
        StringBuilder urlSb;
        if(isSandbox)
            urlSb = new StringBuilder(AliPayConstants.ALIPAY_GATEWAY_OPEN_DEV);
        else
            urlSb = new StringBuilder(AliPayConstants.ALIPAY_GATEWAY_OPEN);

        urlSb.append("/gateway.do");
        try {
            String charset = null != parameters.get("charset") ? parameters.get("charset") : "utf-8";
            String sysMustQuery = WebUtil.buildQuery(parameters, charset);
            urlSb.append("?");
            urlSb.append(sysMustQuery);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urlSb.toString();
    }
}
