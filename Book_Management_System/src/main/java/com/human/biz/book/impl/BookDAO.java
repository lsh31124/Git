package com.human.biz.book.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.book.BookVO;
import com.human.biz.rent.RentVO;

@Repository
public class BookDAO {
	
	@Autowired private SqlSessionTemplate mybatis;
	public void insertBook(BookVO vo) {
		mybatis.insert("BookDAO.insertBook",vo);
	}
	public void updateBook(BookVO vo) {
		mybatis.update("BookDAO.updateBook",vo);
	}
	
	public void updateRentBook(BookVO vo) {
		mybatis.update("BookDAO.updateRentBook",vo);
	}
	
	public void deleteBook(BookVO vo) {
		mybatis.update("BookDAO.deleteBook",vo);
	}
	public BookVO getBook(BookVO vo) {
		return(BookVO)mybatis.selectOne("BookDAO.getBook",vo.getBook_code());
	}
	public List<BookVO> getBookList(BookVO vo){
		return mybatis.selectList("BookDAO.getBookList", vo);
	}
	public List<BookVO> getNewBookList(){
	return mybatis.selectList("BookDAO.getNewBookList");
	}
	
	public List<BookVO> getBestList(){
		return mybatis.selectList("BookDAO.getBestBookList");
	}
	public void insertRent(RentVO vo) {
		mybatis.insert("BookDAO.insertRent",vo);
	}
	
	public List<BookVO> getRentBookList(BookVO vo){
		return mybatis.selectList("BookDAO.getRentBookList", vo);
	}
	public BookVO getRentBook(int rseq) {
		return mybatis.selectOne("BookDAO.getRentBook",rseq);
	}
}
