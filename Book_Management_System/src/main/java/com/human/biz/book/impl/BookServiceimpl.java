package com.human.biz.book.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.book.BookService;
import com.human.biz.book.BookVO;
import com.human.biz.rent.RentVO;
@Service("bookService")
public class BookServiceimpl implements BookService {
	@Autowired
	private BookDAO bookDAO;

	@Override
	public void insertBook(BookVO vo) {
		bookDAO.insertBook(vo);

	}

	@Override
	public void updateBook(BookVO vo) {
		bookDAO.updateBook(vo);
		
	}

	@Override
	public void deleteBook(BookVO vo) {
		bookDAO.deleteBook(vo);

	}

	@Override
	public BookVO getBook(BookVO vo) {
		// TODO Auto-generated method stub
		return bookDAO.getBook(vo);
	}

	@Override
	public List<BookVO> getBookList(BookVO vo) {
		// TODO Auto-generated method stub
		return bookDAO.getBookList(vo);
	}

	@Override
	public List<BookVO> getNewBookList() {
		// TODO Auto-generated method stub
		return bookDAO.getNewBookList();
	}

	@Override
	public List<BookVO> getBestList() {
		// TODO Auto-generated method stub
		return bookDAO.getBestList();
	}

	@Override
	public void updateRentBook(BookVO vo) {
		// TODO Auto-generated method stub
		bookDAO.updateRentBook(vo);
	}

	@Override
	public void insertRent(RentVO vo) {
		// TODO Auto-generated method stub
		bookDAO.insertRent(vo);
	}

	@Override
	public List<BookVO> getRentBookList(BookVO vo) {
		// TODO Auto-generated method stub
		return bookDAO.getRentBookList(vo);
	}

	@Override
	public BookVO getRentBook(int rseq) {
		// TODO Auto-generated method stub
		return bookDAO.getRentBook(rseq);
	}

	
	 

}
