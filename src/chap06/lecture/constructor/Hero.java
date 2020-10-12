package chap06.lecture.constructor;

public class Hero {
	String name;
	int power;
	
	public Hero(String name, int power) {
		this.name = name;  
		this.power = power;
	// name으로 하면 name이 다잡혀서 this.를 사용(인스턴스를 대체, 필드지칭)
	}
	
	public Hero(String name) {
		this.name = name;  
		this.power = 100;
	}
}
