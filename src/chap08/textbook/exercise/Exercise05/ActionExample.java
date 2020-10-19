package chap08.textbook.exercise.Exercise05;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
			// 중괄호가 클래스의 몸통
			// 추상메소드의 몸통을 꼭 구현해야함
		};
		action.work();
	}
}
