package com.example.demo.service.sangin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.ApplicationDto;

public interface ICompanyApplicationManagementService {
	List<ApplicationDto> companyApplicationList(String companyId);
	List<ApplicationDto> companyApplicationListLimit(String companyId, int offset, int limit);
	int insertApplication(ApplicationDto dto);
	int getApplicationCount(String companyId);
}
