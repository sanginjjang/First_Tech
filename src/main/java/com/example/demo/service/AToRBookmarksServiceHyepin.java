package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.hyepin.IAToRBookmarksDaoHyepin;
import com.example.demo.dto.ResumeDto;

@Service
public class AToRBookmarksServiceHyepin implements IAToRBookmarksServiceHyepin{

	@Autowired
	IAToRBookmarksDaoHyepin iAToRBookmarksDaoHyepin;
	
	@Override
	public List<ResumeDto> getBookmarkAToRList(int applicationNum) {
		List<ResumeDto> bookmarksResumeList = iAToRBookmarksDaoHyepin.getBookmarkAToRList(applicationNum);
		return bookmarksResumeList;
	}

	@Override
	public int insertBookmark(String applicationNum, String resumeNum) {
		int result = iAToRBookmarksDaoHyepin.insertBookmark(applicationNum, resumeNum);
		return result;
	}

	@Override
	public int deleteBookmark(String applicationNum, String resumeNum) {
		int result = iAToRBookmarksDaoHyepin.deleteBookmark(applicationNum, resumeNum);
		return result;
	}

	
	
	
}
