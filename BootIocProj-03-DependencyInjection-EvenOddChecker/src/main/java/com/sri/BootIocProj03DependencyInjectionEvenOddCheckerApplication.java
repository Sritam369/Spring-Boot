package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.sbeans.EvenOddChecker;

@SpringBootApplication
public class BootIocProj03DependencyInjectionEvenOddCheckerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootIocProj03DependencyInjectionEvenOddCheckerApplication.class, args);
		EvenOddChecker e = run.getBean("eo",EvenOddChecker.class);
		int number = Integer.parseInt(IO.readln("enter a number"));
		IO.println(e.check(number));
	}

}
