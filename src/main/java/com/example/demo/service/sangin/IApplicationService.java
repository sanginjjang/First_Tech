package com.example.demo.service.sangin;

import java.util.List;

import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.UserToApplicationBookmarkDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;

public interface IApplicationService {
	List<ApplicationDto> getApplicationList(String userId);

	int addHeart(UserToApplicationBookmarkDto dto);

	int removeHeart(UserToApplicationBookmarkDto dto);
	
	int addStar(UserToCompanyBookmarkDto dto);

	int removeStar(UserToCompanyBookmarkDto dto);
	
	List<String> getBookmarkedCompany(String userId);
	
	ApplicationDto getApplication(int applicationNum);
}
