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
	
	

}
