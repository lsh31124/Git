package com.human.biz.user.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.human.user.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public UserVO getUser(UserVO vo) {
		return(UserVO)mybatis.selectOne("UserDAO.getUser",vo);
	}
	public int confirmID(UserVO vo) {
		return mybatis.selectOne("UserDAO.confirmID",vo);
	}
	
	public int insertUser(UserVO vo) {
		System.out.println("insertUser() 회원정보"+vo);
		int result =mybatis.insert("UserDAO.insertUser",vo);
		System.out.println("insertUser() result="+result);
		
		return result;
	}
}
