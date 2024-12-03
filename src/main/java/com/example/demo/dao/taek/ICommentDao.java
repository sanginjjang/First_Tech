package com.example.demo.dao.taek;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.CommentDto;

@Mapper
public interface ICommentDao {
	
	public void regComment(@Param("commentContent")String commentContent ,@Param("boardNum")int boardNum,
			@Param("commentWriter")String commentWriter);
	
	public List<CommentDto> getCommentList(int boardNum);
	
	
	
	
	

}
