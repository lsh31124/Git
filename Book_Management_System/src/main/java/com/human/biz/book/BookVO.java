package com.human.biz.book;

import java.sql.Date;

public class BookVO {
	private String id; //회원 Id
	private int book_code;// 도서 번호
	private int rseq;
	private String title;//도서 제목
	private String author; //저자
	private String publisher;//출판사
	private String genre;// 장르
	private String content;//내용
	private String image;//표지 이미지
	private int price;//가격
	private String rentyn;//대여 여부
	private Date rentdate; //대출일
	private String searchType;
	private String keyword;
	
	
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getRentdate() {
		return rentdate;
	}
	public void setRentdate(Date rentdate) {
		this.rentdate = rentdate;
	}
	public int getBook_code() {
		return book_code;
	}
	public void setBook_code(int book_code) {
		this.book_code = book_code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRentyn() {
		return rentyn;
	}
	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
	}
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", book_code=" + book_code + ", rseq=" + rseq + ", title=" + title + ", author="
				+ author + ", publisher=" + publisher + ", genre=" + genre + ", content=" + content + ", image=" + image
				+ ", price=" + price + ", rentyn=" + rentyn + ", rentdate=" + rentdate + ", searchType=" + searchType
				+ ", keyword=" + keyword + "]";
	}
	
	
		
	
}
