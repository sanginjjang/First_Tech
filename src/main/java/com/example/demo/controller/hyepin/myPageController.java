package com.example.demo.controller.hyepin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.UserDto;
import com.example.demo.service.IUserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/hyepin")
public class myPageController {

	@Autowired
	IUserService userService;
	
	@RequestMapping("/myPage")
	public void myPage() {
	}
	
	@RequestMapping("/goUserInformation")
	public void goUserInformation() {
	}
	
	@RequestMapping("/userInformation")
	public void userInformation(HttpSession session, Model model) {
		UserDto sessionUser = (UserDto) session.getAttribute("user");
		UserDto user = userService.getUser(sessionUser.getUserId());
		model.addAttribute("user", user);
	}
	
	@PostMapping("/myPagePwCheck")
	public @ResponseBody String myPagePwCheck(UserDto user, HttpSession session) {
		String msg = "fail";
		//fail, success
		//로그인 유저
		UserDto sessionUser = (UserDto) session.getAttribute("user");
		System.out.println("-------------------------------");
		System.out.println("여기는 myPagePwCheck 페이지..");
		System.out.println(sessionUser.toString());
		if(sessionUser != null) {
			if(sessionUser.getUserPassword().equals(user.getUserPassword())) {
				msg = "success";
			}
		}
		return msg;
	}
	
	@PostMapping("/updateUser")
	public @ResponseBody String updateUser(UserDto user, HttpSession session) {
		
		String msg = userService.updateUserInformation(user);
		//fail, exists, success
		//전화번호, 이메일 확인하고... update
		
		return msg;
	}
	
	
	
	
}
