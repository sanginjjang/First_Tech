package com.example.demo.dto;
import lombok.Data;

@Data
public class BoardDto {
	private int boardNum; // 1. 게시판 고유 번호
	private String boardTitle; // 2. 제목
	private String boardContent; // 3. 내용
	private String boardWriter; // 4. 작성자
	private String fileName; // 5. 첨부 파일 이름
	private int views; // 6. 조회수
	private java.sql.Timestamp createdDate; // 7. 등록일
	private java.sql.Timestamp modifyDate; // 8. 수정일
}
