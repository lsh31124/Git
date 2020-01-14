package com.human.biz.purchase;

import java.util.List;

import com.human.biz.cart.CartVO;

public interface PurchaseService {
	public void insertOrder(PurchaseVO oVo,List<CartVO> cartList);
	public void insertOrderDetail(PurchaseVO oVo,int cseq);
	public List<PurchaseVO>listOrderById(PurchaseVO oVo);
	public List<Integer>selectSeqOrdering(String id);
	public int selectMaxOseq();
}
