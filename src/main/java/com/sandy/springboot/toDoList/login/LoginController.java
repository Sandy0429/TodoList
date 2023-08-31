package com.sandy.springboot.toDoList.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class LoginController {

	@RequestMapping("/login-page")
	public String login() {
		return "loginPage";
	}
}
