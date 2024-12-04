package com.example.demo.dto;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class CompanyDto {

    private String companyId;                    // 기업 ID / 사업자번호
    private String companyPassword;              // 비밀번호 (해시 값)
    private String companyName;                  // 기업 이름
    private String companyEmail;                 // 기업 이메일
    private String businessRegistrationCertificate; // 사업자등록증명원(파일)
    private String companyAddress;               // 기업 주소
    private int companyPostalCode;               // 우편번호
    private String companyTel;                   // 기업 전화
    private Date establishmentDate;              // 설립일
    private String webSite;                      // 홈페이지 주소
    private String ceo;                          // 대표자명
    private int employees;                       // 사원수
    private int annualRevenue;                   // 매출액
    
    private int isBookmarked;
    
    private Timestamp companyRegistDate;        // 계정 생성일 (가입 일자)
}
