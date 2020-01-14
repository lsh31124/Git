package com.human.biz.cart.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.cart.CartVO;

@Repository
public class CartDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertCart(CartVO cartVO) {
		mybatis.insert("CartDAO.insertCart",cartVO);
	}
	public List<CartVO>listCart(String id){
		return mybatis.selectList("CartDAO.listCart",id);
	}
	public void updateCart(int cseq) {
		mybatis.update("CartDAO.updateCart",cseq);
	}
	public void deleteCart(int cseq) {
		mybatis.delete("CartDAO.deleteCart",cseq);
	}
}
