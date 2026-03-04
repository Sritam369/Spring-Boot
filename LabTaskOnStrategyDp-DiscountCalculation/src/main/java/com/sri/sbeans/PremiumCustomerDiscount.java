package com.sri.sbeans;

public class PremiumCustomerDiscount implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		System.out.println("Providing 10% discount");
		return amount-(amount*0.10);
	}

}
