package chap06.textbook.exercise.Exercise15;

public class MemberServiceExample {
	public static void main(String[] args) {
		// 객체생성 new 생성자
		MemberService memberService	= new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인이 되었습니다.");
			memberService.logout("hong");
		}	else {	
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
