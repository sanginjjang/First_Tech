package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.taek.IBoardDao;
import com.example.demo.dto.BoardDto;
import com.example.demo.dto.BoardViewDto;

@Service
public class BoardService implements IBoardService {

	
	@Autowired
	IBoardDao boardDao;

	@Override
	public List<BoardViewDto> getBoardListPaging(int startNum, int amount) {
		List<BoardViewDto> boardList = boardDao.getBoardListPaging(startNum, amount);
		return boardList;
	}
	
	@Override
	public int getBoardCount() {
		
		int pageCnt = boardDao.getBoardCount();
		return pageCnt;
	}
	@Override
	public BoardDto getBoard(int boardNum) {
		BoardDto board = boardDao.getBoard(boardNum);
		return board;
	}
	@Override
	public void BoardViews(int views, int boardNum) {
		boardDao.boardViews(views, boardNum);
	}
	@Override
	public void regBoard(BoardDto board) {
		boardDao.regBoard(board);
	}


	@Override
	public List<BoardViewDto> searchBoardByTitle(String searchInput, int startNum, int amount) {
		List<BoardViewDto> searchResultBoardByTitle = boardDao.searchBoardByTitle(searchInput,startNum,amount);
		return searchResultBoardByTitle;
	}

	@Override
	public int searchBoardByTitleCount(String searchInput) {
		int searchBoardByTitleCount = boardDao.searchBoardByTitleCount(searchInput);
		return searchBoardByTitleCount;
	}

	@Override
	public List<BoardViewDto> searchBoardByContent(String searchInput, int startNum, int amount) {
		List<BoardViewDto> searchResultBoardByContent = boardDao.searchBoardByContent(searchInput, startNum, amount);
		return searchResultBoardByContent;
	}

	@Override
	public int searchBoardByContentCount(String searchInput) {
		int searchBoardByContent = boardDao.searchBoardByContentCount(searchInput);
		return searchBoardByContent;
	}

	@Override
	public List<BoardViewDto> searchBoardByWriter(String searchInput, int startNum, int amount) {
		List<BoardViewDto> searchResultBoardByWriter = boardDao.searchBoardByWriter(searchInput, startNum, amount);
		return searchResultBoardByWriter;
	}

	@Override
	public int searchBoardByWriterCount(String searchInput) {
		int searchBoardByWriter = boardDao.searchBoardByWriterCount(searchInput);
		return searchBoardByWriter;
	}
	
	

}
