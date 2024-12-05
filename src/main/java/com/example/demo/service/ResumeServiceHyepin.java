package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.hyepin.IResumeDaoHyepin;
import com.example.demo.dto.ResumeDto;

@Service
public class ResumeServiceHyepin implements IResumeServiceHyepin{

	@Autowired
	IResumeDaoHyepin resumeDao;

	@Override
	public List<ResumeDto> getResumeList(int applicationNum) {
		//리스트 받아오기 
		List<ResumeDto> resumeList = resumeDao.getResumeList(applicationNum);
		return resumeList;
	}

	@Override
	public int getResumeListCount(int applicationNum) {
		int count = resumeDao.getResumeListCount(applicationNum);
		return count;
	}

	@Override
	public List<ResumeDto> getResumeListPaging(int applicationNum, int startIdx, int itemsPerPage) {
		List<ResumeDto> resumeList = resumeDao.getResumeListPaging(applicationNum, startIdx, itemsPerPage);
		return resumeList;
	}
	
}
