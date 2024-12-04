package com.example.demo.dao.taek;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.BoardViewDto;

@Mapper
public interface IBoardDao {

	public List<BoardViewDto> getBoardListPaging(@Param("startNum")int startNum, @Param("amount")int amount);

	public int getBoardCount();
	
	public BoardDto getBoard(int boardNum);
	
	public void boardViews(@Param("views")int views, @Param("boardNum")int boardNum);
	
	public void regBoard(BoardDto board);
	
}
