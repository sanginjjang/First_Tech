package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserDto;

@Controller
@RequestMapping("/hyepin")
public class FindController {
	
	@RequestMapping("/findUserId")
	public void goFindUserId() {
	}
	
	@RequestMapping("/findUserPw")
	public void goFindUserPw() {
	}
	
	@RequestMapping("/findCompanyId")
	public void goFindCompanyId() {
	}
	
	@RequestMapping("/findCompanyPw")
	public void goFindCompanyPw() {
	}
	
	@RequestMapping("/findUserIdResult")
	public String findUserIdResult(UserDto user, Model model) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserPhone());
		System.out.println(user.getUserEmail());
		
		model.addAttribute("id", "gPqls9440");
		return "/hyepin/findUserIdResult";
	}
	
	@RequestMapping("/findIdFindUserPw/{id}")
	public String findIdFindUserPw(@PathVariable("id") String id, Model model) {
		if(id != null) {
			model.addAttribute("id", id);
		}
		return "/hyepin/findUserPw";
	}
	

	
	
}
