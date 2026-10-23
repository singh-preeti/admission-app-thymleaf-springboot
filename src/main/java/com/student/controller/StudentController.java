package com.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/")
	public String hello() {
		System.out.println("Hello Developers!");
		return "Hello";
	}

}
