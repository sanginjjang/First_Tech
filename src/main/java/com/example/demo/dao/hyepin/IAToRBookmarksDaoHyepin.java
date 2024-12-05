package com.example.demo.dao.hyepin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.ResumeDto;

@Mapper
public interface IAToRBookmarksDaoHyepin {

	public List<ResumeDto> getBookmarkAToRList(int applicationNum);
	public int insertBookmark(@Param("applicationNum") String applicationNum, @Param("resumeNum") String resumeNum);
	public int deleteBookmark(@Param("applicationNum") String applicationNum, @Param("resumeNum") String resumeNum);
	
	
	
}
