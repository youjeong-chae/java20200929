package chap06.lecture.method;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.var1 = 3;
		o1.myMethod();
//		o1.yourMethod(); 설계도에 없어 컴파일 오류
		
		MyClass o2 = new MyClass();
		o2.myMethod();
		
		o2.myMethod2(5);
		o2.myMethod2(7);
		
		o1.myMethod2(7);
		
		o1.myMethod3(1,2);
	}
}
