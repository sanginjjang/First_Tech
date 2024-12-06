package com.example.demo.MainController;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserDto;
import com.example.demo.service.ICompanyServiceHyepin;
import com.example.demo.vo.hyepin.MainApplicationVo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class MainController {
	
	@Autowired
	ICompanyServiceHyepin cpmpanyService;
	
	@RequestMapping("/")
	String main(Model model) {
		
		// 모두가 같이 쓰는 즐거운 메인 페이지 ^^
		List<MainApplicationVo> aList = cpmpanyService.getMainApplications();
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
		
		
		return "/sangin/sum";
	}

}
