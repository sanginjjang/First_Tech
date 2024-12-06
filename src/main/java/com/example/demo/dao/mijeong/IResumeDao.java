package com.example.demo.dao.mijeong;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.InternshipDto;
import com.example.demo.dto.JobRoleDto;
import com.example.demo.dto.ResumeApplyStatusDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.ResumeFileDto;
import com.example.demo.dto.TechStackDto;
import com.example.demo.dto.UserCertificateDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserResumeApplyStatus;
import com.example.demo.dto.UserTechStackDto;

@Mapper
public interface IResumeDao {

	public int insertResume(ResumeDto resume);

	public UserDto getuserId(String userId);

	public void insertInternship(@Param("internships") List<InternshipDto> internships);

	public void insertCareer(@Param("careers")List<CareerDto> careers);
	
	public void insertCertificate(@Param("usercertificates")List<UserCertificateDto> usercertificates);
	
	public void insertJobRole(@Param("jobroles")List<JobRoleDto> jobRoles);
	
	public void insertTechStack(@Param("usertechStacks")List<UserTechStackDto> usertechStacks);

	public CertificateDto getCertificateByName(String SerchCertificateName);

	public List<ResumeDto> getResumeList();

	public int deleteResume(int resumeNum);

	public List<UserResumeApplyStatus> getResumeApply(@Param("resumeNum") int resumeNum);
	
	
	
	
}
