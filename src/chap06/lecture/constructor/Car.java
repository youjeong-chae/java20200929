package chap06.lecture.constructor;

public class Car {
	String name;
	int price; //생성자는 파라미터를 안받을 수도 있는데 받을 수 도 있어
	
	// 생성자는 인스턴스를 만들 때 넣게 되는데 주로 필드를 초기화
	// 생성자 : 필드초기화
	/* 	클래스명(파라미터목록) {
			실행코드;
		}   
	*/ 
	
	public Car() {
		System.out.println("생성자 실행됨");
		name = "kia";
		price = 500;
	}
	
	public Car(String carName) {  //생성자는 같은데 파라미터는 다름
		System.out.println("String 받는 생성자 실행됨");
		System.out.println(carName);
		name = carName;
	}
	
	public Car(String carName, int carPrice) {
		name = carName;
		price = carPrice;
	}
}
