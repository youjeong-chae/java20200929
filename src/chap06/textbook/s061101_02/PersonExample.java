package chap06.textbook.s061101_02;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-123457", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; 			final 필드는 값수정 불가
		//p1.ssn = "654321-7654321";	final 필드는 값수정 불가
		p1.name = "을지문덕";
	}
}
