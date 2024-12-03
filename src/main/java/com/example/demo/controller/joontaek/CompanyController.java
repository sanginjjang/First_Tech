package com.example.demo.controller.joontaek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;
import com.example.demo.service.ICompanyService;

@Controller
@RequestMapping("/c")
public class CompanyController {
	
	@Value("${app.page.amount}")
	private int amount = 5;
	
	@Autowired
	ICompanyService companyService;
	
	@RequestMapping("/companyInfo/{pageNum}")
	public String companyInfo(@PathVariable("pageNum")int pageNum,Model model) {
		int startNum = pageNum * amount - amount;
		List<CompanyDto> companys = companyService.getCompanyListPaging(startNum, amount); //기업 전체 목록 조회
		
		int totalCnt = companyService.getCount();
		int endPageNum = Math.ceilDiv(totalCnt, amount);
		
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
	
//	@RequestMapping("bookmark")
	
	
}
