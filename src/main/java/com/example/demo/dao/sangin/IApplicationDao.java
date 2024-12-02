package com.example.demo.dao.sangin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.ApplicationDto;
@Mapper
public interface IApplicationDao {
	public List<ApplicationDto> getApplicationList();
}
