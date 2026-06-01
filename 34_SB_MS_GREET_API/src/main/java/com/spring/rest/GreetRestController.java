package com.spring.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@Autowired
	private Environment evm;

	@GetMapping("/greet")
	public String greetMsg() {
		String port = evm.getProperty("server.port");
		return "Good Morning("+ port + ")";
	}
}
