package com.sri.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sri.sbeans.Notification;
import com.sri.sbeans.NotificationService;

@Component
public class Runner {

	@Autowired
	private NotificationService noti;
	
	public String msg(Notification n) {
		return noti.send(n);
	}
}
