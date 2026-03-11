package com.sri;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.controller.EmployeeController;
import com.sri.model.EmployeeBean;

@SpringBootApplication
public class BootIocProj08LayeredAppMiniProjectApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj08LayeredAppMiniProjectApplication.class, args)){
		String degs1 = IO.readln("enter designation 1");
		String degs2 = IO.readln("enter designation 2");
		String degs3 = IO.readln("enter designation 3");
		
		EmployeeController bean = ctx.getBean(EmployeeController.class);
		List<EmployeeBean> list = bean.showEmpDegs(degs1, degs2, degs3);
		list.forEach(emp->{IO.println(emp);});
	}
    catch(Exception e) {
    	e.printStackTrace();
    }
}
}