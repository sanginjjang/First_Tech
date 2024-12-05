package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResumeDto;

public interface IResumeServiceHyepin {

	public List<ResumeDto> getResumeList(int applicationNum);
	public int getResumeListCount(int applicationNum);  // 전체 이력서 개수
	public List<ResumeDto> getResumeListPaging(int applicationNum, int startIdx, int itemsPerPage);
}
