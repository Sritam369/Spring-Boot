package com.sri.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;
import com.sri.sbeans.EmailNotification;
import com.sri.sbeans.NotificationApp;
import com.sri.sbeans.NotificationStrategy;
import com.sri.sbeans.SMSNotification;
import com.sri.sbeans.WhatsAppNotification;

public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	String choice = IO.readln("choose email/sms/whatsapp");
    	String msg = IO.readln("Enter message");
    	if(choice.equals("email")) {
    		NotificationStrategy n = ctx.getBean("email",EmailNotification.class);
    		NotificationApp na = ctx.getBean("app",NotificationApp.class);
    		na.setNoti(n);
    		na.notify(msg);
    	}
    	else if(choice.equals("sms")) {
    		NotificationStrategy n = ctx.getBean(SMSNotification.class);
    		NotificationApp na = ctx.getBean("app",NotificationApp.class);
    		na.setNoti(n);
    		na.notify(msg);
    	}
    	else if(choice.equals("whatsapp")) {
    		NotificationStrategy n = ctx.getBean(WhatsAppNotification.class);
    		NotificationApp na = ctx.getBean("app",NotificationApp.class);
    		na.setNoti(n);
    		na.notify(msg);
    	}
    	else {
    		IO.println("Invalid choice");
    	}
       }
       catch(Exception e) {
    	 e.printStackTrace();  
       }
    }
}
