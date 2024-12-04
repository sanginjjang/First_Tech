package com.example.demo.controller.joontaek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;
import com.example.demo.service.ICompanyService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/c")
public class CompanyController {
	
	@Value("${app.page.amount}")
	private int amount = 5;
	
	@Autowired
	ICompanyService companyService;
	
	@RequestMapping("/companyInfo/{pageNum}")
	public String companyInfo(@PathVariable("pageNum")int pageNum,Model model,HttpServletRequest request) {
		int startNum = pageNum * amount - amount;
//		List<CompanyDto> companys = companyService.getCompanyListPaging(startNum, amount); //기업 전체 목록 조회
		int totalCnt = companyService.getCount();
		int endPageNum = Math.ceilDiv(totalCnt, amount);
		
		List<UserToCompanyBookmarkDto> bookmarks = companyService.getUserToCompanyBookmark(user.getUserId());
		List<CompanyDto> companys = companyService.testBookmark(startNum, amount, user.getUserId());
//		
		model.addAttribute("bookmarks",bookmarks);
		model.addAttribute("companys",companys);
		model.addAttribute("currentPageNum",pageNum);
		model.addAttribute("endPageNum",endPageNum);
	
		
		
		
		return "taek/companyInfo";
	}
	
	@RequestMapping("/companyDetail/{companyName}")
	public String companyDetail(@PathVariable("companyName")String companyName,Model model) {
		
		
		
		CompanyDto company = companyService.getCompany(companyName);
		String companyId = company.getCompanyId();
		RatingDto rating = companyService.companyRating(companyId);
		
		model.addAttribute("rating",rating);
		model.addAttribute("company",company);
		
		return "taek/companyDetail";
	}
	
	@PostMapping("/addBookmark")
	@ResponseBody
	public List<UserToCompanyBookmarkDto> addBookMark(@RequestParam("userId")String userId, @RequestParam("companyId")String companyId) {
		
		
		companyService.regUserToCompanyBookmark(userId, companyId);
		List<UserToCompanyBookmarkDto> bookmarks = companyService.getUserToCompanyBookmark(userId);
		

		
		return bookmarks;
	}
	
	@PostMapping("/removeBookmark")
	@ResponseBody
	public List<UserToCompanyBookmarkDto> removeBookmark(@RequestParam("userId")String userId,@RequestParam("companyId")String companyId){
		companyService.removeUserToCompanyBookmark(userId, companyId);
		List<UserToCompanyBookmarkDto> bookmarks = companyService.getUserToCompanyBookmark(userId);
		

		
		return bookmarks;
	}
	
	
}
