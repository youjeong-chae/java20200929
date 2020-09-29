package chap02.variable;

public class VariableScope {
	public static void main(String[] args) {
		// 변수의 사용 범위
		// 선언되 코드 블럭 안에서만 사용 가능

		int a = 3;
		
		if (true) {
			int b = 5;
			System.out.println(a);
			System.out.println(b);
		} // 변수가 선언된 범위 안에서만 사용 {b}
		System.out.println(a);
//		System.out.println(b);
	} // a는 요기까지 범위
}
