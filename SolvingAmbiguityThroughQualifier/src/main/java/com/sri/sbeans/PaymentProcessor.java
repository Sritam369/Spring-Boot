package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pp")
public class PaymentProcessor {

	@Qualifier("phone")
	@Autowired
	private PaymentService payment;
	
	public void processPayment(double amount) {
		payment.pay(amount);
	}
}
