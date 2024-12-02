package com.example.demo.dto;

public class ApplicationDto {
	private int applicationNum; // 1. 기업 공고 고유 번호
	private String applicationName; // 2. 공고명
	private String companyId; // 3. 기업 ID (FK)
	private java.sql.Timestamp createdDate; // 4. 공고 등록일
	private java.sql.Timestamp deadlineDate; // 5. 공고 마감일
	private String fileName; // 6. 파일 이름
	private String career; // 7. 요구 경력
	private String education; // 8. 요구 학력
	private String salary; // 9. 급여
	private String workingArea; // 10. 근무 지역
	private String employmentType; // 11. 고용 형태
	private int roleId; // 12. 직무 ID (FK)
}
