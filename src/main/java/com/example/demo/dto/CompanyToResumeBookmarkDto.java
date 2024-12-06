package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyToResumeBookmarkDto {
	private int bookmarkNum; // 1. 북마크 고유 번호
	private String companyId; // 2. 기업 ID (FK)
	private int resumeNum; // 3. 이력서 고유 번호 (FK)
	private java.sql.Timestamp bookmarkDate; // 4. 북마크 등록일
}
