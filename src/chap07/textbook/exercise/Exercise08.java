package chap07.textbook.exercise;

	class A {}
	class B extends A {}
	class D extends B {}
	class E extends B {}
	
	public class Exercise08 {
		public static void main(String[] args) {
		B b = (B) new A();
	}
}


//	B b = _________________
//	
//	메소드 선언 : void method(B b) { }
//	메소드 호출 : method(____________)

// 답 : 2번 강제 타입 변환은 자동 타입 변환 한 후에만 가능 