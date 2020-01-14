package com.human.biz.purchase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.book.BookService;
import com.human.biz.book.BookVO;
import com.human.biz.cart.CartService;
import com.human.biz.cart.CartVO;
import com.human.biz.purchase.PurchaseService;
import com.human.biz.purchase.PurchaseVO;
import com.human.user.UserVO;

@Controller
public class PurchaseController {
	@Autowired
	private CartService cartService;
	@Autowired
	private PurchaseService purchaseService;
	
	
	
	@RequestMapping(value="order_insert",method = RequestMethod.POST)
		public String Purchase(BookVO vo,Model model,HttpServletRequest request) {
		UserVO loginUser=(UserVO) request.getSession().getAttribute("loginUser");
		if(loginUser==null) {
			return "user/login";
		}else {
			String userId=loginUser.getId();
			
			PurchaseVO oVo=new PurchaseVO();
			int oseq=purchaseService.selectMaxOseq();
			oVo.setOseq(oseq+1);
			oVo.setId(userId);
		
			purchaseService.insertOrder(oVo, null);
			
			List<CartVO> cartList1=cartService.listCart(userId);
			
			
			model.addAttribute("oseq",oseq);
			return "book/mypage";
		}
		
		
	
	}
}
