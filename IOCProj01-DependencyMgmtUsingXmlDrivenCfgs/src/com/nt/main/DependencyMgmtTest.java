package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyMgmtTest {
	
  public static void main(String[] args) {
	  FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  
	  Object bean = ctx.getBean("wmg");
	  WishMessageGenerator wish = (WishMessageGenerator) bean;
	  String result = wish.showMessage("sritam");
	  System.out.println(result);
	  ctx.close();
	  
  }
}
