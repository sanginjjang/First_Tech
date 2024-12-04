package com.example.demo.service.sangin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.sangin.ICompanyApplicationManagementDao;
import com.example.demo.dto.ApplicationDto;
@Service
public class CompanyApplicationManagementService implements ICompanyApplicationManagementService{
	
	@Autowired
	ICompanyApplicationManagementDao dao;
	@Override
	public List<ApplicationDto> companyApplicationList(String companyId) {
		return dao.companyApplicationList(companyId);
	}

}