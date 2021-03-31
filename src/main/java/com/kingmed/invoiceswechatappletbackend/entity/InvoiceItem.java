package com.kingmed.invoiceswechatappletbackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/*
 * @description: 发票项目实体类
 * @author: 陈璟辉
 * @date: 2021-03-25 11:18
 */
@Table("invoice_item")
public class InvoiceItem {
    @Id
    private Integer id;
    private String invoice_code;//发票编号
    private String item_name;//货物或应税劳务，服务名称
    private String item_specification;//规格型号
    private String item_unit;//单位
    private String item_quantity;//数量
    private String item_price;//单价
    private String item_total_price;//金额
    private String item_tax_rate;//税率
    private String item_tax;//税额

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

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_specification() {
        return item_specification;
    }

    public void setItem_specification(String item_specification) {
        this.item_specification = item_specification;
    }

    public String getItem_unit() {
        return item_unit;
    }

    public void setItem_unit(String item_unit) {
        this.item_unit = item_unit;
    }

    public String getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(String item_quantity) {
        this.item_quantity = item_quantity;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public String getItem_total_price() {
        return item_total_price;
    }

    public void setItem_total_price(String item_total_price) {
        this.item_total_price = item_total_price;
    }

    public String getItem_tax_rate() {
        return item_tax_rate;
    }

    public void setItem_tax_rate(String item_tax_rate) {
        this.item_tax_rate = item_tax_rate;
    }

    public String getItem_tax() {
        return item_tax;
    }

    public void setItem_tax(String item_tax) {
        this.item_tax = item_tax;
    }

    public InvoiceItem(Integer id, String invoice_code, String item_name, String item_specification, String item_unit, String item_quantity, String item_price, String item_total_price, String item_tax_rate, String item_tax) {
        this.id = id;
        this.invoice_code = invoice_code;
        this.item_name = item_name;
        this.item_specification = item_specification;
        this.item_unit = item_unit;
        this.item_quantity = item_quantity;
        this.item_price = item_price;
        this.item_total_price = item_total_price;
        this.item_tax_rate = item_tax_rate;
        this.item_tax = item_tax;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id=" + id +
                ", invoice_code='" + invoice_code + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_specification='" + item_specification + '\'' +
                ", item_unit='" + item_unit + '\'' +
                ", item_quantity='" + item_quantity + '\'' +
                ", item_price='" + item_price + '\'' +
                ", item_total_price='" + item_total_price + '\'' +
                ", item_tax_rate='" + item_tax_rate + '\'' +
                ", item_tax='" + item_tax + '\'' +
                '}';
    }
}
