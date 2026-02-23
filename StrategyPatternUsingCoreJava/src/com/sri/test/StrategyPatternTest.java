package com.sri.test;

import com.sri.comp.Flipkart;
import com.sri.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		String msg=fpkt.shopping(new String[] {"trouser", "shirt"},new double[] {5000,6000});
		IO.println(msg);
	}

}
