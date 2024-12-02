package com.example.demo.dto;

import lombok.Data;

@Data
public class UserTechStackDto {
	
	private int userTechStackNum;    // 고유 넘버
    private int resumeNum;           // 이력서 고유 넘버 (resumes 테이블 참조)
    private int techStackNum;        // 기술 스택 고유 넘버 (tech_stacks 테이블 참조)

}
