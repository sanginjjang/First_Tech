package com.example.demo.controller.joontaek;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	
	@RequestMapping("/")
	public String root() {
		
		return "sum";
	}

}
