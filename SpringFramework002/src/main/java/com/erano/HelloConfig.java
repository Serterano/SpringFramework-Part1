package com.erano;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

	@Bean
	public HelloBean getHelloBean() {
		return new HelloBean();
	}
}
