package com.sri.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sri.model.Payment;

@Service
@Profile({"test"})
public class UpiPaymentService implements PaymentService{

	@Override
	public String processPayment(Payment p) {
		return "Processing upi payment of "+p.getAmount();
	}

}
