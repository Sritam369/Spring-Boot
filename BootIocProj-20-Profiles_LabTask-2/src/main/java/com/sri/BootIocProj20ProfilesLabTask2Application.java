package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.controller.Runner;
import com.sri.service.CreditCardPaymentService;

@SpringBootApplication
public class BootIocProj20ProfilesLabTask2Application {


	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj20ProfilesLabTask2Application.class, args)){
			Runner bean = ctx.getBean(Runner.class);
			IO.println(bean.payment());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
