package chap06.lecture.thisKeyword;

public class MyClass {
	int var;
	
	MyClass() {
		
		
	}

	MyClass(int var) {
		this.var = var;
	}
	
	void method1() {
		int var = 5;
		System.out.println(this.var);	// this를 붙이면 필드를 가리킴 int var1;
		System.out.println(var);		// int var = 5;
	}
	
	void method2() {
		this.method1();
	}
}
