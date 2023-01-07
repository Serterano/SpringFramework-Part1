package com.erano;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

	//do not use getBean
	
	private User user;
	
	@Autowired
	public UserService(User user) {
		this.user=user;
	}
	
	public User getUser() {
		return this.user;
	}
}
