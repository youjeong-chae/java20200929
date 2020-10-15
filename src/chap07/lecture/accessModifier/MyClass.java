package chap07.lecture.accessModifier;

public class MyClass {
	// public > protected > (default/package private) > private
	
	// public : 모두 사용가능 
	// protected : 다른 패키지에 있는 상속받은 클래스(자식 패키지 까지는 사용가능)
	// (default) : 패키지 내에서 사용가능
	// private : 클래스 내에서만 사용가능
	
	public int publicVar;
	protected int protectedVar;
	int defaultVar;
	
}
