package chap06.textbook.s060803;

public class CarExample {
	// 229p
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
	}
}
