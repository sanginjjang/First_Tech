package com.example.demo.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class UserCertificateDto {
	
    private int userCertificateNum;    // 고유 넘버
    private int resumeNum;             // 이력서 고유 넘버 (resumes 테이블 참조)
    private int certificateNum;        // 자격증 넘버 (certificates 테이블 참조)
    private Date certificateDate;      // 취득 날짜

}
