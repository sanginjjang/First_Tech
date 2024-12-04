package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 설정 용도의 클래스이다
public class WebMvcConfig implements WebMvcConfigurer {

	@Value("${spring.servlet.multipart.location:./uploads}")
	private String uploadDir;

	// 스프링 어노테이션 밸류에 있는 값 갖고 오는거?
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/uploads/**").addResourceLocations("file:" + uploadDir);
	}

}
