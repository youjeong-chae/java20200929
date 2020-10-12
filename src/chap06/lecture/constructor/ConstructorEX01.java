package chap06.lecture.constructor;

public class ConstructorEX01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(car1.name);
		System.out.println(car1.price);
		
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		Car car3 = new Car("volvo");
		Car car4 = new Car("benz");
		
		System.out.println(car3.name);
		System.out.println(car4.name);
		
		System.out.println(car3.price);
		System.out.println(car3.price);
		
		Car car5 = new Car("hyundai", 700);
		System.out.println(car5.name);
		System.out.println(car5.price);
		
		Car car6 = new Car("samsung", 800);
		System.out.println(car6.name);
		System.out.println(car6.price);
	}
}
