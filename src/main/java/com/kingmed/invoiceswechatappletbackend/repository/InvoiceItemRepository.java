package com.kingmed.invoiceswechatappletbackend.repository;

/*
 * @description: 发票项目的spring data jdbc接口
 * @author: 陈璟辉
 * @date: 2021-03-25 14:17
 */

import com.kingmed.invoiceswechatappletbackend.entity.InvoiceItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItemRepository extends CrudRepository<InvoiceItem,Integer> {

}
