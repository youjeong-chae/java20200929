package chap06.textbook.s061504;

public class Service {

	@PrintAnnotation
	public void method() {
		System.out.println("실행 내용1");
	}

	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}

	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}