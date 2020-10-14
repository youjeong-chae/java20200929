package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j;
	
	
		i = 30;
		i = 40;
		
		j = 20;
//		j = 10; final키워드를 가지고 있으면 수정 불가능
		
		MyClass o1 = new MyClass();
		o1.field1 = 3;
//		o1.field2 = 4; Class에서 final 필드로 생성자에서 값을 할당받아 수정 불가능
		
		
	}
}
