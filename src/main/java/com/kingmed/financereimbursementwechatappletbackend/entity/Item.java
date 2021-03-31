package com.kingmed.financereimbursementwechatappletbackend.entity;

import lombok.Data;

/*
 * @description:
 * @author: 陈璟辉
 * @date: 2021-03-29 16:07
 */
@Data
public class Item {
    private Integer id;
    private String invoice_code;//发票代码
    private String invoice_number;//发票号码
    private String date;//开票日期
    private String check_code;//校验码
    private String machine_code;//机器编号
    private String password;//密码区
    private String purchaser_name;
    private String purchaser_taxpayer_identification_number;
    //购买方_名称

}
