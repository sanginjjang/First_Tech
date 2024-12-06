package com.example.demo.controller.hyepin;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ICompanyServiceHyepin;
import com.example.demo.vo.hyepin.MainApplicationVo;

@Controller
@RequestMapping("/hyepin")
public class MainHyepinController {

	@Autowired
	ICompanyServiceHyepin cpmpanyService;
	
	@RequestMapping("/mainHyepin")
	public String mainHyepin(Model model) {
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
		return "/hyepin/mainHyepin";
	}
		
}
