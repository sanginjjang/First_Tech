package com.example.demo.controller.hyepin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.UserDto;
import com.example.demo.service.IUserService;

@Controller
@RequestMapping("/hyepin")
public class JoinController {
	
	@Autowired
	IUserService userService;

	@RequestMapping("/join")
	public void goJoin() {
	}
	
	@RequestMapping("/userJoin")
	public void userJoin() {
	}
	
	//ID 중복체크와, 유효성 검사하기
	@RequestMapping("/idCheck")
	public @ResponseBody String idCheck(@RequestParam("userId") String userId) {
		String id = "available";
		//exists, available
		UserDto user = userService.getUser(userId);
		if(user != null) {
			id = "exists";
		}
		return id;
	}
	
	//닉네임 중복체크와, 유효성 검사하기
	@RequestMapping("/nicknameCheck")
	public @ResponseBody String nicknameCheck(@RequestParam("userNickname") String userNickname) {
		String nickname = "available";
		//exists, available, 
		UserDto user = userService.getUserByNickname(userNickname);
		if(user != null) {
			nickname = "exists";
		}
		return nickname;
	}
	
	
	@PostMapping("/userJoinResult")
	public @ResponseBody String userJoinResult(UserDto user) {
		//ready, exists, available
		String state = "ready";
		List<UserDto> users = userService.getUserList();
		for(UserDto u : users) {
			if(user.getUserPhone().equals(u.getUserPhone()) || user.getUserEmail().equals(u.getUserEmail()) || user.getUserSsn().equals(u.getUserSsn())){
				state = "exists";
			}
		}
		if(state.equals("ready")) {
			int result = userService.insertUser(user);
			if(result == 1) {
				state = "available";
			}
		}
		return state;
	}
	
	
	
	
	
}
