package com.example.demo.service.sangin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.sangin.IApplicationDao;
import com.example.demo.dto.ApplicationDto;

@Service
public class ApplicationService implements IApplicationService{
	@Autowired
	IApplicationDao applicationDao;
	
	@Override
	public List<ApplicationDto> getApplicationList() {
		return applicationDao.getApplicationList();
	}

}
