package chap07.textbook.s070803;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); 		// Phone 의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();		// Phone 의 메소드
	}
}
