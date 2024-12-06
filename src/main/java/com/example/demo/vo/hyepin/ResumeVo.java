package com.example.demo.vo.hyepin;

import lombok.Data;

@Data
public class ResumeVo {
	
    private int resumeNum;                // INT: 이력서 번호
    private String resumeTitle;
    private String resumeContent;         // TEXT: 이력서 내용
    private String education;             // VARCHAR(255): 학력
    private String militaryService;       // VARCHAR(255): 병역
    private String userName;              // VARCHAR(255): 사용자 이름
    private String userPhone;             // VARCHAR(15): 사용자 전화번호
    private String userEmail;             // VARCHAR(255): 사용자 이메일
    private String userAddress;           // VARCHAR(255): 사용자 주소
    private String portfolioName;         // VARCHAR(255): 포트폴리오 파일 이름
    private String personalPhotoName;     // VARCHAR(255): 증명사진 파일 이름
    private String roleName; 			// 개발 직무 이름

}
