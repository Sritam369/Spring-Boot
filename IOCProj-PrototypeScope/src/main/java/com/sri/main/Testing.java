package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbean.Printer;

public class Testing {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Without applying factory method logic in appconfig
//        Printer p = ctx.getBean("p",Printer.class);
//        Printer p1 = ctx.getBean("p",Printer.class);
//        System.out.println(p.hashCode()+" "+p1.hashCode());
//        System.out.println(p==p1);
        
        //By applying factory method logic in AppConfig
        Printer p2 = ctx.getBean("p1",Printer.class);
        Printer p3 = ctx.getBean("p1",Printer.class);
        System.out.println(p2.hashCode()+" "+p3.hashCode());
        System.out.println(p2==p3);
        
    }
}
