package com.human.biz.purchase.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.cart.CartService;
import com.human.biz.cart.CartVO;
import com.human.biz.purchase.PurchaseService;
import com.human.biz.purchase.PurchaseVO;
@Service("purchaseService")
public class PurchaseServiceimpl implements PurchaseService {

	@Autowired
	private PurchaseDAO purchaseDAO;
	@Autowired
	private CartService cartService;
	
	@Override
	public void insertOrder(PurchaseVO vo, List<CartVO> cartList) {
		purchaseDAO.insertOrder(vo, cartList);

		for(CartVO cartVO : cartList) {
			vo.setOseq(vo.getOseq());
			vo.setBook_code(cartVO.getBook_code());
			vo.setQuantity(cartVO.getQuantity());
			purchaseDAO.insertOrderDetail(vo);
		}
	}

	@Override
	public void insertOrderDetail(PurchaseVO vo, int cseq) {
		purchaseDAO.insertOrderDetail(vo);
		cartService.updateCart(cseq);

	}

	@Override
	public List<PurchaseVO> listOrderById(PurchaseVO vo) {
		// TODO Auto-generated method stub
		return purchaseDAO.listOrderById(vo);
	}

	@Override
	public List<Integer> selectSeqOrdering(String id) {
		// TODO Auto-generated method stub
		return purchaseDAO.selectSeqOrdering(id);
	}

	@Override
	public int selectMaxOseq() {
		// TODO Auto-generated method stub
		return purchaseDAO.selectMaxOseq();
	}

}
