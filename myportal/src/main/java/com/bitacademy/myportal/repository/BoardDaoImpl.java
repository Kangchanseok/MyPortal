package com.bitacademy.myportal.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	
	private String namespace = "board";
	
	@Override
	public List<BoardVo> selectAll() {
		List<BoardVo> list = sqlSession.selectList("board.selectAll");
		return list;
	}

	@Override
	public int insert(BoardVo boardVo) {
		//	TODO: 예외처리
		int insertedCount = sqlSession.insert("board.insert", boardVo);
		return insertedCount;
	}

	@Override
	public BoardVo view(Long no) {
		
		return sqlSession.selectOne(namespace + ".view", no);
		
	}

	@Override
	public Long update(BoardVo boardVo) {
		return (long) sqlSession.update(namespace + ".update", boardVo);
	}

	@Override
	public void delete(Long no)  {
		
		sqlSession.delete(namespace + ".delete", no);
	}
	@Override
	public Long boardHit(Long hit)  {
		return (long) sqlSession.update("board.boardHit", hit);
	}

}