package com.example.demo.dao.taek;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.CompanyDto;

@Mapper
public interface ISearchDao {
	
	public List<CompanyDto> fromMainSearchByCompanyName(@Param("mainSearchInput")String mainSearchnput);
	
	public List<CompanyDto> fromMainSearchByApplication(@Param("mainSearchInput")String mainSearchnput);

}
