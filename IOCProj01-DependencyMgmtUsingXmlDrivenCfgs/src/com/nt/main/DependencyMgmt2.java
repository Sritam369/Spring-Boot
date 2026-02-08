package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGeneratorThroughConstructor;

public class DependencyMgmt2 {
	public static void main(String[] args) {
  FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/constructorInjection.xml");
  
     Object obj = ctx.getBean("wmg");
     WishMessageGeneratorThroughConstructor generate = (WishMessageGeneratorThroughConstructor)obj;
     String message = generate.showMessage("sritam");
     IO.println(message);
	}  
}
