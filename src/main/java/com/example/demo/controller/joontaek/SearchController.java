package com.example.demo.controller.joontaek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.CompanyDto;
import com.example.demo.service.ISearchService;

@Controller
@RequestMapping("/s")
public class SearchController {

	@Autowired
	ISearchService searchService;

	@RequestMapping("main")
	public String main() {

		return "/taek/main";
	}

	@RequestMapping("/searchResult")
	public String searchResult(@RequestParam("searchPart") String searchPart,
			@RequestParam("mainSearchInput") String mainSearchInput,Model model) {

		if (searchPart.equals("searchCompany")) {
			List<CompanyDto> mainSearchByCompanyNameList = searchService.fromMainSearchByCompanyName(mainSearchInput);
			model.addAttribute("searchList",mainSearchByCompanyNameList);
			model.addAttribute("searchPart","searchCompany");
		}
		
		if (searchPart.equals("searchApplication")) {
			List<CompanyDto> mainSearchByApplicationList = searchService.fromMainSearchByApplication(mainSearchInput);
			model.addAttribute("searchList",mainSearchByApplicationList);
			model.addAttribute("searchPart","searchApplication");
		}

		return "/taek/mainSearchResult";
	}

}
