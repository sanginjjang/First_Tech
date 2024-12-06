package com.example.demo.dao.hyepin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.CompanyDto;
import com.example.demo.vo.hyepin.MainApplicationVo;

@Mapper
public interface ICompanyDaoHyepin {

	public CompanyDto getCompanyById(@Param("companyId") String companyId);
	//메인에 뿌릴 공고 가져옵니다.
	public List<MainApplicationVo> getMainApplications();

	
	
}
