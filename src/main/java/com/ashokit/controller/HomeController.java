package com.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/home")
	String home() {
		logger.info("In Home API Logger Factory");
		return "Home API Called";
	}
}
