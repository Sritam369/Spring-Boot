package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.BankRunner;
import com.sri.sbeans.CompanyRunner;
import com.sri.sbeans.LibraryRunner;

@SpringBootApplication
public class BootIocProj15BulkInjectionThroughConfigurationProperties3Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj15BulkInjectionThroughConfigurationProperties3Application.class, args)){
		//CompanyRunner bean = ctx.getBean(CompanyRunner.class);
		//BankRunner bean2 = ctx.getBean(BankRunner.class);
	    //bean2.run();
		LibraryRunner bean = ctx.getBean(LibraryRunner.class);
		IO.println(bean);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
