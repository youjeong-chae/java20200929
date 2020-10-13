package chap06.lecture.method;

public class MyClassReturn {
	int var1;
	
	void method1() {
		System.out.println("메소드1 실행");
	}
	
	// 리턴할 타입 명시 필수
	int method2() { 		
		System.out.println("메소드2 실행");
		
		// return : 메소드 종료, 오른쪽에 있는 값을 호출한 곳으로 돌려줌
		return var1*2;
		
		// 리턴 키워드 다음에는 실행문이 올수 없음. 와도 실행 안돼. 종료했기 때문에
		// System.out.println("실행"); 
	}
}
