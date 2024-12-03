package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.BoardViewDto;

public interface IBoardService {
	
	public List<BoardViewDto> getBoardListPaging(int startNum, int amount);
	
	public int getBoardCount();
	
	public BoardDto getBoard(int boardNum);
	
	public void BoardViews(int views, int boardNum);
	
	public void regBoard(BoardDto board);
	
	
}
