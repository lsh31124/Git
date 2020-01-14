package com.human.biz.cart;

import java.util.List;

public interface CartService {
	public void insertCart(CartVO cartVO);
	public List<CartVO>listCart(String id);
	public void updateCart(int cseq);
	public void deleteCart(int cseq);
}
