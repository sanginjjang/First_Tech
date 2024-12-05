package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.BoardViewDto;

public interface IBoardService {

	public List<BoardViewDto> getBoardListPaging(int startNum, int amount);

	public int getBoardCount();

	public BoardDto getBoard(int boardNum);

	public void BoardViews(int views, int boardNum);

	public void regBoard(BoardDto board);

	public List<BoardViewDto> searchBoardByTitle(String searchInput, int startNum, int amount);

	public int searchBoardByTitleCount(String searchInput);

	public List<BoardViewDto> searchBoardByContent(String searchInput, int startNum, int amount);

	public int searchBoardByContentCount(String searchInput);
	
	public List<BoardViewDto> searchBoardByWriter(String searchInput, int startNum, int amount);

	public int searchBoardByWriterCount(String searchInput);

}
