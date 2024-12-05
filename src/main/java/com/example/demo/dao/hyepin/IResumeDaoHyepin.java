package com.example.demo.dao.hyepin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.ResumeDto;

@Mapper
public interface IResumeDaoHyepin {
	
	public List<ResumeDto> getResumeList(int applicationNum);
	public int getResumeListCount(int applicationNum);  // 전체 이력서 개수
	public List<ResumeDto> getResumeListPaging(@Param("applicationNum") int applicationNum,
											   @Param("startIdx") int startIdx, 
											   @Param("itemsPerPage") int itemsPerPage);
	
}
