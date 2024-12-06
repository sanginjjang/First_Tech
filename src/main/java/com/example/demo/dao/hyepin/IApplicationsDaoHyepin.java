package com.example.demo.dao.hyepin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IApplicationsDaoHyepin {
	
	public int getApplicationByCompanyId(@Param("companyId") String companyId);

}
