package com.example.demo.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
	private int commentNum; // 1. 댓글 고유 번호
	private int boardNum; // 2. 게시판 고유 번호 (FK)
	private String commentContent; // 3. 댓글 내용
	private String commentWriter; // 4. 작성자
	private java.sql.Timestamp createdDate; // 5. 등록일
	private java.sql.Timestamp modifyDate; // 6. 수정일

}
