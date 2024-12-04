package com.example.demo.controller.sangin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.UserToApplicationBookmarkDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;
import com.example.demo.service.sangin.ApplicationService;
import com.example.demo.service.sangin.BookmarkedApplicationService;
import com.example.demo.service.sangin.CompanyApplicationManagementService;
import com.example.demo.vo.joontaek.BoardVo;

@Controller
@RequestMapping("/sangin")
public class SanginController {
	@Value("${spring.servlet.multipart.location:./uploads}")
	private String uploadPath;
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
		model.addAttribute("companyId", companyId);
		return "sangin/companyApplicationManagementForm";
	}
	// 기업 공고 작성 폼
	@RequestMapping("/insertApplicationForm/{companyId}")
	String insertApplicationForm(@PathVariable("companyId") String companyId, Model model) {
		// 기업 번호를 받아왔어요~
		System.out.println("기업공고 작성 함수 시랭...");
		System.out.println(companyId);
		model.addAttribute("companyId", companyId);
		return "sangin/insertApplicationForm";
	}
	@RequestMapping("/insertApplications")
	public String insertApplication(@RequestParam("file") MultipartFile paramFile, ApplicationDto dto) {
		System.out.println("Uploaded file: " + paramFile.getOriginalFilename());
		//1. multipart 파일 객체 받고
		//2. 파일 네임 따로 뽑고
		//3. file 객체에 경로랑 이름 저장
		//4. 이동하는데 오류 처리
		MultipartFile file = paramFile;
		String fileName = file.getOriginalFilename();
		File uploadFile = new File(uploadPath + fileName);
		
		try {
			file.transferTo(uploadFile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("12:40 시작");
		System.out.println("14:40");
		System.out.println("14:50 시작");
		System.out.println(dto.toString());
		dto.setFileName(fileName);//파일 네임도 dto 에 넣어서 데이터 베이스로 보내기
		System.out.println("파일 네임 테스트 합니다 15:37");
		System.out.println(fileName);
		System.out.println("파일 네임 테스트 합니다 15:37");
		int result = companyApplicationService.insertApplication(dto);
		if(result == 1) {
			System.out.println("공고 등록 성공");
			System.out.println("15:?? 해결");
		}else {
			System.out.println("공고 등록 실패");
		}
	    return "sangin/sum";
	}

}
