package chap06.textbook.s061303.package2;
// 패키지 다름
import chap06.textbook.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; 		// (o)
		// a.field2 = 1; 	//(x) default 필드 접근 불가(컴파일 에러)
		// a.field3 = 1; 	//(x) private 필드 접근 불가(컴파일 에러)

		a.method1(); 		// (o)
		// a.method2(); 	//(x) default 메소드 접근 불가(컴파일 에러)
		// a.method3(); 	//(x) private 메소드 접근 불가(컴파일 에러)
	}

}
