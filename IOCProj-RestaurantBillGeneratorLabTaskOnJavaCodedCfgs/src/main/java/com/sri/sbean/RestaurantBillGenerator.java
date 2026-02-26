package com.sri.sbean;

public class RestaurantBillGenerator {

	private double foodAmount;
	private double drinksAmount;
	private double serviceCharge;
	private double gstPercentage;
	
	public void setFoodAmount(double foodAmount) {
		this.foodAmount = foodAmount;
	}
	public void setDrinksAmount(double drinksAmount) {
		this.drinksAmount = drinksAmount;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void setGstPercentage(double gstPercentage) {
		this.gstPercentage = gstPercentage;
	}
	
	public double generateBill() {
		double baseAmount = foodAmount+drinksAmount+serviceCharge;
		double gst = baseAmount*gstPercentage/100;
		double finalBill = baseAmount+gst;
		return finalBill;
	}
	
}
