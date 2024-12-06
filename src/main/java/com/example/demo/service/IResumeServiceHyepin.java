package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.TechStackDto;
import com.example.demo.vo.hyepin.ResumeVo;

public interface IResumeServiceHyepin {

	public List<ResumeDto> getResumeList(int applicationNum);
	public int getResumeListCount(int applicationNum);  // 전체 이력서 개수
	public List<ResumeDto> getResumeListPaging(int applicationNum, int startIdx, int itemsPerPage);
	public ResumeVo getResumeDetail(int resumeNum);
	public List<CertificateDto> getCertificateList(int resumeNum);
	public List<CareerDto> getCareerList(int resumeNum);
	public List<TechStackDto> getTechStackList(int resumeNum);
	
}
