package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.EmployeeDetails;
import com.sri.sbeans.YearlySalaryCalculation;

@SpringBootApplication
public class BootIocProj12ValueAnnotationSpelApplication02Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj12ValueAnnotationSpelApplication02Application.class, args)){
			YearlySalaryCalculation bean = ctx.getBean("ys",YearlySalaryCalculation.class);
			IO.println(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
