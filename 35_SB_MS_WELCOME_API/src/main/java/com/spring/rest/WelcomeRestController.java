package com.spring.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetClient;
	
	@Autowired
	private Environment evn;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
	
		String port = evn.getProperty("server.port");
		
		String welcomeMsg = "Welcome to spring boot("+ port + ")";
		
		String greetMsg = greetClient.invokGreetApi();
		
		return  greetMsg + ", " + welcomeMsg ;
	}

}
