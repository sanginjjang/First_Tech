package com.example.demo.controller.hyepin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;
import com.example.demo.service.ICompanyService;
import com.example.demo.service.ICompanyServiceHyepin;

@Controller 
@RequestMapping("/hyepin")
public class CompanyControllerHyepin {
	
	@Autowired
	ICompanyServiceHyepin companyServiceHyepin;
	
	@Autowired
	ICompanyService companyService;
	
	/*
	@RequestMapping("/companyDetail/{companyId}")
	public String companyDetail(@PathVariable("companyId") String companyId, Model model) {

		System.out.println("companyId:" + companyId);
		CompanyDto company = companyServiceHyepin.getCompanyById(companyId);
		RatingDto rating = companyService.companyRating(companyId);
		System.out.println(company);
		System.out.println(rating);
		model.addAttribute("rating", rating);
		model.addAttribute("company", company);

		return "/taek/companyDetail";
	}
	*/
	
	
}
