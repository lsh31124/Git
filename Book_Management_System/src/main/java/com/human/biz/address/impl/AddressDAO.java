package com.human.biz.address.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.address.AddressVO;

@Repository
public class AddressDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<AddressVO>selectAddress(AddressVO vo){
		return mybatis.selectList("AddressDAO.selectAddress",vo);
	}
}
