package com.himanshi.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="https://hjindal-dev.github.io")
@RestController
public class BasicAuthenticationController {

	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException("Some Error has Occurred! Contact support at ******");
		return new AuthenticationBean("You are authenticated");
	}
	
}
