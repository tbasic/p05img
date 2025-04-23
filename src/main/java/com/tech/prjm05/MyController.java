package com.tech.prjm05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {	
	@RequestMapping("test")
	public String test() {
		System.out.println("test()");
		return "test";
	}
	@RequestMapping("/")
	public String home() {
		
		return "../home";
	}
}
