package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyMgmtTest {

	public static void main(String[] args) {
		
	  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	  SeasonFinder finder =  ctx.getBean("sf",SeasonFinder.class);
	  IO.println(finder.showSeasonName());
	}

}
