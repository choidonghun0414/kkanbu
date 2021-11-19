package com.kanbu.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberDAOImpl implements MemberDAOInter{
	
	@Autowired
	private SqlSessionTemplate mybatis = null;
	
	// memberDTO를 받아 testkanbu 테이블에 회원가입 추가한다.
	@Override
	public void insertMember(MemberDTO member) throws Exception {
		mybatis.insert("member.insertMember", member);
	}

}
