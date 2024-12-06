package com.example.demo.controller.hyepin;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.CompanyDto;
import com.example.demo.service.ICompanyServiceHyepin;
import com.example.demo.vo.hyepin.MainApplicationVo;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/hyepin")
public class MainHyepinController {

	@Autowired
	ICompanyServiceHyepin companyService;
	
	@RequestMapping("/mainHyepin")
	public String mainHyepin(Model model) {
		List<MainApplicationVo> aList = companyService.getMainApplications();
		ArrayList<LocalDateTime> deadlineDate = new ArrayList<>();
		// 오늘 날짜
		LocalDateTime today = LocalDateTime.now();
		for(MainApplicationVo a : aList) {
			// Timestamp 객체를 LocalDateTime으로 변환
			 LocalDateTime deadlineDate_1 = a.getDeadlineDate().toLocalDateTime();
			 // 날짜 차이 계산 (일수)
			 int daysBetween = (int) ChronoUnit.DAYS.between(today, deadlineDate_1);
			 a.setDay(daysBetween);
		}
		model.addAttribute("aList", aList);
		return "/hyepin/mainHyepin";
	}
	
	@RequestMapping("/companyMain")
	public String companyMain(Model model, HttpSession session) {
		List<MainApplicationVo> aList = companyService.getMainApplications();
		ArrayList<LocalDateTime> deadlineDate = new ArrayList<>();
		// 오늘 날짜
		LocalDateTime today = LocalDateTime.now();
		for(MainApplicationVo a : aList) {
			// Timestamp 객체를 LocalDateTime으로 변환
			 LocalDateTime deadlineDate_1 = a.getDeadlineDate().toLocalDateTime();
			 // 날짜 차이 계산 (일수)
			 int daysBetween = (int) ChronoUnit.DAYS.between(today, deadlineDate_1);
			 a.setDay(daysBetween);
		}
		
		//세션에 값이 있을 경우 공고 테이블에 기업 ID에서 제일 처음 번호로 applicationNum 추가
		if(session.getAttribute("company") != null) {
			CompanyDto company = (CompanyDto) session.getAttribute("company");
			System.out.println("여기 세션 값");
			System.out.println(company);
			int applicationNum = companyService.getApplicationByCompanyId(company.getCompanyId());
			System.out.println("여기 공고 번호");
			System.out.println(applicationNum);
			model.addAttribute("applicationNum", applicationNum);
		}
		
		model.addAttribute("aList", aList);
		return "/hyepin/companyMain";
		
	}
}
