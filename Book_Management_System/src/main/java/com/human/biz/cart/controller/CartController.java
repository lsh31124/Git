package com.human.biz.cart.controller;

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
public class CartController {
	@Autowired
	private CartService cartService;
	@Autowired
	private BookService bookService;
	@Autowired
	private PurchaseService purchaseService;
	
	
	@RequestMapping(value = "insert_Cart", method = RequestMethod.POST)
	public String insertCart(CartVO vo, Model model, HttpServletRequest request) {
		UserVO User = (UserVO) request.getSession().getAttribute("loginUser");
		if (User == null) {
			return "redirect:login";
		} else {
			vo.setId(User.getId());
			System.out.println(vo);
			cartService.insertCart(vo);

			return "redirect:mypage";
		}

	}

	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String mypage(CartVO vo, Model model, HttpServletRequest request) {
	
		UserVO User = (UserVO) request.getSession().getAttribute("loginUser");
		if (User == null) {
			return "redirect:login";
		} else {
			String userid=User.getId();
			BookVO bookVO=new BookVO();
			bookVO.setId(userid);
	
			List<BookVO> rentlist = bookService.getRentBookList(bookVO);
	
			model.addAttribute("rentList", rentlist);
			PurchaseVO oVo=new PurchaseVO();
			oVo.setId(userid);
			List<PurchaseVO> purchaselist=purchaseService.listOrderById(oVo);
			model.addAttribute("purchaselist",purchaselist);
			//model.addAttribute("price", price);
	
			return "List_of_my_information/mypage";
		}
	}


}
