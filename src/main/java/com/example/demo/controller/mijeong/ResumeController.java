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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.InternshipDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.ResumeFileDto;
import com.example.demo.dto.UserCertificateDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserResumeApplyStatus;
import com.example.demo.dto.UserTechStackDto;
import com.example.demo.service.mijeong.ResumeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
@RequestMapping("/resume")
public class ResumeController {

	@Autowired
	private ResumeService resumeservice;


	@Value("${spring.servlet.multipart.location:./uploads}")
	private String uploadPath;

	
	@RequestMapping("/MyResumeForm")
	public String MyResumeForm(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		UserDto user = (UserDto) session.getAttribute("user"); 
		user.toString();
		model.addAttribute("user", user);
		return "/resume/MyResumeForm";
	}
	
	
	@RequestMapping("/resumeForm")
	public String getResumeUser(@SessionAttribute("user") UserDto user,
								ResumeFileDto resumefiledto, Model model) {
		String userId =user.getUserId();
		model.addAttribute("user", userId);
		
		
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
		resumedto.setEducation(resumefiledto.getEducation());///// 이넘..
		resumedto.setSchool(resumefiledto.getSchool());
		resumedto.setAddress(resumefiledto.getAddress());
		resumedto.setMilitaryService(resumefiledto.getMilitaryService()); ///// 이넘..
		resumedto.setCreatedDate(resumefiledto.getCreatedDate());
		resumedto.setUpdatedDate(resumefiledto.getUpdatedDate());
		resumedto.setRoleId(resumefiledto.getRoleId());
		resumedto.setUserId(userId); 
		resumeservice.insertResume(resumedto); 
		Integer resumeNum = resumedto.getResumeNum(); 
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
			careerDto.setResumeNum(resumeNum);
			careerDto.setCareer(career.get(i)); 
			careerDto.setCareerName(resumefiledto.getCareerName().get(i)); 
			careers.add(careerDto); 
			System.out.println("Careers: " + careers); 
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
		    System.out.println("internships: " + careers);
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
		    System.out.println("userCertificate: " + userCertificates); 
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
		    System.out.println("userTechStack: " + userTechStackdto); 
		} 
	  resumeservice.insertTechStack(userTeckStack);
		return"redirect:/resume/MyResumeList";
	}
		
		
	@GetMapping("/certificate")
    @ResponseBody
    public CertificateDto getCertificateInfo(@RequestParam("SerchCertificateName") String SerchCertificateName) {
	
		CertificateDto certificate	=resumeservice.getCertificateByName(SerchCertificateName);
		
		if (certificate != null) {
	        return certificate; 
	    } else {
	        return null;  
	    }
    }
	
	
	@RequestMapping("/MyResumeList")
    public String MyResumeList1(HttpSession session, Model model) {
	   UserDto user = (UserDto) session.getAttribute("user");
	   System.out.println(user + "!!!!");
	   String userId =user.getUserId();
       List<ResumeDto> resumelist = resumeservice.getResumeList(userId);
	   model.addAttribute("user", user);
       model.addAttribute("resumelist",resumelist);
       return "/resume/MyResumeList";
    }
    
    
    @RequestMapping("/deleteResume")
    public String deleteResume(@RequestParam("resumeNum") int resumeNum) {
        System.out.println("삭제할 resumeNum: " + resumeNum); 
        resumeservice.deleterResume(resumeNum);
        return "/sangin/main"; 
    }
    
    @RequestMapping("/resumeApplyList")
    public String resumeApplyList(@SessionAttribute("user") UserDto user, RedirectAttributes redirectAttributes) {
    	System.out.println("user" +user);
    	String userId = user.getUserId();
    	redirectAttributes.addFlashAttribute("userId", userId);
        return "redirect:/resume/getResumeApplyList";  
    }
  
    @RequestMapping("/getResumeApplyList")
    public String getResumeApplyList(@SessionAttribute("user") UserDto user, Model model) {
    	String userId = user.getUserId();
        System.out.println("userId: " + userId);
        List<UserResumeApplyStatus> resumeApplyList = resumeservice.getResumeApplyList(userId);
        System.out.println("resumeApplyList!!!" + resumeApplyList);
        model.addAttribute("resumeApplyList", resumeApplyList);
        return "resume/resumeApplyList"; 
    }
    
		

}
