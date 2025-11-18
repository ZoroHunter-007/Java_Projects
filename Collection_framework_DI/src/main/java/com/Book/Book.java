package com.Book;

public class Book {

	private int bookId;
	private String bookName;
	private String auothar_name;
	private double bookPrice;
	
	public Book(int bookId,String bookName,String auothar_name,double bookPrice) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.auothar_name=auothar_name;
		this.bookPrice=bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", auothar_name=" + auothar_name + ", bookPrice="
				+ bookPrice + "]";
	}
	public String getAuothar_name() {
		return auothar_name;
	}
	public void setAuothar_name(String auothar_name) {
		this.auothar_name = auothar_name;
	}
	
}
