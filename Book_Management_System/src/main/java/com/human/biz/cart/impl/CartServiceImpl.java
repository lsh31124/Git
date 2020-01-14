package com.human.biz.cart.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.cart.CartService;
import com.human.biz.cart.CartVO;
@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDAO;
	
	@Override
	public void insertCart(CartVO cartVO) {
		cartDAO.insertCart(cartVO);

	}

	@Override
	public List<CartVO> listCart(String id) {
		// TODO Auto-generated method stub
		return cartDAO.listCart(id);
	}

	@Override
	public void updateCart(int cseq) {
		cartDAO.updateCart(cseq);
		
	}

	@Override
	public void deleteCart(int cseq) {
		cartDAO.deleteCart(cseq);
		
	}

}
