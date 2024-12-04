package com.example.demo.controller.hyepin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.UserDto;
import com.example.demo.service.IUserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/hyepin")
public class LoginController {
	
	@Autowired
	IUserService userService;


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
	public @ResponseBody String userLogin(UserDto user, HttpServletRequest request) {
		System.out.println(user.toString());
		String result = "ready";
		//ready, success, fail
		if(user.getUserId() == "" || user.getUserPassword() == "") {
			result = "ready";
		}else {
			if(userService.idCheck(user)) {
				result = "success";
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
			}else {
				result = "fail";
			}
		}
		return result;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 완료");
		session.invalidate();
		return "/sangin/sum";
	}
	
	
	
	
	
}
