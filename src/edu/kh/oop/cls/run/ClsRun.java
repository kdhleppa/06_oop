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
		
		//cs.ex3();
		
		User u1 = new User();
		
		// User 객체 필드 초기화 확인
		u1.setUserName("홍홍");
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
	}

}
