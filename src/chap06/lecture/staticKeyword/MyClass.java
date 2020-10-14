package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2;
	int var1;
	
	static {
		System.out.println("static block");
		var2 = 3000;
	}
	
	void method1() { 	
		method2();
		System.out.println(var2);	// 얘는 돼?
		System.out.println(var1);
	}
	
	static void method2() {			// 클래스에 고정된 멤버, 객체를 생성하지 않고 사용할 수 있는 필드와 메소드
//		method1();
//		System.out.println(var1);	얘는 안되고
		System.out.println(var2);
	}
}
