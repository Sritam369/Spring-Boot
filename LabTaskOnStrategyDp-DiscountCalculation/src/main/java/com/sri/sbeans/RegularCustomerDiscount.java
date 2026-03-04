package com.sri.sbeans;

public class RegularCustomerDiscount implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		System.out.println("Providing 5% discount");
		return amount-(amount*0.05);
	}

}
