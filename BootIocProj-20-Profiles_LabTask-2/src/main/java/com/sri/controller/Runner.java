package com.sri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sri.model.Payment;
import com.sri.service.PaymentService;

@Repository
public class Runner   {

	@Autowired
	private PaymentService pay;
	
	public String payment() {
		Payment p = new Payment();
		p.setId(Integer.parseInt(IO.readln("enter id")));
		p.setAmount(Double.parseDouble(IO.readln("enter amount")));
		p.setMethod(IO.readln("enter payment mode"));
		return pay.processPayment(p);
	}
}
