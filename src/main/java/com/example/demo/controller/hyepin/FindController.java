package com.example.demo.controller.hyepin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/findUserPwResult")
	public String findUserPwResult(UserDto user, Model model) {
		System.out.println(user.getUserId());
		System.out.println(user.getUserPhone());
		System.out.println(user.getUserEmail());
		
		model.addAttribute("id", user.getUserId());
		return "/hyepin/findUserPwResult";
	}
	
	@RequestMapping("/findPwUpdate")
	public String findPwUpdate(@RequestParam("id") String id) {
		System.out.println(id);
		
		return "main";
	}
	
}
