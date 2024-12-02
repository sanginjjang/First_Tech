package com.example.demo.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class InternshipDto {

    private int internshipNum;        // 인턴십 고유 넘버
    private int resumeNum;            // 이력서 고유 넘버 (resumes 테이블 참조)
    private String internshipPeriod;  // 인턴십 기간 (예: 6개월, 1년 등)
    private String internshipName;    // 활동명
    private String internshipDetails; // 활동 내용
    private Date startDate;           // 시작 날짜
    private Date endDate;             // 종료 날짜

	
}
