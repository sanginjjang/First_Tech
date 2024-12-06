package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.hyepin.IResumeDaoHyepin;
import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.TechStackDto;
import com.example.demo.vo.hyepin.ResumeVo;

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

	@Override
	public ResumeVo getResumeDetail(int resumeNum) {
		//이력서 번호로 유저 ID 받아오겠습니다...
		String userId = resumeDao.getUserIdByResumeNum(resumeNum);
		//이력서 번호랑 유저 ID로 이력서 정보 얻어오겠습니다..
		ResumeVo resume = resumeDao.getResumeDetail(resumeNum, userId);
		return resume;
	}

	@Override
	public List<CertificateDto> getCertificateList(int resumeNum) {
		//자격증
		List<CertificateDto> cList = resumeDao.getCertificateList(resumeNum);
		return cList;
	}

	@Override
	public List<CareerDto> getCareerList(int resumeNum) {
		//경력
		List<CareerDto> careerList = resumeDao.getCareerList(resumeNum);
		return careerList;
	}

	@Override
	public List<TechStackDto> getTechStackList(int resumeNum) {
		//기술 스택
		List<TechStackDto> techStackList = resumeDao.getTechStackList(resumeNum);
		return techStackList;
	}
	
}
