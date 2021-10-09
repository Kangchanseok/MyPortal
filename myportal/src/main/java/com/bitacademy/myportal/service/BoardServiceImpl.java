package com.bitacademy.myportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.myportal.repository.BoardDao;
import com.bitacademy.myportal.repository.BoardVo;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao boardDaoImpl;
	
	@Override
	public List<BoardVo> getList() {
		List<BoardVo> list = boardDaoImpl.selectAll();
		return list;
	}

	@Override
	public BoardVo view(Long no) {
//		boardDaoImpl.boardHit(no);
		return boardDaoImpl.view(no);
	}

	@Override
	public boolean write(BoardVo vo) {
		int insertedCount = boardDaoImpl.insert(vo);
		return 1 == insertedCount;
	}

	@Override
	public boolean update(BoardVo vo) {
		
		Long updatedCount = boardDaoImpl.update(vo);
		return 1 == updatedCount;
	}
	
	@Override
	public void boardHit(Long hit) {
		boardDaoImpl.boardHit(hit);
	}

	@Override
	public void delete(Long no) {
		boardDaoImpl.delete(no);
	}
	
}