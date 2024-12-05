package com.example.demo.dto.mijeong;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResumeFileDto {
	    private int resumeNum;              // 이력서 고유 넘버
	    private String userId;              // 구직자 ID (users 테이블 참조)
	    private String resumeTitle;         // 이력서 제목
	    private String resumePhone;         // 휴대폰번호
	    private String resumeContent;       // 이력서 내용
	    private MultipartFile portfolioName;
	    private MultipartFile personalPhotoName;
	    private String education;        // 학력 (ENUM) String 
	    private String school;              // 최종 학력 학교명
	    private String address;             // 주소
	    private String militaryService; // 병역 (ENUM)
	    private Timestamp createdDate;      // 이력서 작성일
	    private Timestamp updatedDate;      // 이력서 수정일
	    
	    
	    private List<String> career;        // 경력 기간 (6개월, 1년 등)
	    private List<String> careerName; 
	    
	    private int certificateNum; 
	    private List<String> certificateName;    // 자격증 이름 //value값1234
	    private List<String> certificateBy;  
	    private Date certificateDate; 
	    
	    
	    private List<String> internshipPeriod;  // 인턴십 기간 (예: 6개월, 1년 등)
	    private List<String> internshipName;    // 활동명
	    private List<String> internshipDetails; // 활동 내용
	    private List<Date> startDate;           // 인턴십 시작 날짜
	    private List<Date> endDate; 			// 인터십 끝난 날짜
	    
	    private Integer roleId;
	    private String roleName;
	    
	    private String[] techStackNum;
	    private List<String> stackName;


}