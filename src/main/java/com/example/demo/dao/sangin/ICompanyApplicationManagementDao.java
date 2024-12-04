package com.example.demo.dao.sangin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.ApplicationDto;

@Mapper
public interface ICompanyApplicationManagementDao {
    List<ApplicationDto> companyApplicationList(@Param("companyId") String companyId);
    int insertApplication(@Param("dto") ApplicationDto dto);
}
