package com.techgeeknext.controller;

import com.techgeeknext.interceptor.EmployeeLoginInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping("/login")
	public String login() {
		logger.info("====Employee Login Controller=====");
		return "Employee Login";
	}
}
