package com.example.demo.controller.hyepin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String root() {
		return "/hyepin/main";
	}
	
	@RequestMapping("/hyepin/companyMain")
	public void companyMain() {
		
	}
	
	
	
}
