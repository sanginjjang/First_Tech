package com.example.demo.dao.hyepin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.CareerDto;
import com.example.demo.dto.CertificateDto;
import com.example.demo.dto.ResumeDto;
import com.example.demo.dto.TechStackDto;
import com.example.demo.vo.hyepin.ResumeVo;

@Mapper
public interface IResumeDaoHyepin {
	
	public List<ResumeDto> getResumeList(int applicationNum);
	public int getResumeListCount(int applicationNum);  // 전체 이력서 개수
	public List<ResumeDto> getResumeListPaging(@Param("applicationNum") int applicationNum,
											   @Param("startIdx") int startIdx, 
											   @Param("itemsPerPage") int itemsPerPage);
	public String getUserIdByResumeNum(int resumeNum);
	public ResumeVo getResumeDetail(@Param("resumeNum") int resumeNum,
									@Param("userId") String userId);
	public List<CertificateDto> getCertificateList(int resumeNum);
	public List<CareerDto> getCareerList(int resumeNum);
	public List<TechStackDto> getTechStackList(int resumeNum);
	
	
}
