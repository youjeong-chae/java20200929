package chap07.lecture.superConstructor;

public class ChildClass extends ParentClass {
	public ChildClass() {		// 명시적으로 부모클래스의 생성자를 상속
//		super();				// 아구먼트가 없는생성자
		super(1);
	}
	
	@Override
	void method1()	{
		super.method1();
		System.out.println("child method1");
	}
}
