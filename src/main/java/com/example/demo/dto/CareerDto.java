package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CareerDto {

    private int careerNum;        // 커리어 고유 넘버
    private int resumeNum;        // 이력서 고유 넘버 (resumes 테이블 참조)
    private String career;        // 경력 기간 (6개월, 1년 등)
    private String careerName;    // 회사명
	
}
