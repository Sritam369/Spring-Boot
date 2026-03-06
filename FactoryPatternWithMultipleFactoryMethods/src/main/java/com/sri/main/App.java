package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.Vehicle;
import com.sri.sbeans.VehicleService;

public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       String type = IO.readln("Enter vehicle type: car/truck/motor cycle");
       String eType = IO.readln("Enter engine type: diesel/electric");
       VehicleService v = ctx.getBean("vs",VehicleService.class);
        v.createVehicle(type, eType);
       ctx.close();
    }
}
