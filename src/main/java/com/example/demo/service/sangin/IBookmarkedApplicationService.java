package com.example.demo.service.sangin;

import java.util.List;

import com.example.demo.dto.ApplicationDto;

public interface IBookmarkedApplicationService {
	List<ApplicationDto> getBookmarkedApplicationList(String userId);
}
