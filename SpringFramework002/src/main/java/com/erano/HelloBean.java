package com.erano;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component is not necessary for this project
@Component
public class HelloBean {
	//@Value is not necessary too
	@Value("name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello "+this.name);
	}

}
