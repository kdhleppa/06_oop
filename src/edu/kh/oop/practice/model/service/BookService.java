package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	
	
	public void practice() {
	
	
	Book bk1 = new Book();
	Book bk2 = new Book();
	
	
	
	bk2.setTitle("자바의 정석");
	bk2.setPrice(30000);
	bk2.setDiscountRate(0.2);
	bk2.setAuthor("남궁성");
	
	System.out.println( bk1.toString());
	System.out.println( bk2.toString());
	System.out.println("============================");
	
	bk1.setTitle("c언어");
	bk1.setPrice(30000);
	bk1.setDiscountRate(0.1);
	bk1.setAuthor("홍길동");
	
	System.out.println("수정된 결과 확인");
	System.out.println( bk1.toString());
	System.out.println("============================");
	
	System.out.println("도서명 = " + bk1.getTitle());
	System.out.printf("할인된 가격 = %.0f\n", (bk1.getPrice() - (bk1.getPrice() * bk1.getDiscountRate())));
	System.out.println("도서명 = " + bk2.getTitle());
	System.out.printf("할인된 가격 = %.0f\n", (bk2.getPrice() - (bk2.getPrice() * bk2.getDiscountRate())));
	
	
	}
	

}
