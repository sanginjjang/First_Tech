package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;

public interface ICompanyService {
	
	public List<CompanyDto> getCompanyList();  //기업 전체 목록 조회
	
	public List<CompanyDto> getCompanyListPaging(int startNum, int amount); //페이징구현
	
	public int getCount();
	
	public CompanyDto getCompany(String companyName);
	
	public RatingDto companyRating(String companyId);

}
