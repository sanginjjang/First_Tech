package com.example.demo.dto;

import lombok.Data;

@Data
public class UserToCompanyBookmarkDto {
	private int bookmarkNum; // 1. 북마크 고유 번호
	private String userId; // 2. 사용자 ID (FK)
	private String companyId; // 3. 기업 ID (FK)
	private java.sql.Timestamp bookmarkDate; // 4. 북마크 등록일
}
