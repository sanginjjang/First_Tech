package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.taek.ICompanyDao;
import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;

@Service
public class CompanyService implements ICompanyService{
	
	@Autowired
	ICompanyDao companyDao;



	@Override
	public List<CompanyDto> getCompanyList() {
		
		List<CompanyDto> companys = companyDao.getCompanyList();
		return companys;
	}



	@Override
	public List<CompanyDto> getCompanyListPaging(int startNum, int amount) {
		
		List<CompanyDto> companys = companyDao.getCompanyListPaging(startNum, amount);
		return companys;
	}



	@Override // 총 페이지 갯수 구하려고 만듬
	public int getCount() {
		
		int pageCnt = companyDao.getCount();
		return pageCnt;
	}



	@Override
	public CompanyDto getCompany(String companyName) {
		CompanyDto company=companyDao.getCompany(companyName);
		return company;
	}



	@Override
	public RatingDto companyRating(String companyId) {
		
		RatingDto rating = companyDao.getCompanyRating(companyId);
		
		return rating;
	}

}
