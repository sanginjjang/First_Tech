package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechStackDto {
	
	private int techStackNum;  // 기술 스택 고유 넘버
	private String name;       // 기술 스택 이름
	
}
