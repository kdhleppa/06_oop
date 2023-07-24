package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
	
	
	Book bk1 = new Book();
	Book bk2 = new Book();
	
	bk1.setTitle("자바의 정석");
	bk1.setPrice(30000);
	bk1.setDiscountRate(0.2);
	bk1.setAuthor("남궁성");
	
	bk2.setPrice((double) bk1.getPrice *(1+bk1.getDiscountRate()));
	
	}
	

}
