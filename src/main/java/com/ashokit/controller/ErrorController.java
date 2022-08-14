package com.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
	Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	@GetMapping("/errorr")
	String home() {
		logger.info("In Error API Logger Factory");
		
		int i = 10/0;
		System.out.println(i);
		
		return "Error API Called";
	}
}
