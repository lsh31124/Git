package com.human.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.book.BookService;
import com.human.biz.book.BookVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
@Autowired	
private BookService bookService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(BookVO vo, Model model) {
		
		List<BookVO> bookList=bookService.getBestList();
		
		model.addAttribute("BestBookList", bookList );
		
		List<BookVO>newBookList=bookService.getNewBookList();
		
		
		model.addAttribute("newBookList",newBookList);
		return "index";
		
	}
	@RequestMapping(value="login_form",method = RequestMethod.GET)
	public String loginForm(BookVO vo,Model model) {
		
		return "user/login";
	}
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index1(BookVO vo,Model model) {
List<BookVO> bookList=bookService.getBestList();
		
		model.addAttribute("BestBookList", bookList );
		
		List<BookVO>newBookList=bookService.getNewBookList();
		
		
		model.addAttribute("newBookList",newBookList);
		return "index";
	}
	
}
