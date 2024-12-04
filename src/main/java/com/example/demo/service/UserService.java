package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.hyepin.IUserDao;
import com.example.demo.dto.UserDto;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserDao userDao;

	@Override
	public List<UserDto> getUserList() {
		List<UserDto> users = userDao.getUserList();
		return users;
	}
	
	@Override
	public int insertUser(UserDto user) {
		int result = userDao.insertUser(user);
		return result;
	}
	
	@Override
	public UserDto getUser(String userId) {
		UserDto user = userDao.getUser(userId);
		return user;
	}

	@Override
	public UserDto getUserByNickname(String userNickname) {
		UserDto user = userDao.getUserByNickname(userNickname);
		return user;
	}

	@Override
	public boolean idCheck(UserDto userDto) {
		boolean idCheck = false;
		
		UserDto user = userDao.getUser(userDto.getUserId());
		if(user != null) {
			if(user.getUserPassword().equals(userDto.getUserPassword())) {
				idCheck = true;
			}
		}
		return idCheck;
	}

	@Override
	public UserDto findUserId(UserDto user) {
		UserDto result = userDao.findUserId(user);
		return result;
	}

	@Override
	public UserDto findUserPw(UserDto user) {
		UserDto result = userDao.findUserPw(user);
		return result;
	}

	@Override
	public int updateUserPw(UserDto user) {
		int result = userDao.updateUserPw(user);
		return result;
	}


	@Override
	public String updateUserInformation(UserDto user) {
		
		String msg = "fail";
		
		boolean check1 = false;
		boolean check2 = false;
		
		//전화번호로 찾기 
		UserDto phoneCheck = userDao.getUserByPhone(user.getUserPhone());
		if(phoneCheck != null) {
			if(user.getUserId().equals(phoneCheck.getUserId())) {
				check1 = true;
			}
			msg = "exists";
		}else {
			check1 = true;
		}
		
		//이메일로 찾기
		UserDto emailCheck = userDao.getUserByEmail(user.getUserEmail());
		if(emailCheck != null) {
			if(user.getUserId().equals(emailCheck.getUserId())) {
				check2 = true;
			}
			msg = "exists";
		}else {
			check2 = true;
		}
		
		if(check1 && check2) {
			msg = "success";
			userDao.updateUserInfomation(user);
		}
		return msg;
	}

	
}
