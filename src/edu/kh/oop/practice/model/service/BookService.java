package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
	
	
	Book bk1 = new Book();
	Book bk2 = new Book();
	
	bk1.setTitle(null);
	bk1.setPrice(0);
	bk1.setDiscountRate(0.0);
	bk1.setAuthor(null);
	
	bk2.setTitle("자바의 정석");
	bk2.setPrice(30000);
	bk2.setDiscountRate(0.2);
	bk2.setAuthor("남궁성");
	
	System.out.println( bk1.toString());
	System.out.println( bk2.toString());
	
	
	}
	

}
