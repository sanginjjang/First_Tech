package com.example.demo.controller.hyepin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.TechStackDto;
import com.example.demo.service.IResumeServiceHyepin;
import com.example.demo.vo.hyepin.ResumeVo;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/hyepin")
public class ResumeControllerHyepin {
	
	@Autowired
	IResumeServiceHyepin resumeService;
	
	
	@RequestMapping("/resumeViewDetails/{applicationNum}/{resumeNum}")
	public String resumeViewDetails(@PathVariable("applicationNum") int applicationNum,
								  @PathVariable("resumeNum") int resumeNum,
								  Model model) {
		System.out.println("공고번호: " + applicationNum);
		System.out.println("이력서 번호:" +resumeNum);
		//공고 번호에 따른 이력서 리스트 출력
		List<ResumeDto> resumeList = resumeService.getResumeList(applicationNum);
		
		//이력서 번호로 이력서 정보 가지고 오기
		//ResumeVo 가져오는 service1
		ResumeVo resume = resumeService.getResumeDetail(resumeNum);
		System.out.println(resume);
		
		//자격증 리스트 가져오는 service2
		List<CertificateDto> certificateList = resumeService.getCertificateList(resumeNum);
		System.out.println("==============================");
		System.out.println("여기는 컨트롤러....");
		for(CertificateDto l : certificateList) {
			System.out.println(l);
		}
		
		//경력 리스트 가져오는 service3
		List<CareerDto> careerList = resumeService.getCareerList(resumeNum);
		System.out.println("==============================");
		System.out.println("여기는 경력 리스트....");
		for(CareerDto c : careerList) {
			System.out.println(c);
		}
		
		//기술스택 가져오는 service4
		List<TechStackDto> techStackList = resumeService.getTechStackList(resumeNum);
		System.out.println("==============================");
		System.out.println("여기는 기술스택 리스트....");
		for(TechStackDto t : techStackList) {
			System.out.println(t);
		}
		
		model.addAttribute("applicationNum", applicationNum);
		model.addAttribute("resumeList", resumeList);
		model.addAttribute("resume", resume);
		model.addAttribute("certificateList", certificateList);
		model.addAttribute("careerList", careerList);
		model.addAttribute("techStackList", techStackList);
		
		return "/hyepin/resumeViewDetails";
	}
	
	
	/*
	@RequestMapping("/resumeViewDetails")
	public void resumeViewDetails(Model model) {
		//공고 번호에 따른 이력서 리스트 출력
		List<ResumeDto> resumeList = resumeService.getResumeList(1);
		
		//이력서 번호로 이력서 정보 가지고 오기
		//ResumeVo 가져오는 service1
		ResumeVo resume = resumeService.getResumeDetail(1);
		System.out.println(resume);
		
		//자격증 리스트 가져오는 service2
		List<CertificateDto> certificateList = resumeService.getCertificateList(1);
		System.out.println("==============================");
		System.out.println("여기는 컨트롤러....");
		for(CertificateDto l : certificateList) {
			System.out.println(l);
		}
		
		//경력 리스트 가져오는 service3
		List<CareerDto> careerList = resumeService.getCareerList(1);
		System.out.println("==============================");
		System.out.println("여기는 경력 리스트....");
		for(CareerDto c : careerList) {
			System.out.println(c);
		}
		
		//기술스택 가져오는 service4
		List<TechStackDto> techStackList = resumeService.getTechStackList(1);
		System.out.println("==============================");
		System.out.println("여기는 기술스택 리스트....");
		for(TechStackDto t : techStackList) {
			System.out.println(t);
		}
		
		
		model.addAttribute("resumeList", resumeList);
		model.addAttribute("resume", resume);
		model.addAttribute("certificateList", certificateList);
		model.addAttribute("careerList", careerList);
		model.addAttribute("techStackList", techStackList);
	}
	*/
	
	
}
