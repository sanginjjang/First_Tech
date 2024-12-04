package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;

public interface IUserService {

	public List<UserDto> getUserList();
	public UserDto getUser(String userId);
	public UserDto getUserByNickname(String userNickname);
	public int insertUser(UserDto user);
	public boolean idCheck(UserDto user);
	public UserDto findUserId(UserDto user);
	public UserDto findUserPw(UserDto user);
	public int updateUserPw(UserDto user);
	
	public String updateUserInformation(UserDto user);
	
}
