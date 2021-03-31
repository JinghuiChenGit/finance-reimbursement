package com.kingmed.invoiceswechatappletbackenddemo;

/*
 * @description:
 * @author: 陈璟辉
 * @date: 2021-03-30 14:05
 */

import com.google.gson.Gson;
import com.kingmed.financereimbursementwechatappletbackend.entity.OcrModel;

public class testapi {
    public static void main(String[] args) {
        OcrModel ocrModel = new OcrModel();
        ocrModel.setUrl("this");
        Gson gson = new Gson();
        System.out.println(gson.toJson(ocrModel));
    }
}
