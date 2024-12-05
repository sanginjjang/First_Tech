package com.example.demo.service.sangin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.sangin.IApplicationDao;
import com.example.demo.dto.ApplicationDto;
import com.example.demo.dto.UserToApplicationBookmarkDto;
import com.example.demo.dto.UserToCompanyBookmarkDto;

@Service
public class ApplicationService implements IApplicationService{
	@Autowired
	IApplicationDao applicationDao;
	
	@Override
	public List<ApplicationDto> getApplicationList(String userId) {
		return applicationDao.getApplicationList(userId);
	}

	@Override
	public int addHeart(UserToApplicationBookmarkDto dto) {
		return applicationDao.addHeart(dto);
	}

	@Override
	public int removeHeart(UserToApplicationBookmarkDto dto) {
		return applicationDao.removeHeart(dto);
	}

	@Override
	public int addStar(UserToCompanyBookmarkDto dto) {
		return applicationDao.addStar(dto);
	}

	@Override
	public int removeStar(UserToCompanyBookmarkDto dto) {
		return applicationDao.removeStar(dto);
	}

	@Override
	public List<String> getBookmarkedCompany(String userId) {
		return applicationDao.getBookmarkedCompany(userId);
	}

	@Override
	public ApplicationDto getApplication(int applicationNum) {
		return applicationDao.getApplication(applicationNum);
	}

	@Override
	public List<ApplicationDto> getApplicationByWorkingArea(String workingArea){
		return applicationDao.getApplicationByWorkingArea(workingArea);
	}

	@Override
	public List<ApplicationDto> getApplicationByRoleId(String roleId) {
		return applicationDao.getApplicationByRoleId(roleId);
	}

	@Override
	public List<ApplicationDto> getApplicationByKeyword(String keyword) {
		return applicationDao.getApplicationByKeyword(keyword);
	}

}
