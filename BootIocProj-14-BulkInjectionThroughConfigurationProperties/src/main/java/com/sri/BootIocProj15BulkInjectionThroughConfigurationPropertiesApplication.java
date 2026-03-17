package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.Company;

@SpringBootApplication
public class BootIocProj15BulkInjectionThroughConfigurationPropertiesApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj15BulkInjectionThroughConfigurationPropertiesApplication.class, args)){
			Company bean = ctx.getBean("cp",Company.class);
			IO.println(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
