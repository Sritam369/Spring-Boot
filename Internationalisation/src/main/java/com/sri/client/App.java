package com.sri.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;

public class App {
    public static void main(String[] args) {
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class); 
      Scanner sc = new Scanner(System.in);
      System.out.println("provide language");
      String lang = sc.next();
      System.out.println("provide country");
      String country = sc.next();
      Locale locale =new Locale(lang,country);
      String msg1 = ctx.getMessage("welcome.msg", new Object[] {"sritam"}, locale);
      String msg2 = ctx.getMessage("goodbye.msg", new Object[] {}, locale);
      String msg3 = ctx.getMessage("application.title", new Object[] {}, locale);
      String msg4 = ctx.getMessage("wish.message", new Object[] {}, locale);
      
      System.out.println(msg1+" "+msg2+" "+msg3+" "+msg4);
      ctx.close();
      
    }
}
