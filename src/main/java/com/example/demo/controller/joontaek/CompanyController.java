package com.example.demo.controller.joontaek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;
import com.example.demo.dto.SearchCompanyEntityDto;
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
	public String companyInfo(@PathVariable("pageNum") int pageNum, Model model, HttpServletRequest request) {
		int startNum = pageNum * amount - amount;

		int totalCnt = companyService.getCount();
		int endPageNum = Math.ceilDiv(totalCnt, amount);

		HttpSession session = request.getSession();
		UserDto user = (UserDto) session.getAttribute("user");

		List<CompanyDto> companys = companyService.testBookmark(startNum, amount, user.getUserId());



		model.addAttribute("companys", companys);
		model.addAttribute("currentPageNum", pageNum);
		model.addAttribute("endPageNum", endPageNum);

		return "taek/companyInfo";
	}

	@RequestMapping("/companyDetail/{companyName}")
	public String companyDetail(@PathVariable("companyName") String companyName, Model model) {

		CompanyDto company = companyService.getCompany(companyName);
		String companyId = company.getCompanyId();
		RatingDto rating = companyService.companyRating(companyId);

		model.addAttribute("rating", rating);
		model.addAttribute("company", company);

		return "taek/companyDetail";
	}

	@PostMapping("/addBookmark")
	@ResponseBody
	public List<UserToCompanyBookmarkDto> addBookMark(@RequestParam("userId") String userId,
			@RequestParam("companyId") String companyId) {

		companyService.regUserToCompanyBookmark(userId, companyId);
		List<UserToCompanyBookmarkDto> bookmarks = companyService.getUserToCompanyBookmark(userId);

		return bookmarks;
	}

	@PostMapping("/removeBookmark")
	@ResponseBody
	public List<UserToCompanyBookmarkDto> removeBookmark(@RequestParam("userId") String userId,
			@RequestParam("companyId") String companyId) {
		companyService.removeUserToCompanyBookmark(userId, companyId);
		List<UserToCompanyBookmarkDto> bookmarks = companyService.getUserToCompanyBookmark(userId);

		return bookmarks;
	}

	// ----------------------검색........입니다.................................
	@RequestMapping("/searchCompany/{pageNum}")
	public String searchCompany(@PathVariable("pageNum")int pageNum,HttpServletRequest request
			,Model model, @ModelAttribute("searchEntity")SearchCompanyEntityDto searchEntity) {

		int startNum = pageNum * amount - amount;

		
		
		HttpSession session = request.getSession();
		UserDto user = (UserDto) session.getAttribute("user");
		String userId = user.getUserId();

		if (searchEntity.getSearchPart().equals("")) {
			List<CompanyDto> companys = companyService.searchCompanyWithBookmark(searchEntity.getSortPart(), startNum, amount, userId,
					searchEntity.getSearchInput());
			int totalCnt = companyService.searchCompanyByCompanyNameCount(searchEntity.getSearchInput());
			int endPageNum = Math.ceilDiv(totalCnt, amount);
			model.addAttribute("currentPageNum", pageNum);
			model.addAttribute("endPageNum", endPageNum);
			model.addAttribute("companys", companys);
			model.addAttribute("searchEntity",searchEntity);
		}

		if (searchEntity.getSearchPart().equals("companyName")) {
			List<CompanyDto> companys = companyService.searchCompanyWithBookmark(searchEntity.getSortPart(), startNum, amount, userId,
					searchEntity.getSearchInput());
			int totalCnt = companyService.searchCompanyByCompanyNameCount(searchEntity.getSearchInput());
			int endPageNum = Math.ceilDiv(totalCnt, amount);
			model.addAttribute("currentPageNum", pageNum);
			model.addAttribute("endPageNum", endPageNum);
			
			model.addAttribute("companys", companys);
			
		}

		
		
		return "/taek/searchCompanyInfo";
	}
	

}
