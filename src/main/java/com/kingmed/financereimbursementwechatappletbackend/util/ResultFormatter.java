package com.kingmed.financereimbursementwechatappletbackend.util;

import com.google.gson.JsonObject;
import org.springframework.stereotype.Component;

/*
 * @description: 转换OCR接口返回的数据格式,让前端JS可以直接使用
 * @author: 陈璟辉
 * @date: 2021-03-30 15:49
 */
@Component
public class ResultFormatter {


    public String resultFormatter(JsonObject jsonObjectTemp){
        System.out.println(jsonObjectTemp);
        JsonObject jsonObjectResult = new JsonObject();
        jsonObjectResult.addProperty("invoice_type", jsonToString(jsonObjectTemp,"发票名称"));
        jsonObjectResult.addProperty("invoice_code", jsonToString(jsonObjectTemp,"发票代码"));
        jsonObjectResult.addProperty("invoice_number", jsonToString(jsonObjectTemp,"发票号码").replaceAll("[a-zA-Z]","" ));
        jsonObjectResult.addProperty("date", jsonToString(jsonObjectTemp,"开票日期") );

        jsonObjectResult.addProperty("check_code", jsonToString(jsonObjectTemp,"校验码") );
        jsonObjectResult.addProperty("machine_code", jsonToString(jsonObjectTemp,"机器编号"));
        jsonObjectResult.addProperty("password_area", jsonToString(jsonObjectTemp,"密码区1")+jsonToString(jsonObjectTemp,"密码区2")+jsonToString(jsonObjectTemp,"密码区3")+jsonToString(jsonObjectTemp,"密码区4"));

        jsonObjectResult.addProperty("price_total", jsonToString(jsonObjectTemp,"合计金额"));
        jsonObjectResult.addProperty("tax_total", jsonToString(jsonObjectTemp,"合计税额"));

        jsonObjectResult.addProperty("price_tax_total", jsonToString(jsonObjectTemp,"小写金额"));
        jsonObjectResult.addProperty("price_tax_total_chinese", jsonToString(jsonObjectTemp,"价税合计(大写)"));
        jsonObjectResult.addProperty("payee", jsonToString(jsonObjectTemp,"收款人"));
        jsonObjectResult.addProperty("reviewer", jsonToString(jsonObjectTemp,"复核"));
        jsonObjectResult.addProperty("issuer", jsonToString(jsonObjectTemp,"开票人"));
        jsonObjectResult.addProperty("comment", jsonToString(jsonObjectTemp,"备注"));


        jsonObjectResult.addProperty("purchaser_name", jsonToString(jsonObjectTemp,"购买方名称"));
        jsonObjectResult.addProperty("purchaser_taxpayer_identification_number", jsonToString(jsonObjectTemp,"购买方识别号"));
        jsonObjectResult.addProperty("purchaser_address_phone", jsonToString(jsonObjectTemp,"购买方地址、电话"));
        jsonObjectResult.addProperty("purchaser_bank_account", jsonToString(jsonObjectTemp,"购买方开户行及账号"));
        jsonObjectResult.addProperty("seller_name", jsonToString(jsonObjectTemp,"销售方名称"));
        jsonObjectResult.addProperty("seller_taxpayer_identification_number", jsonToString(jsonObjectTemp,"销售方识别号"));
        jsonObjectResult.addProperty("seller_address_phone", jsonToString(jsonObjectTemp,"销售方地址、电话"));
        jsonObjectResult.addProperty("seller_bank_account", jsonToString(jsonObjectTemp,"销售方开户行及账号"));




        return jsonObjectResult.toString();
    }

    public String jsonToString(JsonObject jsonObjectTemp,String key){
       return jsonObjectTemp.get(key).toString().replaceAll("\\\"","");
    }

}
