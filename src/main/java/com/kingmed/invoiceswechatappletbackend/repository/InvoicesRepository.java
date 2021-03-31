package com.kingmed.invoiceswechatappletbackend.repository;

import com.kingmed.invoiceswechatappletbackend.entity.Invoices;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface InvoicesRepository extends CrudRepository<Invoices,Integer> {
}
