package com.example.demo.controller.mijeong;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.InternshipDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.ResumeFileDto;
import com.example.demo.dto.UserCertificateDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserTechStackDto;
import com.example.demo.service.mijeong.ResumeService;

@Controller
@RequestMapping("/resume")
public class ResumeController {

	@Autowired
	private ResumeService resumeservice;

	// 업로드 디렉토리 경로
	@Value("${file.upload-dir}")
	private String uploadPath;

	
	@RequestMapping("/MyResumeForm/{userId}")
	public String MyResumeForm(@PathVariable("userId") String userId, Model model) {
		UserDto user = resumeservice.getuserId(userId);
		model.addAttribute("user", user);
		return "/resume/MyResumeForm";
	}

	// 이력서 제출 처리 메서드
	@RequestMapping("/resumeForm")
	public String getResumeUser(@RequestParam("userId") String userId,
								ResumeFileDto resumefiledto, Model model) {
			
		// 파일쓰기
		MultipartFile file = resumefiledto.getPortfolioName();
		String filenameport = file.getOriginalFilename();

		File uploadFile = new File(uploadPath + filenameport);

		try {
			file.transferTo(uploadFile);

		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		MultipartFile filephoto = resumefiledto.getPersonalPhotoName();
		String filenamephoto = filephoto.getOriginalFilename();
	

		File uploadFilephoto = new File(uploadPath + filenamephoto);
	
		try
		{
			filephoto.transferTo(uploadFilephoto);
	
		}catch(IllegalStateException|IOException e){
			e.printStackTrace();
		}
	
		ResumeDto resumedto = new ResumeDto();
		resumedto.setUserId(resumefiledto.getUserId());
		resumedto.setResumeTitle(resumefiledto.getResumeTitle());
		resumedto.setResumeContent(resumefiledto.getResumeContent());
		resumedto.setPortfolioName(filenameport); 
		resumedto.setPersonalPhotoName(filenamephoto);
		resumedto.setEducation(resumefiledto.getEducation());
		resumedto.setSchool(resumefiledto.getSchool());
		resumedto.setAddress(resumefiledto.getAddress());
		resumedto.setMilitaryService(resumefiledto.getMilitaryService());
		resumedto.setCreatedDate(resumefiledto.getCreatedDate());
		resumedto.setUpdatedDate(resumefiledto.getUpdatedDate());
		resumedto.setRoleId(resumefiledto.getRoleId());
		resumedto.setUserId(userId); // 사용자 ID 설정
		resumeservice.insertResume(resumedto); // 이력서 저장
		Integer resumeNum = resumedto.getResumeNum(); // 생성된 PK 가져오기
		System.out.println("sdfsdfsdf"+resumeNum);

		
		
		
		
		
		
		//경력저장
		List<String> career = resumefiledto.getCareer();
		if(career==null)
		{
			career = new ArrayList<>();
		}
		 
		List<CareerDto> careers = new ArrayList<>();
		for (int i = 0; i < career.size(); i++) {
			CareerDto careerDto = new CareerDto();
			careerDto.setResumeNum(resumeNum); // 경력에 설정
			careerDto.setCareer(career.get(i)); // 경력 기간 설정
			careerDto.setCareerName(resumefiledto.getCareerName().get(i)); // 경력 회사명 설정
			careers.add(careerDto); // 리스트에 CareerDto 추가
			System.out.println("Careers: " + careers); // careers 리스트 내용 확인
		}
		resumeservice.insertCareer(careers);
		
		
		// 인턴십 정보 저장
		System.out.println("인터쉽쉽쉽" +resumefiledto.getInternshipName());
		List<String> InternshipDto = resumefiledto.getInternshipName();
		if(InternshipDto==null)
		{
			InternshipDto = new ArrayList<>();
		}
		List<InternshipDto> internships = new ArrayList<>();
		for(int i = 0;i<InternshipDto.size();i++)
		{
			InternshipDto internship = new InternshipDto();
		    internship.setResumeNum(resumeNum);
		    internship.setInternshipPeriod(resumefiledto.getInternshipPeriod().get(i)); // 인턴십 기간
		    internship.setInternshipName(resumefiledto.getInternshipName().get(i)); // 인턴십 이름
		    internship.setInternshipDetails(resumefiledto.getInternshipDetails().get(i)); // 인턴십 내용
		    internship.setStartDate(resumefiledto.getStartDate().get(i)); // 시작 날짜
		    internship.setEndDate(resumefiledto.getEndDate().get(i)); // 종료 날짜
		    internships.add(internship);
		    System.out.println("internships: " + careers); // careers 리스트 내용 확인
		} 
		resumeservice.insertInternship(internships);
	
		
		
		//자격증 정보 ㅇㅇ 저장 
		List<String> certificateDto = resumefiledto.getCertificateName();
		
		if(certificateDto==null)
		{
			certificateDto = new ArrayList<>();
		}
		
		List<UserCertificateDto> userCertificates = new ArrayList<>();
		for(int i = 0;i<certificateDto.size();i++)
		{
			UserCertificateDto userCertificate = new UserCertificateDto();
			userCertificate.setResumeNum(resumeNum);
			userCertificate.setCertificateNum(resumefiledto.getCertificateNum());
			Date certificateDate = resumefiledto.getCertificateDate();
		    userCertificate.setCertificateDate(certificateDate);
		    userCertificates.add(userCertificate);
		    System.out.println("userCertificate: " + userCertificates); // userCertificates 리스트 내용 확인
		} 
		resumeservice.insertCertificate(userCertificates);
		
		
	 
		
	  String[] techsteck = resumefiledto.getTechStackNum();
	  System.out.println(techsteck + "넘넘넘 기술 스택 넘넘넘");
	  List<UserTechStackDto> userTeckStack = new ArrayList<>();
	  for(int i = 0;i<techsteck.length;i++)
		{
			UserTechStackDto userTechStackdto = new UserTechStackDto();
			userTechStackdto.setResumeNum(resumeNum);
			userTechStackdto.setTechStackNum(Integer.parseInt(techsteck[i]));
			userTeckStack.add(userTechStackdto);
		    System.out.println("userTechStack: " + userTechStackdto); // userCertificates 리스트 내용 확인
		} 
	  resumeservice.insertTechStack(userTeckStack);
		return"redirect:/resume/MyResumeList";
	}
		
		
	@GetMapping("/certificate")
    @ResponseBody
    public CertificateDto getCertificateInfo(@RequestParam("SerchCertificateName") String SerchCertificateName) {
	
		CertificateDto certificate	=resumeservice.getCertificateByName(SerchCertificateName);
		
		if (certificate != null) {
	        return certificate;  // 자격증 정보가 있으면 반환
	    } else {
	        return null;  // 정보가 없으면 null 반환
	    }
    }
		
	@RequestMapping("/MyResumeList")
    public String MyResumeList(Model model) {
       List<ResumeDto> resumelist = resumeservice.getResumeList();
       model.addAttribute("resumelist",resumelist);
       return "resume/MyResumeList";
    }
    
    
    @RequestMapping("/deleteResume")
    public String deleteResume(@RequestParam("resumeNum") int resumeNum) {
        System.out.println("삭제할 resumeNum: " + resumeNum); 
        resumeservice.deleterResume(resumeNum);
        return "redirect:/resume/MyResumeList"; 
    }
    

		

}
