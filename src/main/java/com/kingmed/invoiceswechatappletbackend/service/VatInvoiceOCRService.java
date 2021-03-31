package com.kingmed.invoiceswechatappletbackend.service;

/*
 * @description: OCR的扫描服务
 * @author: 陈璟辉
 * @date: 2021-03-26 14:37
 */

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.kingmed.invoiceswechatappletbackend.entity.JsonEntity;
import com.kingmed.invoiceswechatappletbackend.util.ResultFormatter;
import com.kingmed.invoiceswechatappletbackend.util.VatInvoiceOCR;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.profile.Language;
import com.tencentcloudapi.ocr.v20181119.OcrClient;
import com.tencentcloudapi.ocr.v20181119.models.VatInvoiceOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.VatInvoiceOCRResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VatInvoiceOCRService {

    @Autowired
    ResultFormatter resultFormatter;
    @Autowired
    VatInvoiceOCR vatInvoiceOCR;

    public String vatInvoice(String url) {
        JsonObject jsonObjectTemp = new JsonObject();
        String result = vatInvoiceOCR.invoiceScan(url);
        JsonEntity jsonEntity = new Gson().fromJson(result, JsonEntity.class);

        for (int i = 0; i < jsonEntity.getVatInvoiceInfos().size(); i++) {
            jsonObjectTemp.addProperty(jsonEntity.getVatInvoiceInfos().get(i).getName(), jsonEntity.getVatInvoiceInfos().get(i).getValue());
        }
        return resultFormatter.resultFormatter(jsonObjectTemp);

    }
}
