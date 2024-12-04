package com.example.demo.dto;

import lombok.Data;

@Data
public class ApplicationDto {
	private int applicationNum; // 1. 기업 공고 고유 번호
	private String applicationName; // 2. 공고명
	private String companyId; // 3. 기업 ID (FK)
	private java.sql.Timestamp createdDate; // 4. 공고 등록일
	private String deadlineDate; // 5. 공고 마감일
	private String fileName; // 6. 파일 이름
	private String career; // 7. 희망 경력
	private String education; // 8. 요구 학력
	private String salary; // 9. 급여
	private String workingArea; // 10. 근무 지역
	private String employmentType; // 11. 고용 형태
	private String roleId; // 12. 직무 ID (FK)
	private int isBookmarked; // 13. 북마크 상태 (1: 북마크됨, 0: 북마크되지 않음)// db에 없음
	private String schedule = "9:00 ~ 18:00"; // 14. 근무시간 // db에 없음
	private String onBoard = "진행 중";// 15. 진행 중 여부 //db에 없음
	private String keyTasks;	
	private String applicationIntro;
}
