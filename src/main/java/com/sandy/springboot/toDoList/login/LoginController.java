package com.sandy.springboot.toDoList.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
@Controller //use this while returning a view 
//@RestController //use this when we have to return a json response
public class LoginController {
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AuthenticationService authService;

	@RequestMapping(value="/login-page", method = RequestMethod.GET)
	//ModelMap -- to avail anything to JSP use model
	public String login() {
		
		return "loginPage";
	}
	
	@RequestMapping(value="/login-page", method = RequestMethod.POST)
	//ModelMap -- to avail anything to JSP use model
	public String gotoWelcomePage(@RequestParam String email,@RequestParam String password, ModelMap modalmap) {
		
		
		modalmap.put("password", password);
		modalmap.put("email", email);
		
		//Authentication Logic
		//name - admim@admin.com
//		password - admin
		
		if (authService.authenticate(email,password))
			return "welcome";
		
		modalmap.put("errorMessage", "Invalid Credentials! Please try again.");
			return "loginPage";
		
	}
}
