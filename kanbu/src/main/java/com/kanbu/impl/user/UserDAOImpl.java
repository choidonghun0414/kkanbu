package com.kanbu.impl.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.kanbu.dto.user.UserDTO;
import com.kanbu.inter.user.UserDAOInter;

public class UserDAOImpl implements UserDAOInter{
	
	@Autowired
	private SqlSessionTemplate mybatis = null;
	
	// memberDTO를 받아 testkanbu 테이블에 회원가입 추가한다.
	// sql문 사용할 mapper name과 id를 입력
	@Override
	public void insertUser(UserDTO user) throws Exception {
		mybatis.insert("user.insertUser", user);
	}

}
