package com.example.demo.service.sangin;

import java.util.List;

import com.example.demo.dto.ApplicationDto;

public interface ICompanyApplicationManagementService {
	List<ApplicationDto> companyApplicationList(String companyId);
}
