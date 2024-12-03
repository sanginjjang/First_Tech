package com.example.demo.dao.hyepin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserDto;

@Mapper
public interface IUserDao {

	public List<UserDto> getUserList();
	public UserDto getUser(String userId);
	public UserDto getUserByNickname(String userNickname);
	public int insertUser(UserDto user);
	public UserDto userLogin(String userId, String userPassword);
}
