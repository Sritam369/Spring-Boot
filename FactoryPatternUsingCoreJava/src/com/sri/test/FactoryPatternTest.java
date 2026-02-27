package com.sri.test;

import com.sri.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {

		BikeFactory.bikes("standard").drive();
		BikeFactory.bikes("bullet").drive();
		BikeFactory.bikes("electric").drive();
		BikeFactory.bikes("sports").drive();
	}

}
