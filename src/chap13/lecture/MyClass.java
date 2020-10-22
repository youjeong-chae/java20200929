package chap13.lecture;

public class MyClass<T> { 			// 타입 파라미터
	public void method1() {
		System.out.println("메소드1");
	}
	
	public void method2(T s) {
		System.out.println(s);
		// 클래스 안에서 마음대로 쓸 수 있음
	}
	
}
