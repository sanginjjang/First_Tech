package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BoardViewDto;
import com.example.demo.dto.CommentDto;

public interface ICommentService {
	
	
	public void regComment(String commentContent, int boardNum, String commentWriter);
	
	public List<CommentDto> getCommentList(int boardNum);
	
	

	

}
