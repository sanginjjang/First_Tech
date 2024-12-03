package com.example.demo.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	String main() {
		// 모두가 같이 쓰는 즐거운 메인 페이지 ^^
		return "/sangin/sum";
	}

}
