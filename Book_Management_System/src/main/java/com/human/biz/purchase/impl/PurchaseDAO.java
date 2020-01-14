package com.human.biz.purchase.impl;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.cart.CartVO;
import com.human.biz.purchase.PurchaseVO;

@Repository
public class PurchaseDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertOrder(PurchaseVO vo,List<CartVO> cartList) {
		mybatis.insert("purchaseDAO.insertOrder",vo);
	}
	
	public void insertOrderDetail(PurchaseVO vo) {
		mybatis.insert("purchaseDAO.insertOrderDetail",vo);
	}
	public List<PurchaseVO>listOrderById(PurchaseVO vo){
		return mybatis.selectList("purchaseDAO.listOrderById",vo);
	}
	
	public List<Integer>selectSeqOrdering(String id){
		return mybatis.selectList("purchaseDAO.selectSeqOrdering",id);
	}
	public int selectMaxOseq() {
		return mybatis.selectOne("purchaseDAO.selectMaxOseq");
	}
}
