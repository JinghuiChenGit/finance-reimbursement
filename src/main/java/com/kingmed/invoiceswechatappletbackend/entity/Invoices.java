package com.kingmed.invoiceswechatappletbackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


/*
 * @description:发票实体类
 * @author 陈璟辉
 * @date 2021-03-22 17:55
 */
@Table("invoices")
public class Invoices {
    @Id
    private Integer id;
    private String invoice_code;//发票代码
    private String invoice_number;//发票号码
    private String date;//开票日期
    private String check_code;//校验码
    private String machine_code;//机器编号
    private String password;//密码区
    private String purchaser_name;//购买方_名称
    private String purchaser_taxpayer_identification_number;//购买方_纳税人识别号
    private String purchaser_address_phone;//购买方_地址电话
    private String purchaser_bank_account;//购买方_开户行及账号
    private String seller_name;//销售方_名称
    private String seller_taxpayer_identification_number;//销售方_纳税人识别号
    private String seller_address_phone;//销售方_地址电话
    private String seller_bank_account;//销售方_开户行及账号
    private String tax_total;//价税合计
    private String payee;//收款人
    private String reviewer;//复核
    private String issuer;//开票人
    private String comment;//备注

    public Invoices() {

    }

    @Override
    public String toString() {
        return "Invoices{" +
                "id=" + id +
                ", invoice_code='" + invoice_code + '\'' +
                ", invoice_number='" + invoice_number + '\'' +
                ", date='" + date + '\'' +
                ", check_code='" + check_code + '\'' +
                ", machine_code='" + machine_code + '\'' +
                ", password='" + password + '\'' +
                ", purchaser_name='" + purchaser_name + '\'' +
                ", purchaser_taxpayer_identification_number='" + purchaser_taxpayer_identification_number + '\'' +
                ", purchaser_address_phone='" + purchaser_address_phone + '\'' +
                ", purchaser_bank_account='" + purchaser_bank_account + '\'' +
                ", seller_name='" + seller_name + '\'' +
                ", seller_taxpayer_identification_number='" + seller_taxpayer_identification_number + '\'' +
                ", seller_address_phone='" + seller_address_phone + '\'' +
                ", seller_bank_account='" + seller_bank_account + '\'' +
                ", tax_total='" + tax_total + '\'' +
                ", payee='" + payee + '\'' +
                ", reviewer='" + reviewer + '\'' +
                ", issuer='" + issuer + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoice_code() {
        return invoice_code;
    }

    public void setInvoice_code(String invoice_code) {
        this.invoice_code = invoice_code;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheck_code() {
        return check_code;
    }

    public void setCheck_code(String check_code) {
        this.check_code = check_code;
    }

    public String getMachine_code() {
        return machine_code;
    }

    public void setMachine_code(String machine_code) {
        this.machine_code = machine_code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPurchaser_name() {
        return purchaser_name;
    }

    public void setPurchaser_name(String purchaser_name) {
        this.purchaser_name = purchaser_name;
    }

    public String getPurchaser_taxpayer_identification_number() {
        return purchaser_taxpayer_identification_number;
    }

    public void setPurchaser_taxpayer_identification_number(String purchaser_taxpayer_identification_number) {
        this.purchaser_taxpayer_identification_number = purchaser_taxpayer_identification_number;
    }

    public String getPurchaser_address_phone() {
        return purchaser_address_phone;
    }

    public void setPurchaser_address_phone(String purchaser_address_phone) {
        this.purchaser_address_phone = purchaser_address_phone;
    }

    public String getPurchaser_bank_account() {
        return purchaser_bank_account;
    }

    public void setPurchaser_bank_account(String purchaser_bank_account) {
        this.purchaser_bank_account = purchaser_bank_account;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getSeller_taxpayer_identification_number() {
        return seller_taxpayer_identification_number;
    }

    public void setSeller_taxpayer_identification_number(String seller_taxpayer_identification_number) {
        this.seller_taxpayer_identification_number = seller_taxpayer_identification_number;
    }

    public String getSeller_address_phone() {
        return seller_address_phone;
    }

    public void setSeller_address_phone(String seller_address_phone) {
        this.seller_address_phone = seller_address_phone;
    }

    public String getSeller_bank_account() {
        return seller_bank_account;
    }

    public void setSeller_bank_account(String seller_bank_account) {
        this.seller_bank_account = seller_bank_account;
    }

    public String getTax_total() {
        return tax_total;
    }

    public void setTax_total(String tax_total) {
        this.tax_total = tax_total;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Invoices(Integer id, String invoice_code, String invoice_number, String date, String check_code, String machine_code, String password, String purchaser_name, String purchaser_taxpayer_identification_number, String purchaser_address_phone, String purchaser_bank_account, String seller_name, String seller_taxpayer_identification_number, String seller_address_phone, String seller_bank_account, String tax_total, String payee, String reviewer, String issuer, String comment) {
        this.id = id;
        this.invoice_code = invoice_code;
        this.invoice_number = invoice_number;
        this.date = date;
        this.check_code = check_code;
        this.machine_code = machine_code;
        this.password = password;
        this.purchaser_name = purchaser_name;
        this.purchaser_taxpayer_identification_number = purchaser_taxpayer_identification_number;
        this.purchaser_address_phone = purchaser_address_phone;
        this.purchaser_bank_account = purchaser_bank_account;
        this.seller_name = seller_name;
        this.seller_taxpayer_identification_number = seller_taxpayer_identification_number;
        this.seller_address_phone = seller_address_phone;
        this.seller_bank_account = seller_bank_account;
        this.tax_total = tax_total;
        this.payee = payee;
        this.reviewer = reviewer;
        this.issuer = issuer;
        this.comment = comment;
    }
}
