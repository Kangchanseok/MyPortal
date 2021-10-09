package com.bitacademy.myportal.repository;

import java.util.List;

public interface BoardDao {
	
	public List<BoardVo> selectAll(); // 리스트 출력을 위한 select
	public int insert(BoardVo boardVo); // 게시물 작성 insert
	public BoardVo view(Long no); // 게시물 조회 select
	public Long update(BoardVo boardVo); // 게시물 수정 update
	public void delete(Long no); // 게시물 삭제 delete
	public Long boardHit(Long hit) ; // 게시물 조회수

}
