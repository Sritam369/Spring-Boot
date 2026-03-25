package com.sri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.sri.model.Payment;
import com.sri.service.PaymentService;

@Controller
public class Runner implements CommandLineRunner  {

	@Autowired
	private PaymentService pay;
	@Autowired
	private Payment p;

	@Override
	public void run(String... args) throws Exception {
		p.setId(Integer.parseInt(IO.readln("enter id")));
		p.setAmount(Double.parseDouble(IO.readln("enter amount")));
		p.setMethod(IO.readln("enter payment mode"));
		pay.processPayment(p);
		
	}
}
