package com.example.demo.service.sangin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.sangin.IBookmarkedApplicationDao;
import com.example.demo.dto.ApplicationDto;

@Service
public class BookmarkedApplicationService implements IBookmarkedApplicationService{
	@Autowired
	IBookmarkedApplicationDao bookmarkedApplicationDao;
	@Override
	public List<ApplicationDto> getBookmarkedApplicationList(String userId) {
		return bookmarkedApplicationDao.getBookmarkedApplicationList(userId);
	}

}
