package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	public void menu() {
		
	
		Scanner sc = new Scanner(System.in);
		SnackController scr = new SnackController();
	
		int inputCase = 0;
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
		
		System.out.print(scr.saveData(inputKind, inputName, inputFlavor, inputNumOf, inputPrice));
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String ynn = sc.next();
		if (ynn.equals("y")) {
			inputCase = 1;
		} else if (ynn.equals("n")) {
			inputCase = 2;
		} else { 
			System.out.print("다시 입력 하세요(y/n) : ");
			ynn = sc.next();
		}
		
		switch(inputCase) {
		case 1 :
			System.out.print(scr.confirmData()); break;
		case 2 :
			break;
		}
		
	}			

}
