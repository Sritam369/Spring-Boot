package com.sri.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbean.WeekDayAnalyzer;

public class DependencyMgmt {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class)){
		WeekDayAnalyzer analyze = ctx.getBean("wda",WeekDayAnalyzer.class);
		IO.println(analyze.showMessage("Sritam"));
	}
    catch(Exception e) {
    	e.printStackTrace();
    }
	}
}
