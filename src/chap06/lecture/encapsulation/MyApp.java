package chap06.lecture.encapsulation;

public class MyApp {
	public static void main(String[] args) {
		Car c1 = new Car();
//		C1.speed = 100;
//		System.out.println(c1.speed);
//		c1.speed = -100;
		c1.setSpeed(300);
		System.out.println(c1.getSpeed());
		c1.setSpeed(-300);		// 300이 0보다 작으니까 false 그럼 이전값을 그대로 가지고 있음
		System.out.println(c1.getSpeed());
	}
}
