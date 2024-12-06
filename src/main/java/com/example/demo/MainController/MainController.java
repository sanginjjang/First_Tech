package com.example.demo.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MainController {
<<<<<<< HEAD
=======
	
	@Autowired
	ICompanyServiceHyepin companyService;
	
>>>>>>> 43b4233bad2316f9d16124209ffb0d21c9082416
	@RequestMapping("/")
	String main(HttpServletRequest request) {
		// 모두가 같이 쓰는 즐거운 메인 페이지 ^^
<<<<<<< HEAD
		
=======
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
>>>>>>> 43b4233bad2316f9d16124209ffb0d21c9082416
		
		
		return "/sangin/main";
	}

}
