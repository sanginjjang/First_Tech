package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.hyepin.IApplicationsDaoHyepin;
import com.example.demo.dao.hyepin.ICompanyDaoHyepin;
import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.CompanyDto;
import com.example.demo.vo.hyepin.MainApplicationVo;

@Service
public class CompanyServiceHyepin implements ICompanyServiceHyepin{

	@Autowired
	ICompanyDaoHyepin companyDao;
	
	@Autowired
	IApplicationsDaoHyepin applicationsDaoHyepin;
	
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
		System.out.println("여기 컴퍼니 서비스혜빈");
		System.out.println("companyId" + companyId);
		System.out.println("company" + company);
		return company;
	}

	@Override
	public List<MainApplicationVo> getMainApplications() {
		List<MainApplicationVo> aList = companyDao.getMainApplications();
		for(MainApplicationVo a : aList) {
			System.out.println(a);
		}
		return aList;
	}

	@Override
	public int getApplicationByCompanyId(String companyId) {
		int applicationNum = applicationsDaoHyepin.getApplicationByCompanyId(companyId);
		return applicationNum;
	}
	

}
