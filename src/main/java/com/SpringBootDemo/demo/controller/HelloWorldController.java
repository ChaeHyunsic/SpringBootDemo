package com.SpringBootDemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String getHelloWorld() {
		String value = "Hello, World!";

		return value;
	}
	

}
