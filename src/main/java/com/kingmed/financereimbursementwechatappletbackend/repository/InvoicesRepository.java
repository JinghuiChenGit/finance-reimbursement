package com.kingmed.financereimbursementwechatappletbackend.repository;

import com.kingmed.financereimbursementwechatappletbackend.entity.Invoices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepository extends CrudRepository<Invoices,Integer> {
}
