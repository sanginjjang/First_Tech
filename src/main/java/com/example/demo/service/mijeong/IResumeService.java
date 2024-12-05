package com.example.demo.service.mijeong;


import com.example.demo.dto.CareerDto;
import com.example.demo.dto.InternshipDto;
import com.example.demo.dto.JobRoleDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.TechStackDto;
import com.example.demo.dto.UserCertificateDto;
import com.example.demo.dto.UserDto;

public interface IResumeService {

	public UserDto getuserId(String userid);
	
}
