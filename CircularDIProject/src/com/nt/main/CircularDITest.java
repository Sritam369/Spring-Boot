package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CircularDITest {
 public static void main(String[] args) {
	 FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
	 A a1 = ctx.getBean("a1",A.class);
	 IO.println(a1);
	 B b1 = ctx.getBean("b1",B.class);
	 IO.println(b1);
 }
}
