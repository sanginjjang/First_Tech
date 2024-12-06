package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentHistoryDto {
	private int employmentNum; // 1. 재직 고유 번호
	private String userId; // 2. 사용자 ID (FK)
	private String companyId; // 3. 기업 ID (FK)
	private java.sql.Date startDate; // 4. 입사일
	private java.sql.Date endDate; // 5. 퇴사일
}
