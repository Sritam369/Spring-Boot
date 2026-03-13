package com.sri.main;

import java.time.LocalDate;
import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.config.AppConfig;

public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       String lang = IO.readln("enter language");
       LocalDate date = LocalDate.parse(IO.readln("enter date"));
       Locale locale = Locale.of(lang);
       String message = ctx.getMessage("date.message",new Object[] {date},locale);
       IO.println(message);
       ctx.close();
    }
}
