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
	
	public List<BoardViewDto> searchBoardByTitle(@Param("searchInput")String searchInput,@Param("startNum")int startNum, @Param("amount")int amount);
	
	public int searchBoardByTitleCount(@Param("searchInput")String searchInput);
	
    public List<BoardViewDto> searchBoardByContent(@Param("searchInput")String searchInput,@Param("startNum")int startNum, @Param("amount")int amount);
	
	public int searchBoardByContentCount(@Param("searchInput")String searchInput);
	
	 public List<BoardViewDto> searchBoardByWriter(@Param("searchInput")String searchInput,@Param("startNum")int startNum, @Param("amount")int amount);
		
	public int searchBoardByWriterCount(@Param("searchInput")String searchInput);
}
