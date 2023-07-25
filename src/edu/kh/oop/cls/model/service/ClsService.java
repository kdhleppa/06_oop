package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService /* extends Student */{
						// 부모 Student를 상속받음
	
	public void ex1() {
		
		// 클래스 접근 제한자 확인하기
		
		Student std = new Student();
		// public class인 student는 import가능
		
		// TestVO vo = new TestVO();
		// (defult) class인 TestVO는 import 불가(다른패키지)
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public 만 에러 X
		//System.out.println(std.v2);
		//System.out.println(std.v3);
		//System.out.println(std.v4);
		
		
		// 상속 관계에서 직접 접근 가능 범위
		//System.out.println( v1 ); // public
		//System.out.println( v2 ); // protected
		//System.out.println( v3 );
		//System.out.println( v4 );
	}
	
	public void ex2() {
		
		// static 필드 확인 예제
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		// 학생 객체에 name 세팅
		
		std1.setName("홍길동");
		std2.setName("김영희");
		
		// 정보 출력
		System.out.println(std1.schoolName); // public 이기 때문에 직접 접근 가능
		
		// schoolName에 노란줄이 드는 이유 -> 제대로 작성을 안해서
		
		// *** static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용함 ***
		System.out.println(Student.schoolName);
		
		Student.schoolName = "KH";
		System.out.println("변경후 : " + Student.schoolName);
		
		/* static
		 * 
		 * 1) 공유 메모리 여역(또는 정적 메모리 영역) 이라고 함.
		 * 
		 * why? 프로그램 시작 시 static이 붙은 코드들이 모두
		 * static 영역에 생성되고,
		 * 프로그램이 종료될 때 까지 사라지지 않음
		 * 그리고, static 영역에 생성된 변수는 어디서든지 공유 가능(공유)
		 * 
		 * 2) 사용방법 : 클래스명.변수명
		 */
		
	}
	
	public void ex3() {
		// 생성자 확인 태스트
		// Student 객체를 기본 생성자를 이용해 생성하고 이를 참조하는 참조변수 s1에 대입
		Student S1 = new Student();
						// 기본 생성자


	}
	public void ex4() {
	User u1 = new User();
	
	// User 객체 필드 초기화 확인
	u1.setUserName("홍홍");
	System.out.println(u1.getUserId());
	System.out.println(u1.getUserPw());
	System.out.println(u1.getUserName());
	System.out.println(u1.getUserAge());
	System.out.println(u1.getUserGender());
	
	User u2 = new User();
	 
	System.out.println(u2.getUserId());
	System.out.println(u2.getUserPw());
	System.out.println(u2.getUserName());
	System.out.println(u2.getUserAge());
	System.out.println(u2.getUserGender());
	
	// 문제점 : u1 이 참조하고 있는 User 객체와
	//			u2 가 참조하고 있는 User 객체의 필드 값이 모두 동일함
	//			왜? 같은 기본 생성자로 User 객체를 생성했기 때문에
	
	System.out.println("--------------------");
	// 해결 방법 1: setter를 이용해서 새로운 값 대입
	
	u2.setUserId("asdf123456");
	u2.setUserPw("1q2w3e");
	u2.setUserName("김영희");
	u2.setUserAge(19);
	u2.setUserGender('여');
	
	System.out.println(u2.getUserId());
	System.out.println(u2.getUserPw());
	System.out.println(u2.getUserName());
	System.out.println(u2.getUserAge());
	System.out.println(u2.getUserGender());
	
	
	// 해결 방법 2: 매개변수 생성자를 이용해서
	//				객체가 생성될 때 부터 다른값으로 필드를 초기화
	
	
	
	User u3 = new User("test3", "password333");
	System.out.println(u3.getUserId());
	System.out.println(u3.getUserPw());
	
	}
	
	public void ex5() {// 매개변수 생성자 예제
		// 기본생성자
		User u1 = new User();
		User u2 = new User("user02","pass02"); // 매개변수 2개 생성자
		User u3 = new User("user03","pass03","김용기", 30 ,'남');
		
		
		System.out.printf("u1: %s / %s / %s / %d / %c\n",
				u1.getUserId(), u1.getUserPw(), u1.getUserName(),
				u1.getUserAge(), u1.getUserGender());
		System.out.printf("u2: %s / %s / %s / %d / %c\n",
				u2.getUserId(), u2.getUserPw(), u2.getUserName(),
				u2.getUserAge(), u2.getUserGender());
		System.out.printf("u3: %s / %s / %s / %d / %c\n",
				u3.getUserId(), u3.getUserPw(), u3.getUserName(),
				u3.getUserAge(), u3.getUserGender());
		
		
		
	}

}
