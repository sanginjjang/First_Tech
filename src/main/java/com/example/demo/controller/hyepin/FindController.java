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

@Controller
@RequestMapping("/hyepin")
public class FindController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("/findUserId")
	public void goFindUserId() {
	}
	
	@RequestMapping("/findUserPw")
	public void goFindUserPw() {
	}
	
	@PostMapping("/goFindUserIdResult")
	public @ResponseBody String goFindUserIdResult(UserDto user) {
		String result = null;
		
		//find+userId, empty
		System.out.println("여기는 go");
		System.out.println(user.toString());
		System.out.println(user.getUserName());
		System.out.println(user.getUserPhone());
		System.out.println(user.getUserEmail());
		
		//유저 정보로 찾는 서비스 호출 
		UserDto findUser = userService.findUserId(user);
		if(findUser != null) {
			String userId = findUser.getUserId();
			result = "find:" + userId;
		}else {
			System.out.println("찾는 유저가 없음.");
		}
		
		
		return result;
	}
	
	@RequestMapping("/findUserIdResult")
	public String findUserIdResult(@RequestParam("userId") String userId) {
		System.out.println("여기는 결과창");
		System.out.println(userId);
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
