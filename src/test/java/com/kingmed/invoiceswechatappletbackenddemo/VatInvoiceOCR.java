package com.kingmed.invoiceswechatappletbackenddemo;

/*
 * @description: ocr
 * @author: 陈璟辉
 * @date: 2021-03-26 14:29
 */



import com.google.gson.Gson;
import com.kingmed.financereimbursementwechatappletbackend.entity.JsonEntity;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.ocr.v20181119.OcrClient;
import com.tencentcloudapi.ocr.v20181119.models.VatInvoiceOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.VatInvoiceOCRResponse;

public class VatInvoiceOCR
{
    public static void main(String[] args) {
        String dataSt = "";
     //   String bussno = (String) JSONObject.parseArray(dataSt).getJSONObject(0).get("address");
        System.out.println(test());
       // System.out.println(bussno);
       // System.out.println(test().charAt(19));
        //System.out.println( JSONObject.parseArray(test().substring(19,test().length()-1)).size());
        Gson gson = new Gson();

        JsonEntity jsonEntity = gson.fromJson(test(),  JsonEntity.class);
        System.out.println(jsonEntity.getVatInvoiceInfos().get(0).getValue());

        for (int i = 0; i < jsonEntity.getVatInvoiceInfos().size(); i++) {
            System.out.println(jsonEntity.getVatInvoiceInfos().get(i).getName()+" "+jsonEntity.getVatInvoiceInfos().get(i).getValue());
        }

    }


    public static String test(){
        String url = "";

        try{

            Credential cred = new Credential("AKIDZFhi19yW3JM971lQGsF1YiojNlHNq0kF", "NUPG3ZSMjvuhlOq6ZYMxO5D7jZcUBjBd");

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("ocr.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            OcrClient client = new OcrClient(cred, "ap-guangzhou", clientProfile);

            VatInvoiceOCRRequest req = new VatInvoiceOCRRequest();
            req.setImageUrl("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2432079150,1635033868&fm=26&gp=0.jpg");
            //req.setImageUrl(url);
            //req.setImageBase64(url);

            VatInvoiceOCRResponse resp = client.VatInvoiceOCR(req);


            return VatInvoiceOCRResponse.toJsonString(resp);
        } catch (TencentCloudSDKException e) {

            return e.toString();
        }
    }
}
