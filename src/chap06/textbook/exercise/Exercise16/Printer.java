package chap06.textbook.exercise.Exercise16;

public class Printer {
	// 필드 : 필요 없으면 생략 가능
	// 생성자 : 필요 없으면 생략 가능
	
	// 메소드
	public void println(int i) {	
 // public 접근지정자 void 리턴을 안하는거
		System.out.println(i);
	}

	public void println(boolean b) {
		System.out.println(b);
	}

	public void println(double d) {
		System.out.println(d);
	}

	public void println(String string) {
		System.out.println(string);
	}
}
