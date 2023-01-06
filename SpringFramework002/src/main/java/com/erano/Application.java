package com.erano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		
		//context= new ClassPathXmlApplicationContext(); 
		//it works if u use helloBean = HelloConfig.getHelloBean();
		
		context = new AnnotationConfigApplicationContext(HelloConfig.class); //it works
		
		HelloBean helloBean = null;
		try {
			helloBean = context.getBean(HelloBean.class);
			helloBean.setName("Ali");
			helloBean.sayHello();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
