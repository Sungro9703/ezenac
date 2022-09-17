package kr.co.eznenac.dto;
/*
    bookcode	 varchar2(20)	PRIMARY KEY NOT NULL
	,bookname	 varchar2(20)	NOT NULL
	,author		 varchar2(20)	NOT NULL
	,publisher	 varchar2(20)			
	,price		 varchar2(20)	
	,publishdate DATE
 */

import java.sql.Date;

public class BookDTO {
	private String bookcode;
	private String bookname;
	private String author;
	private String publisher;
	private String price;
	private Date publishdate;
	public BookDTO(String bookcode, String bookname, String author, String publisher, String price, Date publishdate) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.publishdate = publishdate;
	}
	public String getBookcode() {
		return bookcode;
	}
	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	
	
}
