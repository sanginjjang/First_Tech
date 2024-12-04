package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.taek.IApplicantDao;
import com.example.demo.dto.ResumeApplyStatusDto;

@Service
public class ApplicantService implements IApplicantService{

	//@Autowired
	//IApplicantDao applicantDao;
	
	
	/*@Override
	public List<ResumeApplyStatusDto> getApplicantList(int applicationNum) {
		
		List<ResumeApplyStatusDto> resumeApplyStatusList = applicantDao.getApplicantList(applicationNum);
		return resumeApplyStatusList;
	}*/

}
