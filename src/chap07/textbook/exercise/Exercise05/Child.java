package chap07.textbook.exercise.Exercise05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {	// 명시적으로 부모클래스의 생성자를 호출해줘야해
		Super("name");
		this.studentNo = studentNo;
	}
}
