package chap06.lecture.accessModifier.other;

import chap06.lecture.accessModifier.MyClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		System.out.println(o1.var1);	// public : 모든 외부 클래스에서 사용가능
//		System.out.println(o1.var2);	//(default) : 같은 패키지 내의 외부 클래스에서 사용 가능
//		System.out.println(o1.var3);		// private : 클래스 내에서만 사용가능
	}
}
