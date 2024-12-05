package com.example.demo.dto.mijeong;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTechStackDto {
	
	private int userTechStackNum;    // 고유 넘버
    private int resumeNum;           // 이력서 고유 넘버 (resumes 테이블 참조)
    private int techStackNum;        // 기술 스택 고유 넘버 (tech_stacks 테이블 참조)
    
}
