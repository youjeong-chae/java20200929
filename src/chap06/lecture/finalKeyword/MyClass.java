package chap06.lecture.finalKeyword;

public class MyClass {
	int field1;
	final int field2;	// class에서 final 필드는 생성자에서 꼭 값을 넣어줘야 함
	
	final static int field3 = 20;	// static도 마찬가지 
	final static int field4;
	
	static {
		field4 = 30;
	}
	
	public MyClass() {
		field2 = 99; 	// 이후에는 값을 못 바꿈
	}
}
