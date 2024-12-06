package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.CompanyDto;

public interface ISearchService {
	
	public List<CompanyDto> fromMainSearchByCompanyName(String mainSearchInput);
	
	public List<CompanyDto> fromMainSearchByApplication(String mainSearchInput);

}
