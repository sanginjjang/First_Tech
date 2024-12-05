package com.example.demo.service;

import com.example.demo.dto.CompanyDto;

public interface ICompanyServiceHyepin {
	public boolean idCheck(CompanyDto companyDto);
	public CompanyDto getCompanyById(String companyId);
}
