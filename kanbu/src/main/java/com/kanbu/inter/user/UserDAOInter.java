package com.kanbu.inter.user;

import com.kanbu.dto.user.UserDTO;

public interface UserDAOInter {
	
	// memberDTO를 받아 testkanbu 테이블에 회원가입 추가한다.
	public void insertUser(UserDTO User) throws Exception;

}
