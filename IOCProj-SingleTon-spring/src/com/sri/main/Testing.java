package com.sri.main;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbean.WishMessageGenerator;

public class Testing {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator w = ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator w2 = ctx.getBean("wmg",WishMessageGenerator.class);
		IO.println(w.hashCode());
		IO.println(w2.hashCode());
		IO.println(w==w2);
		IO.println(w.show());
		LocalDate d1 = ctx.getBean("ldate",LocalDate.class);
		LocalDate d2 = ctx.getBean("ldate",LocalDate.class);
		LocalDate d3 = ctx.getBean("ldate2",LocalDate.class);
		LocalDate d4 = ctx.getBean("ldate2",LocalDate.class);
		IO.println(d1.hashCode());
		IO.println(d2.hashCode());
		IO.println(d3.hashCode());
		IO.println(d4.hashCode());
		IO.println(d1==d2);
		IO.println(d3==d4);
		IO.println(d1==d3);
	}

}
