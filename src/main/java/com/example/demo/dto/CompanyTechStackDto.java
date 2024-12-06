package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyTechStackDto {
	private int companyTechStackNum; // 1. 기술 스택 고유 번호
	private int applicationNum; // 2. 기업 공고 고유 번호 (FK)
	private int techStackNum; // 3. 기술 스택 고유 번호 (FK)
}
