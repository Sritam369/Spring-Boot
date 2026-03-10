package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootIocProj01DependencyInjectionApplication.class, args);
		SeasonFinder bean = run.getBean("sf",SeasonFinder.class);
		int month = Integer.parseInt(IO.readln("Enter month number"));
		IO.println(bean.getSeason(month));
	}

}
