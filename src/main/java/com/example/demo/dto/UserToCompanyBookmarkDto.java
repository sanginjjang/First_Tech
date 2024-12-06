package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserToCompanyBookmarkDto {
	private int bookmarkNum; // 1. 북마크 고유 번호
	private String userId; // 2. 사용자 ID (FK)
	private String companyId; // 3. 기업 ID (FK)
	private java.sql.Timestamp bookmarkDate; // 4. 북마크 등록일
}
