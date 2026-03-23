package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.runner.Runner;
import com.sri.sbeans.Notification;

@SpringBootApplication
public class BootIocProj19ProfilesLabTaskNotificationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj19ProfilesLabTaskNotificationApplication.class, args);
		Runner bean = ctx.getBean(Runner.class);
		Notification bean2 = ctx.getBean(Notification.class);
		bean2.setId(101);
		bean2.setMessage("hi");
		bean2.setReceipient("sritam");
		IO.println(bean.msg(bean2));
		ctx.close();
	}

}
