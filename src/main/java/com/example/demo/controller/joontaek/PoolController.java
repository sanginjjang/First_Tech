package com.example.demo.controller.joontaek;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/p")
public class PoolController {
	
	@RequestMapping("root")
	public String root(Model model) {
		
		/*
		
		여기서 이력서 불러와서 모델에 담아서 보내줄거에요~!  
		페이지네이션도 해야하니 나중에 PathVariable로 페이지넘버 받아야합니다~!
		
		
		 
		 */
		return "/taek/resumePoolForm2";
	}
	
	  @GetMapping("/searchPool")
	  @ResponseBody
	    public String getFilteredResumes(
	            @RequestParam(value = "techStack", required = false) String techStack,
	            @RequestParam(value = "education", required = false) String education) {

	        
	        System.out.println(techStack);
	        System.out.println(techStack);
	        System.out.println(techStack);
	        System.out.println(techStack);
	        
	        System.err.println(education);
	        System.err.println(education);
	        System.err.println(education);
	        System.err.println(education);
	        

	        
	        return "기술스택: " + techStack + ", 학력: " + education;
	    }

}

