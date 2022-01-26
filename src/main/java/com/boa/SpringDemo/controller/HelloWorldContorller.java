package com.boa.SpringDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloWorld")
public class HelloWorldContorller {
@GetMapping("/show")
public String showInfo() {
	
	return ("HelloWorld");
}
}
