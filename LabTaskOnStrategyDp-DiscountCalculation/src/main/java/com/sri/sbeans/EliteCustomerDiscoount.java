package com.sri.sbeans;

public class EliteCustomerDiscoount implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		System.out.println("Providing 15% discount");
		return amount-(amount*0.15);
	}

}
