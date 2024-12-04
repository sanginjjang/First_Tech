package com.example.demo.controller.joontaek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.IApplicantService;


@Controller
@RequestMapping("/applicant")
public class ApplicantController {
	
	//@Autowired
	//IApplicantService applicantService;

	/*<select id="getApplicantList" resultType="com.example.demo.dto.ResumeApplyStatusDto">
	SELECT * FROM ResumeApplyStatus WHERE applicationNum = #{applicationNum}
</select>*/
	
	@RequestMapping("/applicantManage")
	public String applicantManage(@RequestParam("applicationNum")int applicationNum) {
		
		System.out.println(applicationNum);
		System.out.println(applicationNum);
		System.out.println(applicationNum);
		System.out.println(applicationNum);
		
		
		
		
		return "/taek/applicant";
	}
}
