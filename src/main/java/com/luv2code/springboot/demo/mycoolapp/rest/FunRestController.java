package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//create a method which suld returns helloworld
//	local date time gives the server time now
	@GetMapping("/")
	public String sayHello() {
		return "Hello world! Time on server is "+LocalDateTime.now();
 	}
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
 	}
//	expose a new endpoint for fortune
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is ur lucky day";
	}
}
