package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.StudentRunner;

@SpringBootApplication
public class BootIocProj15BulkInjectionThroughConfigurationProperties02Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj15BulkInjectionThroughConfigurationProperties02Application.class, args)){
			StudentRunner bean = ctx.getBean("sr",StudentRunner.class);
			IO.println(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
