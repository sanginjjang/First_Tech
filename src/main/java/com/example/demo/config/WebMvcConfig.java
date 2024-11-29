package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //설정 용도의 클래스이다
public class WebMvcConfig implements WebMvcConfigurer{
	
	@Value("${spring.servlet.multipart.location}") //정의해놓은 폴더로 보낸다는 것
	private String uploadPath;

	//스프링 어노테이션 밸류에 있는 값 갖고 오는거?
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		registry.addResourceHandler("/images/**").addResourceLocations("file:///" + uploadPath);
		//이미지 폴더에 있는 걸로 가정할거에요
		// (file:// = 파일프로토콜), 마지막 슬래쉬는 root 경로
		
	}

}
