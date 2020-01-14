package com.human.biz.book.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.human.biz.book.BookService;
import com.human.biz.book.BookVO;
import com.human.biz.cart.CartService;
import com.human.biz.cart.CartVO;
import com.human.biz.rent.RentService;
import com.human.biz.rent.RentVO;
import com.human.user.UserVO;

@Controller
public class BookController {
@Autowired
private BookService bookService;
@Autowired
private CartService cartService;
@Autowired
private RentService rentService;




	@RequestMapping(value="/the_book_details", method=RequestMethod.GET)
	public String book_code(@RequestParam(value="book_code",required=false)int book_code,BookVO vo,Model model) {
		vo.setBook_code(book_code);
		BookVO book=bookService.getBook(vo);
		model.addAttribute("bookVO",book);
		return "book/book_details";
	}
	
	@RequestMapping(value="book_list",method=RequestMethod.GET)
	public String book_list(BookVO vo,Model model) {
		System.out.println(vo);
		List<BookVO> booklist=bookService.getBookList(vo);
		model.addAttribute("bookList",booklist);
		return "book/a_list_of_books";
		
	}
	//도서 대출처리
	@RequestMapping(value="/book_lend",method= RequestMethod.POST)
	public String lend_book_list(BookVO vo,Model model,HttpServletRequest request) {
		String url="/";
		UserVO loginUser=(UserVO) request.getSession().getAttribute("loginUser");
		if(loginUser==null) {
			return "user/login";
		}else {
			//현재 도서가 대출중인지 체크
			BookVO book=bookService.getBook(vo);
			if(book.getRentyn().equals("y")) {
				model.addAttribute("message","1");
				url= "book/book_alert";
				System.out.println(url);
			}else {
				//대출 처리
//				vo.setId(loginUser.getId());
				vo.setRentyn("y");
				bookService.updateRentBook(vo);//대출
				
				RentVO rentVO=new RentVO();
				rentVO.setId(loginUser.getId());
				rentVO.setBook_code(vo.getBook_code());
				rentVO.setQuantity(1);
				
				// 도서 대여 정보insert
				bookService.insertRent(rentVO);
				
				//도서 대여목록 조회
				vo.setId(loginUser.getId());
				System.out.println("BookVO="+vo);
				List<BookVO> rentList=bookService.getRentBookList(vo);
				
				model.addAttribute("bookList",rentList);
				url= "book/book_lend";
			}
		
				
			}
			

			return url;
		}
	
	//도서 반납
	@RequestMapping(value = "book_return", method = RequestMethod.POST)
	public String book_return(BookVO vo, Model model, HttpServletRequest request) {
		UserVO loginUser = (UserVO) request.getSession().getAttribute("loginUser");
		String user = loginUser.getId();
		vo.setId(user);
		String rseq[] = request.getParameterValues("rseq");
		for (int i = 0; i < rseq.length; i++) {
			// 반납할 도서 도서 정보를 읽어온다
			int rentSeq=Integer.parseInt(rseq[i]);
			BookVO rentBook=bookService.getRentBook(rentSeq);
			
			vo.setRseq(rentSeq);
			vo.setRentyn("n");
			vo.setBook_code(rentBook.getBook_code());
			bookService.updateRentBook(vo);//도서 반납
			
			// 도서 반납일짜 업데이트
			RentVO rentVO=new RentVO();
			rentVO.setId(user);
			rentVO.setBook_code(vo.getBook_code());
			rentVO.setRseq(rentSeq);
			rentService.updateReturnDate(rentVO);
		}
		
		List<CartVO> cart = cartService.listCart(user);
		model.addAttribute("rentList", cart);
		return "List_of_my_information/mypage";
	}
}
	
