package com.human.biz.rent;

import java.sql.Timestamp;

public class RentVO {
	private int rseq;
	private String id;
	private int book_code;
	private int quantity;
	private Timestamp rentdate;
	private Timestamp returndate;
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
	public int getBook_code() {
		return book_code;
	}
	public void setBook_code(int book_code) {
		this.book_code = book_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Timestamp getRentdate() {
		return rentdate;
	}
	public void setRentdate(Timestamp rentdate) {
		this.rentdate = rentdate;
	}
	public Timestamp getReturndate() {
		return returndate;
	}
	public void setReturndate(Timestamp returndate) {
		this.returndate = returndate;
	}
	@Override
	public String toString() {
		return "rentVO [rseq=" + rseq + ", id=" + id + ", book_code=" + book_code + ", quantity=" + quantity
				+ ", rentdate=" + rentdate + ", returndate=" + returndate + "]";
	}
	
	
}
