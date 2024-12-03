package com.example.demo.controller.sangin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.UserToApplicationBookmarkDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;
import com.example.demo.service.sangin.ApplicationService;

@Controller
@RequestMapping("/sangin")
public class SanginController {
	@Autowired
	ApplicationService applicationService;

	@RequestMapping("/")
	String main() {
		return "sangin/sum";
	}

	@RequestMapping("/applicationsForm")
	String applicationsForm(Model model) {
		System.out.println("공고 페이지로 들어갑니다~~");
		List<ApplicationDto> applicationList = applicationService.getApplicationList("user001");
		List<String> companyList = applicationService.getBookmarkedCompany("user001");
		System.out.println("applicationList = " + applicationList);
		model.addAttribute("applicationList", applicationList);
		model.addAttribute("companyList", companyList);

		return "sangin/applicationsForm";
	}

	@RequestMapping("/applicationDetailForm/{applicationNum}")
	public String applicationDetailForm(@PathVariable("applicationNum") int applicationNum, Model model) {
		System.out.println("디테일 들어오는 것엔 문제가 없습니다");
		System.out.println("Application Number: " + applicationNum);
		ApplicationDto application = applicationService.getApplication(applicationNum);
		application.toString();
		List<String> companyList = applicationService.getBookmarkedCompany("user001");
		model.addAttribute("jobApplication", application);
		model.addAttribute("companyList", companyList);
		return "sangin/applicationDetailForm";
	}

	// heart, star == 북마크

	@RequestMapping("/addHeart")
	@ResponseBody
	String addHeart(@RequestBody UserToApplicationBookmarkDto dto) {
		System.out.println("addHeart...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("applicationNum = " + dto.getApplicationNum());

		applicationService.addHeart(dto);
		return "공고 북마크 추가 성공";
	}

	@RequestMapping("/removeHeart")
	@ResponseBody
	String removeHeart(@RequestBody UserToApplicationBookmarkDto dto) {
		System.out.println("removeHeart...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("applicationNum = " + dto.getApplicationNum());
		applicationService.removeHeart(dto);
		return "공고 북마크 제거 성공";
	}

	@RequestMapping("/addStar")
	@ResponseBody
	String addStar(@RequestBody UserToCompanyBookmarkDto dto) {
		System.out.println("addStar...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("CompanyId = " + dto.getCompanyId());
		applicationService.addStar(dto);
		return "기업 북마크 추가 성공";
	}

	@RequestMapping("/removeStar")
	@ResponseBody
	String removeStar(@RequestBody UserToCompanyBookmarkDto dto) {
		System.out.println("removeStar...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("CompanyId = " + dto.getCompanyId());
		applicationService.removeStar(dto);
		return "기업 북마크 제거 성공";
	}
}
