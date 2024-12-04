package com.example.demo.dao.taek;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.RatingDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;

@Mapper
public interface ICompanyDao {
	
	public List<CompanyDto> getCompanyList();
	
	public List<CompanyDto> getCompanyListPaging(@Param("startNum")int startNum, @Param("amount")int amount);

	public int getCount();
	
	public CompanyDto getCompany(String companyName);
	
	public RatingDto getCompanyRating(String companyId);
	
	public void regUserToCompanyBookmark(@Param("userId")String userId,@Param("companyId")String companyId);
	
	public void removeUserToCompanyBookmark(@Param("userId")String userId,@Param("companyId")String companyId);
	
	
	
	public List<UserToCompanyBookmarkDto> getUserToCompanyBookmark(String userId);
	
	public List<CompanyDto> testBookmark(@Param("startNum")int startNum,@Param("amount")int amount,@Param("userId")String userId);
}
