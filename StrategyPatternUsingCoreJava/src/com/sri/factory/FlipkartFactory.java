package com.sri.factory;

import com.sri.comp.BlueDart;
import com.sri.comp.Courier;
import com.sri.comp.DTDC;
import com.sri.comp.Flipkart;

public class FlipkartFactory {
  public static Flipkart getInstance(String courierType) {
	  Courier courier=null;
	  if(courierType.equals("dtdc")) {
		  courier=new DTDC();
	  }
	  else {
		  courier=new BlueDart();
	  }
	  Flipkart fpkt = new Flipkart(courier);
	  return fpkt;
  }
}
