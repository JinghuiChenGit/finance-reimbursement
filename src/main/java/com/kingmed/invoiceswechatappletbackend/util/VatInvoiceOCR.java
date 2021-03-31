package com.kingmed.invoiceswechatappletbackend.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.kingmed.invoiceswechatappletbackend.entity.JsonEntity;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.profile.Language;
import com.tencentcloudapi.ocr.v20181119.OcrClient;
import com.tencentcloudapi.ocr.v20181119.models.VatInvoiceOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.VatInvoiceOCRResponse;
import org.springframework.stereotype.Component;

/*
 * @description: 腾讯云的OCR接口调用
 * @author: 陈璟辉
 * @date: 2021-03-31 15:44
 */
@Component
public class VatInvoiceOCR {

    public String invoiceScan(String url){
        try {

            Credential cred = new Credential("AKIDZFhi19yW3JM971lQGsF1YiojNlHNq0kF", "NUPG3ZSMjvuhlOq6ZYMxO5D7jZcUBjBd");

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("ocr.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            clientProfile.setLanguage(Language.EN_US);

            OcrClient client = new OcrClient(cred, "ap-guangzhou", clientProfile);

            VatInvoiceOCRRequest req = new VatInvoiceOCRRequest();

            req.setImageBase64(url);
            VatInvoiceOCRResponse resp = client.VatInvoiceOCR(req);


           return VatInvoiceOCRResponse.toJsonString(resp);

        } catch (TencentCloudSDKException e) {
            return e.toString();
        }

    }
}
