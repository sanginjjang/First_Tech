package com.example.demo.dto;

import lombok.Data;

@Data
public class UserToApplicationBookmarkDto {
	private int bookmarkNum; // 1. 북마크 고유 번호
	private String userId; // 2. 사용자 ID (FK)
	private int applicationNum; // 3. 기업 공고 고유 번호 (FK)
	private java.sql.Timestamp bookmarkDate; // 4. 북마크 등록일
}
