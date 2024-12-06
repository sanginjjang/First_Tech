package com.example.demo.service.mijeong;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mijeong.IResumeDao;
import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.InternshipDto;
import com.example.demo.dto.JobRoleDto;
import com.example.demo.dto.ResumeApplyStatusDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.UserCertificateDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserResumeApplyStatus;
import com.example.demo.dto.UserTechStackDto;

@Service
public class ResumeService  implements IResumeService{

	@Autowired
	IResumeDao resumeMapper;


	@Override
	public UserDto getuserId(String userId) {
		UserDto user = resumeMapper.getuserId(userId);
		return user;
	}
	
	
	// 이력서 등록
	public void insertResume(ResumeDto resume) {
		resumeMapper.insertResume(resume);
	}
	//경력 등록 
	public void insertCareer(List<CareerDto> careers) {
		resumeMapper.insertCareer(careers);
	}
	
	
	
	public void insertInternship(List<InternshipDto> internships) {
		resumeMapper.insertInternship(internships);

	}
	
	public void insertCertificate(List<UserCertificateDto> usercertifiate) {
		resumeMapper.insertCertificate(usercertifiate);
	}

	
	public void insertJobRole(List<JobRoleDto> jobRoles) {
		resumeMapper.insertJobRole(jobRoles);
	}
	
	public void insertTechStack(List<UserTechStackDto> usertechStacks) {
		resumeMapper.insertTechStack(usertechStacks);
	}


	public CertificateDto getCertificateByName(String SerchCertificateName) {
		return resumeMapper.getCertificateByName(SerchCertificateName);
	}

	public List<ResumeDto> getResumeList(String userId) {
		return resumeMapper.getResumeList(userId);
	}

	public int deleterResume(int resumeNum) {
		return resumeMapper.deleteResume(resumeNum);
	}


	public List<UserResumeApplyStatus> getResumeApplyList(String userId) {
		return resumeMapper.getResumeApply(userId);
	};
	

	
	
	
}
