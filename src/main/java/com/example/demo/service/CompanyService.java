package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.taek.ICompanyDao;
import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;

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



	@Override
	public void regUserToCompanyBookmark(String userId, String companyId) {
		companyDao.regUserToCompanyBookmark(userId, companyId);
	}



	@Override
	public List<UserToCompanyBookmarkDto> getUserToCompanyBookmark(String userId) {
		List<UserToCompanyBookmarkDto> bookmarks = companyDao.getUserToCompanyBookmark(userId);
		return bookmarks;
	}



	@Override
	public List<CompanyDto> testBookmark(int startNum, int amount, String userId) {
		List<CompanyDto> companys =companyDao.testBookmark(startNum, amount,userId);
		return companys;
	}



	@Override
	public void removeUserToCompanyBookmark(String userId, String companyId) {
		companyDao.removeUserToCompanyBookmark(userId, companyId);
		
	}



	@Override
	public List<CompanyDto> searchCompanyByCompanyName(int startNum, int amount, String searchInput,String sortPart) {
		List<CompanyDto> companys = companyDao.searchCompanyByCompanyName(startNum, amount, searchInput,sortPart);
		return companys;
	}



	@Override
	public int searchCompanyByCompanyNameCount(String searchInput) {
		int resultSearchCompanyByCompanyNameCount =companyDao.searchCompanyByCompanyNameCount(searchInput);
		return resultSearchCompanyByCompanyNameCount;
	}



	@Override
	public List<CompanyDto> searchCompanyWithSort(String sortPart, int startNum, int amount) {
		List<CompanyDto> companys = companyDao.searchCompanyWithSort(sortPart, startNum, amount);
		return companys;
	}



	@Override
	public List<CompanyDto> searchCompanyWithBookmark(String sortPart, int startNum, int amount, String userId,String searchInput) {
		List<CompanyDto> companys = companyDao.searchCompanyWithBookmark(sortPart, startNum, amount, userId, searchInput);
		return companys;
	}

}
