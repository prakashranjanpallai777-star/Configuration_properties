package com.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "GREET-API") //its recommended when both API registry with eureka server then go for service NAME
//@FeignClient(url = "http://localhost:9091" , name = "greet")
public interface GreetFeignClient {
	
	@GetMapping("/greet")
	public String invokGreetApi();
	
	
	@PostMapping("/greet/{name}")
	public String invokGreetApiPost(@PathVariable String name); // also we can use post request

}
