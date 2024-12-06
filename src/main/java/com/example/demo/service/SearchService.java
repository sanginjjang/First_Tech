package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.taek.ISearchDao;
import com.example.demo.dto.CompanyDto;

@Service
public class SearchService implements ISearchService{

	@Autowired
	ISearchDao searchDao;
	
	@Override
	public List<CompanyDto> fromMainSearchByCompanyName(String mainSearchInput) {
		List<CompanyDto> searchCompanys = searchDao.fromMainSearchByCompanyName(mainSearchInput);
		return searchCompanys;
	}

	@Override
	public List<CompanyDto> fromMainSearchByApplication(String mainSearchInput) {
		List<CompanyDto> searchApplications = searchDao.fromMainSearchByApplication(mainSearchInput);
		
		return searchApplications;
	}

}
