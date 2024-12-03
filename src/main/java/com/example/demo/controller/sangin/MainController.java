package com.example.demo.controller.sangin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@RequestMapping("/")
	String main(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		session.setAttribute("logUser","더콰이엇");
		
		return "sangin/sum";
	}
	@RequestMapping("/applicationsListForm")
	String applicationListForm(){
		return "sangin/applicationsListForm";
	}
}
