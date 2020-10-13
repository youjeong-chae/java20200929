package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1......");
	}
	
	// 면접에서 오버로딩과 오버라이딩의 다른점을 물어보기도 함
	
	// 메소드 이름이 같아도 () 파라미터가 다르면 사용 가능
	void method1(int i) {
		System.out.println("method1######");
	}
	
//	void method1(int j) {		타입이 같아서 컴파일 오류
//		System.out.println("method1*******");
//	}
	
	void method1(double i) {
		System.out.println("method1*******");
	}
	
	// 파라미터의 갯수가 달라도 사용가능
	void method1(int i, int j) {
		System.out.println("method1 int, int");
	}
	
	// 파라미터의 타입이 다르면 사용가능(순서)
		void method1(int i, double j) {
			System.out.println("method1 int, double");
		}
	
		void method1(double i, int j) {
			System.out.println("method1 double, int");
		}
		
//		리턴타입이 달라도 파라미터가 같으면 사용 불가
//		void method1(double i, int j) {
//			System.out.println("method1 double, int, return int");
//			return 3;
//		}
}
