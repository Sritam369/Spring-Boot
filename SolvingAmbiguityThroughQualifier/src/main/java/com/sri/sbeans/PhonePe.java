package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("phone")
public class PhonePe implements PaymentService{

	public void pay(double amount) {
		System.out.println("paid "+amount+" using phonepe");
	}
}