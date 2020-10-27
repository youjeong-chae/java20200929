package chap04.exercises;

public class Exercise05_1 {
	public static void main(String[] args) {
		int sum = 60;
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if(sum == 4 * x + 5 * y) {
					System.out.println("("+ x + ", " + y + ")");
				}
			}
		}
	}
}
