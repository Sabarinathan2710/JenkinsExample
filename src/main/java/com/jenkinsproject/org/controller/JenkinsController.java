package com.jenkinsproject.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	@GetMapping
	public String sayHello() {
		return "Hello World! Welcome to jenkins execution";
	}
	@GetMapping("/get")
	public String sayHi() {
		return "Hi da..! You're using the docker automation";
	}
}
