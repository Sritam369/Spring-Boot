package com.sri.Factory;

import com.sri.comps.DieselEngine;
import com.sri.comps.ElectricEngine;
import com.sri.comps.Engine;
import com.sri.comps.PetrolEngine;
import com.sri.comps.Vehicle;

public class VehicleFactory {
  public static Vehicle start(String engineType) {
	  Engine eng=null;
	  if(engineType.equals("petrol")) {
		  eng=new PetrolEngine();
	  }
	  else if(engineType.equals("diesel")) {
		  eng=new DieselEngine();
	  }
	  else if(engineType.equals("electric")) {
		  eng=new ElectricEngine();
	  }
	  else {
		  throw new RuntimeException("Invalid engine type");
	  }
	  
	  Vehicle v = new Vehicle(eng);
	  return v;
  }
}
