package com.kingmed.invoiceswechatappletbackend.controller;

import com.google.gson.JsonObject;
import com.kingmed.invoiceswechatappletbackend.entity.OcrModel;
import com.kingmed.invoiceswechatappletbackend.service.InvoicesService;
import com.kingmed.invoiceswechatappletbackend.entity.Invoices;
import com.kingmed.invoiceswechatappletbackend.service.VatInvoiceOCRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

/*
 * @description: 控制器
 * @author: 陈璟辉
 * @date: 2021-03-22 18:01
 */
@RestController
@RequestMapping("/invoicescan")
public class InvoiceController {

    @Autowired
    InvoicesService invoicesService;

    @Autowired
    VatInvoiceOCRService vatInvoiceOCRService;

    //测试用查找所有的数据
    @RequestMapping("/run")
    public @ResponseBody
    String run() {
        return invoicesService.findAll();
    }

    //存储数据
    @RequestMapping("/saveinvoice")
    public ResponseEntity<Invoices> save(@RequestBody Invoices invoices) {
        System.out.println(invoices);
        //invoicesService.saveInvoices(invoices);
        return ResponseEntity.created(URI.create("/save")).build();
    }

    @PostMapping("/ocr")
    public ResponseEntity ocr(@RequestBody OcrModel ocrModel){
        JsonObject jsonObject = new JsonObject();
        String result = vatInvoiceOCRService.vatInvoice(ocrModel.getUrl());
        return new ResponseEntity(result, HttpStatus.OK );
    }



}
