package com.kingmed.financereimbursementwechatappletbackend.entity;

/*
 * @description: json enetity
 * @author: 陈璟辉
 * @date: 2021-03-26 16:46
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.NoArgsConstructor
@lombok.Data
public class JsonEntity {

    /**
     * VatInvoiceInfos : [{"Name":"发票代码","Value":"1100143160","Polygon":{"LeftTop":{"X":100,"Y":36},"RightTop":{"X":177,"Y":36},"RightBottom":{"X":177,"Y":51},"LeftBottom":{"X":100,"Y":51}}},{"Name":"发票名称","Value":"北京增值税专用发票","Polygon":{"LeftTop":{"X":194,"Y":27},"RightTop":{"X":316,"Y":27},"RightBottom":{"X":316,"Y":44},"LeftBottom":{"X":194,"Y":44}}},{"Name":"发票消费类型","Value":"服务"},{"Name":"是否有公司印章","Value":"0"},{"Name":"省","Value":"北京市"},{"Name":"联次","Value":"一"},{"Name":"购买方名称","Value":""},{"Name":"购买方识别号","Value":""},{"Name":"购买方地址、电话","Value":""},{"Name":"购买方开户行及账号","Value":""},{"Name":"销售方名称","Value":""},{"Name":"销售方识别号","Value":""},{"Name":"销售方地址、电话","Value":""},{"Name":"销售方开户行及账号","Value":""},{"Name":"打印发票代码","Value":""},{"Name":"校验码","Value":""},{"Name":"发票号码","Value":""},{"Name":"打印发票号码","Value":""},{"Name":"开票日期","Value":""},{"Name":"货物或应税劳务、服务名称","Value":""},{"Name":"税率","Value":""},{"Name":"单价","Value":""},{"Name":"金额","Value":""},{"Name":"税额","Value":""},{"Name":"合计金额","Value":""},{"Name":"合计税额","Value":""},{"Name":"价税合计(大写)","Value":""},{"Name":"小写金额","Value":""},{"Name":"备注","Value":""},{"Name":"收款人","Value":""},{"Name":"复核","Value":""},{"Name":"开票人","Value":""},{"Name":"单位","Value":""},{"Name":"数量","Value":""},{"Name":"规格型号","Value":""},{"Name":"密码区1","Value":""},{"Name":"密码区2","Value":""},{"Name":"密码区3","Value":""},{"Name":"密码区4","Value":""},{"Name":"是否代开","Value":""},{"Name":"机器编号","Value":""},{"Name":"成品油标志","Value":""},{"Name":"市","Value":""},{"Name":"服务类型","Value":""},{"Name":"通行费标志","Value":""},{"Name":"车船税","Value":""}]
     * Items : []
     * PdfPageSize : 0
     * Angle : 0.0
     * RequestId : 61519cc9-ea3a-4de6-9fe1-2c5d49833037
     */

    @JsonProperty("VatInvoiceInfos")
    private List<VatInvoiceInfosDTO> VatInvoiceInfos;
    @JsonProperty("Items")
    private List<?> Items;
    @JsonProperty("PdfPageSize")
    private Integer PdfPageSize;
    @JsonProperty("Angle")
    private Double Angle;
    @JsonProperty("RequestId")
    private String RequestId;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class VatInvoiceInfosDTO {
        /**
         * Name : 发票代码
         * Value : 1100143160
         * Polygon : {"LeftTop":{"X":100,"Y":36},"RightTop":{"X":177,"Y":36},"RightBottom":{"X":177,"Y":51},"LeftBottom":{"X":100,"Y":51}}
         */

        @JsonProperty("Name")
        private String Name;
        @JsonProperty("Value")
        private String Value;
        @JsonProperty("Polygon")
        private PolygonDTO Polygon;

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class PolygonDTO {
            /**
             * LeftTop : {"X":100,"Y":36}
             * RightTop : {"X":177,"Y":36}
             * RightBottom : {"X":177,"Y":51}
             * LeftBottom : {"X":100,"Y":51}
             */

            @JsonProperty("LeftTop")
            private LeftTopDTO LeftTop;
            @JsonProperty("RightTop")
            private RightTopDTO RightTop;
            @JsonProperty("RightBottom")
            private RightBottomDTO RightBottom;
            @JsonProperty("LeftBottom")
            private LeftBottomDTO LeftBottom;

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class LeftTopDTO {
                /**
                 * X : 100
                 * Y : 36
                 */

                @JsonProperty("X")
                private Integer x;
                @JsonProperty("Y")
                private Integer y;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class RightTopDTO {
                /**
                 * X : 177
                 * Y : 36
                 */

                @JsonProperty("X")
                private Integer x;
                @JsonProperty("Y")
                private Integer y;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class RightBottomDTO {
                /**
                 * X : 177
                 * Y : 51
                 */

                @JsonProperty("X")
                private Integer x;
                @JsonProperty("Y")
                private Integer y;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class LeftBottomDTO {
                /**
                 * X : 100
                 * Y : 51
                 */

                @JsonProperty("X")
                private Integer x;
                @JsonProperty("Y")
                private Integer y;
            }
        }
    }
}
