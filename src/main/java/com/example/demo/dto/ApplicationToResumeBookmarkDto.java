package com.example.demo.dto;

public class ApplicationToResumeBookmarkDto {
	private int bookmarkNum; // 1. 북마크 고유 번호
	private int applicationNum; // 2. 기업 공고 고유 번호 (FK)
	private int resumeNum; // 3. 이력서 고유 번호 (FK)
	private java.sql.Timestamp bookmarkDate; // 4. 북마크 등록일
}
