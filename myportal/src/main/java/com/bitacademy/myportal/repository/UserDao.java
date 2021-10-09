package com.bitacademy.myportal.repository;

public interface UserDao {
	public int insert(UserVo vo); // 가입 인서트
	public UserVo selectUser(String email); // 중복 이메일 체크 셀렉트
	public UserVo selectUser(String email, String password);
	// Login용 셀렉트
	
	// 회원정보 수정
	public int updateUser(UserVo userVo);
}
