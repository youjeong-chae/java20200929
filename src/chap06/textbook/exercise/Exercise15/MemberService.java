package chap06.textbook.exercise.Exercise15;

public class MemberService {
	//필드 : 무슨 타입 쓸지 선언
	String id;	
	String password;
	
	// 생성자 : 클래스 이름과 동일
	MemberService()	{
	}
	
	// 메소드
	// 무슨 타입으로 리턴을 받을지 
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			// == 는 안돼, 왜냐면 참조값을 비교할 때는 equals를 쓴다
			return true;
		} else {
		return false;
		}
	}
	 void logout(String id) {
		 System.out.println("로그아웃 되었습니다.");
//		 return; 안써줘도 돼. 로그아웃 되었습니다로 끝나는 실행문
	}
}
