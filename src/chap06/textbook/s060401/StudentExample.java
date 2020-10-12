package chap06.textbook.s060401;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); 		// 참조변수 = 인스턴스
		// new는 클래스로부터 객체를 생성시키는 연산자
		// new 뒤에 오는 생성자는 클래스() 형태를 가짐
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		// main() 메소드에서 Student 객체를 생성한다.
		// 생성된 객체들이 Student의 인스턴스
	}
}
