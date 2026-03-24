package com.sri.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sri.model.Payment;

@Service
@Profile({"prod"})
public class CreditCardPaymentService implements PaymentService {

	@Override
	public String processPayment(Payment p) {
		return "Processing credit card payment of "+p.getAmount();
	}

}
