package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("paytm")
public class Paytm implements PaymentService{

	public void pay(double amount) {
		System.out.println("paid "+amount+" using paytm");
	}
}
