package com.human.biz.book;

import java.util.List;

import com.human.biz.rent.RentVO;

public interface BookService {
	public void insertBook(BookVO vo);
	public void updateBook(BookVO vo);
	public void deleteBook(BookVO vo);
	public BookVO getBook(BookVO vo);
	public List<BookVO> getBookList(BookVO vo);
	public List<BookVO> getNewBookList();
	public List<BookVO> getBestList();
	public void updateRentBook(BookVO vo);
	public void insertRent(RentVO vo);
	public List<BookVO> getRentBookList(BookVO vo);
	public BookVO getRentBook(int rseq);
}
