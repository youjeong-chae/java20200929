package chap06.lecture;

public class MyAppAPI {
	public static void main(String[] args) {
		String s = new String("java");
		Comparator<String> a = s.CASE_INSENSITIVE_ORDER;
		// 필드 형식
		// 클래스의 필드에 접근하려면 변수이름.필드이름

		String t = new String(new char[] { 'h', 't', 'm', 'l' });
		System.out.println(t);
		char c = t.charAt(1);
		System.out.println(c);
	}
}

// 클래스는 필드, 생성자, 메소드로 구성되어 있음
// String 도 클래스