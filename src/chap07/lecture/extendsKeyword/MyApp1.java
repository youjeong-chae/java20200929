package chap07.lecture.extendsKeyword;

public class MyApp1 {
	public static void main(String[] args) {
		SubClass o1 = new SubClass();	// 인스턴스
		System.out.println(o1.var1);
		o1.method1();
		
		System.out.println(o1.var2);
		o1.method2();
	}
}
