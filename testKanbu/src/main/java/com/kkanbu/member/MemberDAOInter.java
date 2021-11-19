package com.kkanbu.member;

public interface MemberDAOInter {
	
	// memberDTO를 받아 testkanbu 테이블에 회원가입 추가한다.
	public void insertMember(MemberDTO member) throws Exception;

}
