package com.example.demo.dao.hyepin;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.CompanyDto;

@Mapper
public interface ICompanyDaoHyepin {

	public CompanyDto getCompanyById(String companyId);
	
	
	
}
