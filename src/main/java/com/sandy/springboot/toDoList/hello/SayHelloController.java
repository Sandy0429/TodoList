package com.sandy.springboot.toDoList.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class SayHelloController {	
	
	//"say-hello" => "Hello! What are you learning today?"
	
	//http://localhost:8080/say-hello
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today??";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body> My first html page with body!!!</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//JSP -- view technology(Java Server Pages)
	/*say-hello-jsp ==> sayHello.jsp
	 * 
	 * */
	
	@RequestMapping("/say-hello-jsp")
//	@ResponseBody //-- to get exact text that is in return
	public String sayHelloJSP() {
		return "sayHello";
	}

}
