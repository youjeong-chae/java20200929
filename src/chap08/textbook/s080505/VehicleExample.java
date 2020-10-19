package chap08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();  Vehicle 인터페이스에는 checkFare() 가 없음
		
		Bus bus = (Bus) vehicle;	// 강제 타입변환
		
		bus.run();
		bus.checkFare();
	
		System.out.println("------------------");
		
		Driver driver = new Driver();
		driver.dirve(new Bus());
		driver.dirve(new Taxi());
	
	}
}
