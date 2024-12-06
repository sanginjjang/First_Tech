package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.taek.ICommentDao;
import com.example.demo.dto.BoardViewDto;
import com.example.demo.dto.CommentDto;

@Service
public class CommentService implements ICommentService{

	@Autowired
	ICommentDao commentDao;
	
	@Override
	public void regComment(String commentContent, int boardNum, String commentWriter) {
		commentDao.regComment(commentContent, boardNum, commentWriter);
		
		
	}

	@Override
	public List<CommentDto> getCommentList(int boardNum) {
		
		List<CommentDto> comments = commentDao.getCommentList(boardNum);
		return comments;
	}








}
