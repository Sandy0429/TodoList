package com.sandy.springboot.toDoList;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ToDoListApplication {

	
	 public static Logger logger = LoggerFactory.getLogger(ToDoListApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("I have added logger here");
		SpringApplication.run(ToDoListApplication.class, args);
	}
	
	

}
