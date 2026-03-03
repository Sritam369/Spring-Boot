package com.pack1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener,ServletContextAttributeListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext object initialized");
		ServletContext context = sce.getServletContext();
		System.out.println("App is deployed in to: "+context.getServerInfo());
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext object Destoyed");
	}
	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("Attribute added to the ServletContext object");
		String attributeName = scae.getName();
		System.out.println("Attribute name: "+attributeName);
	}
	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("Attribute removed from the ServletContext object");
	}
}
