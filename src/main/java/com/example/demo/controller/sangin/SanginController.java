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
import com.example.demo.service.sangin.BookmarkedApplicationService;
import com.example.demo.service.sangin.CompanyApplicationManagementService;

@Controller
@RequestMapping("/sangin")
public class SanginController {
	@Autowired
	ApplicationService applicationService;
	@Autowired
	BookmarkedApplicationService bookmarkedApplicationService;
	@Autowired
	CompanyApplicationManagementService companyApplicationService;
	// 메인은 상인 템플릿의 sum으로 갑니다
	@RequestMapping("/")
	String main() {
		return "sangin/sum";
	}
	// 공고 리스트 페이지
	@RequestMapping("/applicationsForm")
	String applicationsForm(Model model) {
		System.out.println("공고 페이지로 들어갑니다~~");
		//전체 공고랑 북마크 된 공고
		List<ApplicationDto> applicationList = applicationService.getApplicationList("user001");
		//기업 북마크
		List<String> companyList = applicationService.getBookmarkedCompany("user001");
		System.out.println("applicationList = " + applicationList);
		model.addAttribute("applicationList", applicationList);
		model.addAttribute("companyList", companyList);

		return "sangin/applicationsForm";
	}
	// 공고 상세 정보 페이지
	@RequestMapping("/applicationDetailForm/{applicationNum}")
	public String applicationDetailForm(@PathVariable("applicationNum") int applicationNum, Model model) {
		System.out.println("디테일 들어오는 것엔 문제가 없습니다");//확인 완료
		System.out.println("Application Number: " + applicationNum);
		ApplicationDto application = applicationService.getApplication(applicationNum);
		application.toString();
		List<String> companyList = applicationService.getBookmarkedCompany("user001");
		model.addAttribute("jobApplication", application);
		model.addAttribute("companyList", companyList);
		return "sangin/applicationDetailForm";
	}
	//관심 공고 페이지
	@RequestMapping("/bookmarkedApplicationsForm")
	public String bookmarkedApplicationsForm(Model model) {
		//세션에서 유저 정보를 받아와야합니다 //일단은 여기서 유저 번호를 임의로 지정합니다
		System.out.println("관심 공고 들어오는 것엔 문제가 없습니다");//확인 완료
		String userId = "user001";
		List<ApplicationDto> applicationList = bookmarkedApplicationService.getBookmarkedApplicationList(userId);
		List<String> companyList = applicationService.getBookmarkedCompany(userId);
		model.addAttribute("applicationList", applicationList);
		model.addAttribute("companyList", companyList);
		return "/sangin/bookmarkedApplicationsForm";
	}
	//인재풀
	@RequestMapping("/resumePoolForm")
	String resumePoolForm() {
		return "sangin/resumePoolForm";
	}

	// 공고 북마크 추가
	@RequestMapping("/addHeart")
	@ResponseBody
	String addHeart(@RequestBody UserToApplicationBookmarkDto dto) {
		System.out.println("addHeart...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("applicationNum = " + dto.getApplicationNum());

		applicationService.addHeart(dto);
		return "공고 북마크 추가 성공";
	}
	// 공고 북마크 제거
	@RequestMapping("/removeHeart")
	@ResponseBody
	String removeHeart(@RequestBody UserToApplicationBookmarkDto dto) {
		System.out.println("removeHeart...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("applicationNum = " + dto.getApplicationNum());
		applicationService.removeHeart(dto);
		return "공고 북마크 제거 성공";
	}
	// 기업 북마크 추가
	@RequestMapping("/addStar")
	@ResponseBody
	String addStar(@RequestBody UserToCompanyBookmarkDto dto) {
		System.out.println("addStar...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("CompanyId = " + dto.getCompanyId());
		applicationService.addStar(dto);
		return "기업 북마크 추가 성공";
	}
	// 기업 북마크 제거
	@RequestMapping("/removeStar")
	@ResponseBody
	String removeStar(@RequestBody UserToCompanyBookmarkDto dto) {
		System.out.println("removeStar...");
		System.out.println("userId = " + dto.getUserId());
		System.out.println("CompanyId = " + dto.getCompanyId());
		applicationService.removeStar(dto);
		return "기업 북마크 제거 성공";
	}
	// 기업 공고 관리 폼
	@RequestMapping("/companyApplicationManagementForm")
	String companyApplicationManagementForm(Model model) {
		String companyId = "comp001";
		List<ApplicationDto> companyApplication = companyApplicationService.companyApplicationList(companyId);
		model.addAttribute("companyApplication", companyApplication);
		return "sangin/companyApplicationManagementForm";
	}
	// 기업 공고 작성 폼
	@RequestMapping("/insertApplicationForm")
	String insertApplicationForm() {
		// 기업 번호를 받아와야 할 것이에요
		return "sangin/insertApplicationForm";
	}
}
