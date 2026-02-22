package com.sri.test;

import com.sri.Factory.VehicleFactory;
import com.sri.comps.Vehicle;

public class StrategyPatternTest {

	public static void main(String[] args) {
		Vehicle v = VehicleFactory.start("petrol");
		IO.println(v.running());
	}

}
