package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.CompanyDto;
import com.example.demo.vo.hyepin.MainApplicationVo;

public interface ICompanyServiceHyepin {
	public boolean idCheck(CompanyDto companyDto);
	public CompanyDto getCompanyById(String companyId);
	public List<MainApplicationVo> getMainApplications();
}
