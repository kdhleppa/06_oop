package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	
	// 속성(필드)
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; // 가입한 회원의 정보를 저장할 변수
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수
	// 기능(생성자, 메서드)
	
	
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		// 반환형
		
		
		int menuNum = 0; // 메뉴 선택용 변수
		// 무조건 한번은 반복
		do {
			System.out.println("========회원 정보 관리 프로그램========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : 
				
				int result = updateMember();
				
				if(result == -1) {
					System.out.println("로그인 후 이용해주세요.");
				} else if(result == 0) {
					System.out.println("회원 정보 수정 실패 (비밀번호 불일치)");
				} else { // result == 1
					System.out.println("회원 정보가 수정되었습니다.");
				} break;
			case 0 : System.out.println("프로그램 종료.."); break;
			default : System.out.println("잘못 입력 하셨습니다.. 다시 입력해주세요");
			}
			
		} while(menuNum != 0); // menuNum 0이면 반복 종료
		
	}
		public String signUp() {
			// (반환형)
			// 해당 메소드가 끝나고 호출한 곳으로 돌아갈 때
			// String 자료형 값을 가지고 돌아간다.
			
			
			System.out.println("\n******* 회원 가입 *******");
			
			System.out.print("아이디 : ");
			String memberId = sc.next();
			
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			
			System.out.print("비밀번호 확인 : ");
			String memberPw2 = sc.next();
			
			System.out.print("이름 : ");
			String memberName = sc.next();
			
			System.out.print("나이 : ");
			int memberAge = sc.nextInt();			
			
			// 비밀번호, 비밀번호 확인이 일치하면 회원가입
			// 일치하지 않으면 회원가입 실패
			
			if (memberPw.equals(memberPw2)) { // 일치하는 경우
			
				// 입력받은 정보를 이용해서 Member 객체 생성한 후
				memberInfo = new Member(memberId, memberPw, memberName, memberAge);
				// 생성된 객체의 주소를 필드에 있는 memberInfo에 대입
				
				
				return "회원가입 성공!!";
				/* 출력구문 메소드를 호출한 곳에서 한번만 쓰고,
				 * return을 이용해 전달할 값을 작성
				 */
				// return : 현재 메소드를 종료하고 호출한 곳으로 돌아감
				// return 값; : 호출한 곳으로 돌아갈 때 값을 가지고 감.
			} else { // 일치하지 않는 경우
				
				return "회원가입 실패!!(비밀번호 불일치)";
			}
			

		}
		
		
		public String login() {
			
			System.out.println("\n**********로그인**********");
			
			
				
				
				
				// 회원 가입을 했는지 부터 확인
			if (memberInfo == null) {
				// null : 아무것도 참조하고 있지 않음.
				return "회원 가입부터 진행 해주세요.";	 
			}
			
			System.out.print("아이디 입력 : ");
			String memberId = sc.next();
			
			System.out.print("비밀번호 입력 : ");
			String memberPw = sc.next();
			
			// 회원 가입 정보에서
			// 저장된 아이디, 비밀번호가
			// 입력된 아이디, 비밀번호와 같으면 " 로그인 성공 "
			// 아니면 "아이디 또는 비밀번호가 일치하지 않습니다"
			
			if (memberInfo.getMemberId().equals(memberId) && memberInfo.getMemberPw().equals(memberPw)) {
			
				loginMember = memberInfo; // 얕은 복사
				// 회원가입정보를 loginMember에 대입하여
				// 어떤 회원이 로그인 했는지를 구분할 수 있게 함.
				
				
				
				return loginMember.getMemberName() + "님 환영합니다.";
			} else {
				return "아이디 또는 비밀번호가 일치하지 않습니다";
			}
			
		}
		
		// 회원 정보 조회 기능
		public String selectMember() {
			System.out.println("\n***** 회원 정보 조회 *****");
			
			// 1) 로그인 여부 확인
			// 로그인 안했을때 "로그인 후 이용해주세요"
			// 2) 로그인이 되어있는 경우
			// 회원 정보를 출력할 문자열을 만들어서 반환
			// 단, 비밀번호는 제외
			
			if (loginMember==null) {
				// loginMember가 참조하는 개체가 없을 경우
				return "로그인 후 이용해 주세요";
			} else {
				
				String str = "이름 : " + loginMember.getMemberName();
				str += "\n아이디 : " + loginMember.getMemberId();
				str += "\n나이 : " + loginMember.getMemberAge();
				return str;
				// return loginMember.toString();
			}
			
		}
		// 회원 정보 수정 기능
		public int updateMember() {
			System.out.println("\n*****회원정보수정*****");
			// 1) 로그인 여부 판별
			// 로그인이 되어있지 않으면 -1 반환
			if (loginMember == null) {
				return -1;
			}
			// 2) 로그인이 되어있을때
			// 2-1) 수정할 회원 정보 입력 받기 (이름, 나이)
			else {
				System.out.println("수정할 정보를 입력하세요");
				System.out.print("이름 : ");
				String memberName = sc.next();
				System.out.print("나이 : ");
				int memberAge = sc.nextInt();
				
				System.out.print("비밀번호 : ");
				String memberPw = sc.next();
				
				// 2-2) 비밀번호를 입력받아서 로그인한 회원의 비밀번호와 일치하는지 확인
				// -> 비밀번호가 같을 경우 로그인한 회원의 이름, 나이 정보를 입력받은 값으로 변경후
				// 1반환
				if (memberPw.equals(loginMember.getMemberPw())) {
					loginMember.setMemberName(memberName);
					loginMember.setMemberAge(memberAge);
					return 1;
				} else { // 비밀번호가 다를 경우 0 반환
					return 0;
				}
			}
			
		}
			
			
		
	
	

}
