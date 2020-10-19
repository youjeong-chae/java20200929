package chap09.lecture.localClass;

public class MyApp2LocalVariable {
	public static void main(String[] args) {	
		// 파라미터도 메소드 내부에서 값을 가진 지역변수로 쓰이게 되면 값을 바꿀 수 없다
		final int i = 1;	// final이 안붙어도 묵시적으로 final 자바7번전은 꼭 붙여야 하고 자바9부터는 알아서 붙음
		
		class LocalClass {
			void method1() {
				System.out.println(i);
//				i += 1;  값을 바꿀 수 없음
				
				System.out.println(args);
			}
		}
//		i += 1;
//		args = new String[3];
	}
}
