package com.example.demo.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResumeApplyStatus {
	private int resumeNum;              // 이력서 고유 넘버
    private String resumeTitle;
    private Timestamp updatedDate; 
    
    private String applicationName; // 2. 공고명
    
    private Timestamp applyDate;       // 지원 날짜
    private String applyStatus; 
    
}
