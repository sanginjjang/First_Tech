package com.example.demo.controller.hyepin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.service.AToRBookmarksServiceHyepin;
import com.example.demo.service.ResumeServiceHyepin;
import com.example.demo.service.sangin.ApplicationService;
import com.example.demo.service.sangin.CompanyApplicationManagementService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/hyepin")
public class ApplicantController {
	
	@Autowired
	CompanyApplicationManagementService companyApplicationService;
	
	@Autowired
	ApplicationService applicationService;

	@Autowired
	ResumeServiceHyepin resumeService;
	
	@Autowired
	AToRBookmarksServiceHyepin bookmarksAToRServiceHyepin;
	
	/*
	@RequestMapping("/applicantManage/{applicationNum}")
	public String applicantManage(@PathVariable("applicationNum") int applicationNum, HttpSession session, Model model) {
		System.out.println("===================================");
		System.out.println("상인 -> 혜빈 페이지 넘어갑니다..");
		System.out.println("공고 번호: " + applicationNum);
		
		//회사번호로 공고 목록 가져오기
		//여기 원래 세션 해서 넘겨줘야하는거임!!!!!!!!!!!!!!!!!!!!!!!!!!!! 테스트 때문에 지워두겠음.
		//CompanyDto company = (CompanyDto) session.getAttribute("company");
		//List<ApplicationDto> companyApplication = companyApplicationService.companyApplicationList(company.getCompanyId());
		String companyId = "comp001";
		List<ApplicationDto> companyApplication = companyApplicationService.companyApplicationList(companyId);
		model.addAttribute("companyApplication", companyApplication);
		
		//공고 제목 추출..
		ApplicationDto application = applicationService.getApplication(applicationNum);
		model.addAttribute("applicationResult", application);
		
		//공고 번호로 이력서 목록 받아오기
		List<ResumeDto> resumeList = resumeService.getResumeList(applicationNum);
		model.addAttribute("resumeList", resumeList);
		
		//공고 번호로 북마크 리스트 추출
		List<ResumeDto> bookmarksResumeList = bookmarksAToRServiceHyepin.getBookmarkAToRList(applicationNum);
		model.addAttribute("bookmarksResumeList", bookmarksResumeList);
		System.out.println("============================");
		System.out.println("공고번호로 북마크 리스트 추출합니다...");
		for(ResumeDto l : bookmarksResumeList) {
			System.out.println(l);
		}
		
		return "/hyepin/applicantManage";
	}
	*/
	
	//공고별 이력서 북마크 등록
	@RequestMapping("/bookmarkReg/{applicationNum}/{resumeNum}")
	public @ResponseBody String bookmarkReg(@PathVariable("applicationNum") String applicationNum,
											@PathVariable("resumeNum") String resumeNum) {
		//공고번호 + 이력서 번호
		System.out.println("공고번호: " + applicationNum + "이력서 번호: " + resumeNum);
		String msg = "success";
		//success, fail
		int result = bookmarksAToRServiceHyepin.insertBookmark(applicationNum, resumeNum);
		if(result == 1) {
			msg = "success";
		}
		return msg;
	}
	
	//공고별 이력서 북마크 해제
	@RequestMapping("/bookmarkClear/{applicationNum}/{resumeNum}")
	public @ResponseBody String bookmarkClear(@PathVariable("applicationNum") String applicationNum,
											  @PathVariable("resumeNum") String resumeNum) {
		//공고번호 + 이력서 번호
		System.out.println("공고번호: " + applicationNum + "이력서 번호: " + resumeNum);
		String msg = "success";
		int result =  bookmarksAToRServiceHyepin.deleteBookmark(applicationNum, resumeNum);
		//success, fail
		if(result == 1) {
			msg = "success";
		}
		return msg;
	}
	
	//페이지네이션 구현
	@RequestMapping("/applicantManage/{applicationNum}/{pageNum}")
	public String applicantManage(@PathVariable("applicationNum") int applicationNum, 
								  @PathVariable("pageNum") int pageNum, 
								  HttpSession session, Model model) {
		System.out.println("===================================");
		System.out.println("상인 -> 혜빈 페이지 넘어갑니다..");
		System.out.println("공고 번호: " + applicationNum);
		
		//회사번호로 공고 목록 가져오기
		//여기 원래 세션 해서 넘겨줘야하는거임!!!!!!!!!!!!!!!!!!!!!!!!!!!! 테스트 때문에 지워두겠음.
		//CompanyDto company = (CompanyDto) session.getAttribute("company");
		//List<ApplicationDto> companyApplication = companyApplicationService.companyApplicationList(company.getCompanyId());
		String companyId = "comp001";
		List<ApplicationDto> companyApplication = companyApplicationService.companyApplicationList(companyId);
		model.addAttribute("companyApplication", companyApplication);
		
		//공고 제목 추출..
		ApplicationDto application = applicationService.getApplication(applicationNum);
		model.addAttribute("applicationResult", application);
		
		//페이지네이션에 따른 공고 번호로 이력서 목록 받아오기 
		int totalResumes = resumeService.getResumeListCount(applicationNum);  // 전체 이력서 개수
		int itemsPerPage = 10;  // 한 페이지에 보여줄 항목 수
		int totalPages = (int) Math.ceil((double) totalResumes / itemsPerPage);  // 총 페이지 수 계산
		    
	    int startIdx = (pageNum - 1) * itemsPerPage;  // 해당 페이지의 시작 인덱스
	    List<ResumeDto> resumeList = resumeService.getResumeListPaging(applicationNum, startIdx, itemsPerPage);
	    System.out.println("=======================");
	    System.out.println("이력서 리스트...");
	    for(ResumeDto l: resumeList) {
	    	 System.out.println(l);
	    }
	    model.addAttribute("resumeList", resumeList);
		
	    // 페이지네이션 관련 데이터
	    model.addAttribute("currentPage", pageNum); //현재 페이지
	    model.addAttribute("totalPages", totalPages); // 전체 페이지 수
	    
	    System.out.println("============");
	    System.out.println("currentPage: " + pageNum);
	    System.out.println("totalPages: " + totalPages);
	    
	    //공고 번호로 북마크 리스트 추출
		List<ResumeDto> bookmarksResumeList = bookmarksAToRServiceHyepin.getBookmarkAToRList(applicationNum);
		model.addAttribute("bookmarksResumeList", bookmarksResumeList);
		System.out.println("============================");
		System.out.println("공고번호로 북마크 리스트 추출합니다...");
		for(ResumeDto l : bookmarksResumeList) {
			System.out.println(l);
		}
		
		return "/hyepin/applicantManage";
	}
	
	
}
