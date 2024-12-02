package com.example.demo.controller.sangin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	String main() {
		return "sangin/main";
	}
	@RequestMapping("/applicationsListForm")
	String applicationListForm(){
		return "sangin/applicationsListForm";
	}
}
