package com.kh.practice.snack.controller;

import java.util.Scanner;

import com.kh.practice.snack.model.vo.Snack;
import com.kh.practice.snack.view.SnackMenu;

public class SnackController {
	
	Scanner sc = new Scanner(System.in);
	
	Snack s = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) { 
		
		this.s.setKind(kind);
		this.s.setName(name);
		this.s.setFlavor(flavor);
		this.s.setNumOf(numOf);
		this.s.setPrice(price);
					
		return "저장되었습니다\n";
	}
	
	public String confirmData() {
		return s.information();
		
	}
	

}
