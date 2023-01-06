package com.erano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context= new ClassPathXmlApplicationContext("beans.xml");
		
		HelloBean helloBean = (HelloBean) context.getBean("HelloBean");
		helloBean.sayHello();
	}

}
