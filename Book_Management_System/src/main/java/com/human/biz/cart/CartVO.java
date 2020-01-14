package com.human.biz.cart;
import java.sql.Timestamp;

public class CartVO {
	private int cseq;
	private String id;
	private int book_code;
	private String title;
	private String author;
	private String publisher;
	private String result;
	private int quantity;
	private Timestamp rentdate;
	private Timestamp regdate;
	
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	public Timestamp getRentdate() {
		return rentdate;
	}
	public void setRentdate(Timestamp rentdate) {
		this.rentdate = rentdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCseq() {
		return cseq;
	}
	public void setCseq(int cseq) {
		this.cseq = cseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBook_code() {
		return book_code;
	}
	public void setBook_code(int book_code) {
		this.book_code = book_code;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "CartVO [cseq=" + cseq + ", id=" + id + ", book_code=" + book_code + ", title=" + title + ", author="
				+ author + ", publisher=" + publisher + ", result=" + result + ", quantity=" + quantity + ", rentdate="
				+ rentdate + ", regdate=" + regdate + "]";
	}
	
	
	
	
	
}
