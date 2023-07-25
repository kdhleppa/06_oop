package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;
import edu.kh.oop.cls.model.vo.User;

public class ClsRun {

	public static void main(String[] args) {
		
		
		ClsService cs = new ClsService();
		// 매개변수 아무것도 없는 생성자는 기본 생성자라고한다.
		// ClsService의 기본 생성자가 작성되어 있지 않지만
		// 문제없이 사용 가능하다.
		// 왜?
		// 컴파일러가 코드를 번역할때
		// 클래스 내부에 생성자가 하나도 없다면
		// 자동으로 기본 생성자를 추가해줌(우리 눈엔 안보임)
		
		
		
		//cs.ex1();
		
		cs.ex5();
		
		
	}

}
