package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/welcome")
	public String welcomeHome() {
		
		return "home";
	}
	
}
