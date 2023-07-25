package com.kh.practice.snack.controller;

import java.util.Scanner;

import com.kh.practice.snack.model.vo.Snack;
import com.kh.practice.snack.view.SnackMenu;

public class SnackController {
	
	Scanner sc = new Scanner(System.in);
	
	Snack s = new Snack();
	SnackMenu sm = new SnackMenu();
	
	public SnackController() {}
	
	public String saveData(String kind) {
				this.setKind = kind;
		s.setKind(inputKind);
		s.setName(inputName);
		s.setFlavor(inputFlavor);
		s.setNumOf(inputNumOf);
		s.setPrice(inputPrice);	
		
		return "저장되었습니다";
	}
	
	public String confirmData() {
		return s.information();
		
	}
	

}
