package chap05.exercises;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		int a = 0;

		for (int i = 0; i < array.length; i++) {
			a = array[i];
			if (max < a) {
				max = a;
			}
		}
		System.out.println("max: " + max);
	}
}
