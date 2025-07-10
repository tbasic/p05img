package com.tech.prjm05img;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("test")
	public String test() {
		System.out.println("test~~");
		return "test";
	}
	@RequestMapping("/")
	public String home() {
		System.out.println("home~~");
		return "../home";
	}
	
	@RequestMapping("bank")
	public String bank() {
		System.out.println("bank~~");
		return "./bank";
	}
	
}
