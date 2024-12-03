package com.example.demo.controller.hyepin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hyepin")
public class LoginController {
	
	//여기 아이디 찾기에서 선택해온 값 연동해서 보여줘야 하거든?
	@RequestMapping("/login")
	public void login() {
	}
	
	@RequestMapping("/findIdUserlogin/{id}")
	public String findIdUserlogin(@PathVariable("id") String id, Model model) {
		if(id != null) {
			model.addAttribute("id", id);
		}
		return "/hyepin/login";
	}
	
	@PostMapping("/userLogin")
	public String userLogin() {
		return "main";
	}
	
	@PostMapping("/companyLogin")
	public String companyLogin() {
		System.out.println("companyLogin");
		return "main";
	}
	
	
}
