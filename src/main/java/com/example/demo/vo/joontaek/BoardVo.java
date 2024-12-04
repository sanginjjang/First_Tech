package com.example.demo.vo.joontaek;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class BoardVo {
	private int boardNum; // 1. 게시판 고유 번호
	private String boardTitle; // 2. 제목
	private String boardContent; // 3. 내용
	private String boardWriter; // 4. 작성자
	private MultipartFile uploadFileName;
	private int views; // 6. 조회수
	private java.sql.Timestamp createdDate; // 7. 등록일
	private java.sql.Timestamp modifyDate; // 8. 수정일
}
