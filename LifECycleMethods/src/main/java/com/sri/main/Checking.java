
package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.VoterEligibilityChecking;

public class Checking {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        VoterEligibilityChecking c = ctx.getBean("voter",VoterEligibilityChecking.class);
        String result = c.check();
        System.out.println(result);
	}

}
