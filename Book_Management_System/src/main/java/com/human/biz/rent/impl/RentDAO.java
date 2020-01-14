package com.human.biz.rent.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.rent.RentVO;

@Repository
public class RentDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void updateReturnDate(RentVO vo) {
		mybatis.update("RentDAO.updateReturnDate",vo);
	}
}
