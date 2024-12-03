package com.example.demo.dao.taek;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;

@Mapper
public interface ICompanyDao {
	
	public List<CompanyDto> getCompanyList();
	
	public List<CompanyDto> getCompanyListPaging(@Param("startNum")int startNum, @Param("amount")int amount);

	public int getCount();
	
	public CompanyDto getCompany(String companyName);
	
	public RatingDto getCompanyRating(String companyId);
}
