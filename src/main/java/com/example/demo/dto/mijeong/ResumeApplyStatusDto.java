package com.example.demo.dto.mijeong;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ResumeApplyStatusDto {
	
	private int resumeApplyStatusNum;  // 이력서 지원 고유 넘버
    private int applicationNum;        // 기업 공고 고유 넘버 (applications 테이블 참조)
    private int resumeNum;             // 이력서 고유 넘버 (resumes 테이블 참조)
    private Timestamp applyDate;       // 지원 날짜
    private String applyStatus;       // 채용 현황 (합격, 불합격, 진행중, 재직 등)

}
