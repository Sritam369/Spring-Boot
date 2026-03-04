package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bs")
public class BillingService {

	
	private DiscountStrategy discount;
	
	
	
	public void setDiscount(DiscountStrategy discount) {
		this.discount = discount;
	}



	public void generateBill(double amount) {
		double bill = discount.calculateDiscount(amount);
		System.out.println(bill);
	}
}
