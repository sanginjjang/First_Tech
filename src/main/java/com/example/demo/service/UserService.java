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

	
}
