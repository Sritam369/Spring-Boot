package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.Hotel;

@SpringBootApplication
public class BootIocProj11ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj11ValueAnnotationSpelApplication.class, args)){
			Hotel bean = ctx.getBean("hotel",Hotel.class);
			IO.println(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
