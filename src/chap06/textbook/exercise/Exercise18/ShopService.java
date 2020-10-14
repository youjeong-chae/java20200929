package chap06.textbook.exercise.Exercise18;

public class ShopService {
	// 필드
		private final static ShopService ins = new ShopService();

	// 생성자 
		private ShopService() {
		}
		
	// 메소드
	public static ShopService getInstance() {
		return ins;
	}
}
