package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResumeDto;

public interface IAToRBookmarksServiceHyepin {

	public List<ResumeDto> getBookmarkAToRList(int applicationNum);
	public int insertBookmark(String applicationNum, String resumeNum);
	public int deleteBookmark(String applicationNum, String resumeNum);
	
	
}
