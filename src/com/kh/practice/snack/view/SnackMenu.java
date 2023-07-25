package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	public void menu() {
		
	
		Scanner sc = new Scanner(System.in);
		SnackController scr = new SnackController();
	
	
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String inputKind = sc.next();
	
		System.out.print("이름 : ");
		String inputName = sc.next();
	
		System.out.print("맛 : ");
		String inputFlavor = sc.next();
			
		System.out.print("개수 : ");
		int inputNumOf = sc.nextInt();
	
		System.out.print("가격 : ");
		int inputPrice = sc.nextInt();
	
	
	
	
	
	
		
	}			

}
