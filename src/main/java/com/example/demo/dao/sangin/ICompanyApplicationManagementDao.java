package com.example.demo.dao.sangin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.ApplicationDto;

@Mapper
public interface ICompanyApplicationManagementDao {
	List<ApplicationDto> companyApplicationList(@Param("companyId") String companyId);

	List<ApplicationDto> companyApplicationListLimit(@Param("companyId") String companyId,
			@Param("offset") int offset,
			@Param("limit") int limit);

	int insertApplication(@Param("dto") ApplicationDto dto);
}
