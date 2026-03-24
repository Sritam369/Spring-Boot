package com.sri.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sri.model.Payment;

@Service
@Profile({"dev"})
public class DummyPaymentService implements PaymentService{

	@Override
	public String processPayment(Payment p) {
		return "Processing dummy payment of "+p.getAmount();
	}

}
