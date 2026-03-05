package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.Appliance;
import com.sri.sbeans.ApplianceFactory;

public class ApplianceManufacturingSystem {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        ApplianceFactory factory = ctx.getBean("af",ApplianceFactory.class);
        String type = IO.readln("Choose refrigerator/washingmachine");
        Appliance a = factory.getAppliance(type);
        a.manufacture();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
