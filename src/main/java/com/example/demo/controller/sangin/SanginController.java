package com.example.demo.controller.sangin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.ApplicationDto;
import com.example.demo.service.sangin.ApplicationService;

@Controller
public class SanginController {
	@Autowired
	ApplicationService applicationService;
	
	@RequestMapping("/")
	String main() {
		return "sangin/sum";
	}
	@RequestMapping("/applicationsListForm")
	String applicationListForm(Model model){
		System.out.println("@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@");
		List<ApplicationDto> list = applicationService.getApplicationList();
		System.out.println("list = " + list);
		model.addAttribute("list", list);
		return "sangin/applicationsListForm";
	}
}
