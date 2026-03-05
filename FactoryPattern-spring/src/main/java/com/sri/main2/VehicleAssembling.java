package com.sri.main2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs2.AppConfig2;
import com.sri.sbeans2.Vehicle;
import com.sri.sbeans2.VehicleFactory;

public class VehicleAssembling {
	public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class)){
        VehicleFactory v = ctx.getBean("vf",VehicleFactory.class);
        String type = IO.readln("Choose car/truck/bike");
        Vehicle ve = v.getVehicle(type);
        ve.assemble();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
