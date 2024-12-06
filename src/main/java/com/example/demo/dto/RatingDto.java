package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto {
	private int ratingNum; // 1. 평점 고유 번호
	private String companyId; // 2. 기업 ID (FK)
	private String userId; // 3. 사용자 ID (FK)
	private int rating; // 4. 평점 (1~5)
	private String review; // 5. 리뷰 내용
	private java.sql.Timestamp createdDate; // 6. 작성일
}
