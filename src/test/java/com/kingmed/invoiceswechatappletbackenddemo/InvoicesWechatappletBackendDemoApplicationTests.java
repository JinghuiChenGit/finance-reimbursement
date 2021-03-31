package com.kingmed.invoiceswechatappletbackenddemo;

import com.kingmed.invoiceswechatappletbackend.service.VatInvoiceOCRService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InvoicesWechatappletBackendDemoApplicationTests {

//	@Autowired
//	InvoicesRepository invoicesRepository;

	@Autowired
	VatInvoiceOCRService vatInvoiceOCRService;

	@Test
	void contextLoads() {
		vatInvoiceOCRService.vatInvoice("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2432079150,1635033868&fm=26&gp=0.jpg");
	}

}
