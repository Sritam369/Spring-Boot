package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("gpay")
public class GooglePay implements PaymentService{

	public void pay(double amount) {
		System.out.println("paid "+amount+" using googlepay");
	}
}
