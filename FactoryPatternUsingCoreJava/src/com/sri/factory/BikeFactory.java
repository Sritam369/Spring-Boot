package com.sri.factory;

import com.sri.comps.Bike;
import com.sri.comps.BulletBike;
import com.sri.comps.ElectricBike;
import com.sri.comps.SportsBike;
import com.sri.comps.StandardBike;

public class BikeFactory {
    public static Bike bikes(String bikeType) {
    	Bike bike=null;
    	if(bikeType.equals("standard")) {
    		bike=new StandardBike();
    		return bike;
    	}
    	else if(bikeType.equals("bullet")) {
    		bike=new BulletBike();
    		return bike;
    	}
    	else if(bikeType.equals("sports")) {
    		bike=new SportsBike();
    		return bike;
    	}
    	else  {
    		bike=new ElectricBike();
    		return bike;
    	}
    }
}
