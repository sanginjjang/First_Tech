package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.hyepin.ICompanyDaoHyepin;
import com.example.demo.dto.CompanyDto;

@Service
public class CompanyServiceHyepin implements ICompanyServiceHyepin{

	@Autowired
	ICompanyDaoHyepin companyDao;
	
	@Override
	public boolean idCheck(CompanyDto companyDto) {
		boolean idCheck = false;
		CompanyDto company = companyDao.getCompanyById(companyDto.getCompanyId());
		if(company != null) {
			if(company.getCompanyPassword().equals(companyDto.getCompanyPassword()));
			idCheck = true;
		}
		return idCheck;
	}

	@Override
	public CompanyDto getCompanyById(String companyId) {
		CompanyDto company = companyDao.getCompanyById(companyId);
		return company;
	}


}
