package com.example.demo.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ResumeDto {
	
	private int resumeNum;               // 이력서 고유 넘버
    private String userId;               // 구직자 ID (users 테이블 참조)
    private String resumeTitle;          // 이력서 제목
    private String resumePhone;          // 휴대폰번호
    private String resumeContent;        // 이력서 내용
    private String portfolioName;        // 포트폴리오(파일)
    private String personalPhotoName;    // 증명사진(파일)
    private String education;            // 학력
    private String school;               // 최종 학력 학교명
    private String address;              // 주소
    private int roleId;                  // 개발직무 (job_roles.role_id 참조)
    private String militaryService;      // 병역
    private Timestamp createdDate;       // 이력서 작성일
    private Timestamp updatedDate;       // 이력서 수정일

}
