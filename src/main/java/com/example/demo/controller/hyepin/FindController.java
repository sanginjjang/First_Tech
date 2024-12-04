package com.example.demo.controller.hyepin;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		String result = "empty";
		
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
			result = "empty";
			System.out.println("찾는 유저가 없음.");
		}
		return result;
	}
	
	@RequestMapping("/findUserIdResult")
	public String findUserIdResult(@RequestParam("userId") String userId, Model model) {
		System.out.println("---------------------------------");
		System.out.println("여기는 결과창");
		System.out.println(userId);
		
		//다오에서 ID와 가입일 추출하여 가입정보 출력
		UserDto user = userService.getUser(userId);
		Timestamp originalTimestamp = user.getUserRegistDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String userRegistDate = sdf.format(originalTimestamp);  // "yyyy-MM-dd" 형식으로 변환
		
        model.addAttribute("user", user);
		model.addAttribute("userRegistDate", userRegistDate);
		
		return "/hyepin/findUserIdResult";
	}
	
	@RequestMapping("/findIdFindUserPw/{id}")
	public String findIdFindUserPw(@PathVariable("id") String id, Model model) {
		if(id != null) {
			model.addAttribute("id", id);
		}
		return "/hyepin/findUserPw";
	}
	
	@PostMapping("/goFindUserPwResult")
	public @ResponseBody String goFindUserPwResult(UserDto user) {
		System.out.println("---------------------");
		System.out.println("여기는 PW 찾기 페이지..");
		System.out.println(user.getUserId());
		System.out.println(user.getUserSsn());
		System.out.println(user.getUserPhone());
		System.out.println(user.getUserEmail());
		
		String result = null;
		UserDto findUser = userService.findUserPw(user);
		if(findUser != null) {
			String userId = findUser.getUserId();
			result = "find:" + userId;
		}else {
			result = "empty";
			System.out.println("찾는 유저가 없음.");
		}
		return result;
	}

	@RequestMapping("/findUserPwResult")
	public String findUserPwResult(@RequestParam("userId") String userId, Model model) {
		System.out.println("---------------------------");
		System.out.println("여기는 새 비번 설정하는 페이지..");
		System.out.println(userId);
		model.addAttribute("userId", userId);
		return "/hyepin/findUserPwResult";
	}
	
	@PostMapping("/findPwUpdate")
	public @ResponseBody String findPwUpdate(UserDto user) {
		String msg = "fail";
		//fail, success
		//다오에 update
		int result = userService.updateUserPw(user);
		if(result == 1) {
			msg = "success";
		}
		return msg;
	}
	
	
}
