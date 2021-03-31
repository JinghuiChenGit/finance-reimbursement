package com.kingmed.financereimbursementwechatappletbackend.service;
import com.kingmed.financereimbursementwechatappletbackend.entity.Invoices;
import com.kingmed.financereimbursementwechatappletbackend.repository.InvoicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * @description: 扫描发票业务层
 * @author: 陈璟辉
 * @date: 2021-03-22 17:59
 */
@Service
public class InvoicesService {
    @Autowired
    InvoicesRepository invoicesRepository;

    public String findAll(){
       return invoicesRepository.findAll().toString();
    }

    //调用repository的save写入数据到数据库
    @Transactional
    public Invoices saveInvoices(Invoices invoices){
            return invoicesRepository.save(invoices);

    }
}
