package chap08.lecture.interfaceKeyword;

public class Malamute extends KindaDog implements Pet{	
	// implements Pet를 쓰면 컴파일 에러가 생김
	// 아직 구현을 안해서. 꼭 구현해줄 것
	@Override
	public void bark() {
		System.out.println("왈왈");
	}
	
	@Override
	public void sit() {
		System.out.println("말라뮤트가 앉습니다.");
	}
}
