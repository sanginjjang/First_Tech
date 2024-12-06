package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;

public interface ICompanyService {
	
	public List<CompanyDto> getCompanyList();  //기업 전체 목록 조회
	
	public List<CompanyDto> getCompanyListPaging(int startNum, int amount); //페이징구현
	
	public int getCount();
	
	public CompanyDto getCompany(String companyName);
	
	public RatingDto companyRating(String companyId);
	//북마크 추가↓
	public void regUserToCompanyBookmark(@Param("userId")String userId,@Param("companyId")String companyId);
	//북마크 삭제↓
	public void removeUserToCompanyBookmark(@Param("userId")String userId,@Param("companyId")String companyId);
	
	public List<UserToCompanyBookmarkDto> getUserToCompanyBookmark(String userId);
	
	public List<CompanyDto> testBookmark(int startNum, int amountm, String userId);
	
	public List<CompanyDto> searchCompanyByCompanyName(int startNum,int amount,String searchInput,String sortPart);
	
	public int searchCompanyByCompanyNameCount(String searchInput);

	public List<CompanyDto> searchCompanyWithSort(String sortPart,int startNum,int amount);
	
	public List<CompanyDto> searchCompanyWithBookmark(String sortPart , int startNum , int amount ,String userId,String searchInput);
	
	public List<CompanyDto> searchCompanyWithBookmarkFeatGuest(String sortPart , int startNum , int amount ,String searchInput);
}
