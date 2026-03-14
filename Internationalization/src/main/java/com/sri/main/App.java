package com.sri.main;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        String lang = IO.readln("enter language");
        Locale locale = Locale.of(lang);
        String msg = ctx.getMessage("message.welcome",new Object[]{}, locale);
        IO.println(msg);
    }
}
