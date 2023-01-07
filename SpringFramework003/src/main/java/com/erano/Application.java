package com.erano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = context.getBean(UserService.class);
		
		userService.getUser().setName("Ali");
		
		System.out.println("hello "+userService.getUser().getName());
	}

}
