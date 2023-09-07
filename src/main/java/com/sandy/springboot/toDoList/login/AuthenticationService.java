package com.sandy.springboot.toDoList.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
//	Authenticate user
	public boolean authenticate(String userEmail, String password) {
		boolean isValidEmail = userEmail.equalsIgnoreCase("admin");
		boolean isValidPass = password.equalsIgnoreCase("admin");
		
		return isValidEmail && isValidPass; 
	}

}
