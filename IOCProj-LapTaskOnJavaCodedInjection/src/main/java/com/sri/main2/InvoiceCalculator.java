package com.sri.main2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs2.AppConfig;
import com.sri.sbeans2.InvoiceService;

public class InvoiceCalculator {
  public static void main(String[] args) {
	  try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
		  InvoiceService i = ctx.getBean("iv",InvoiceService.class);
		  i.printInvoice();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
