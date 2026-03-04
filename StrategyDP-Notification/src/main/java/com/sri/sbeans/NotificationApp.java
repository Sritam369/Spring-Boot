package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("app")
public class NotificationApp {

	private NotificationStrategy noti;

	public void setNoti(NotificationStrategy noti) {
		this.noti = noti;
	}
	
	public void notify(String message) {
		noti.send(message);
	}
}
