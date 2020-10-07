package chap03.textbook;

public class Exercises {
	public static void main(String[] args) {

		// Exercise02
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);

		// Exercise03
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);

		// Exercise04
		int pencils = 534;
		int students = 30;
		// 학생 한명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		// 남은 연필 수
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);

		// Exercise05
		int value = 356;
		System.out.println(value - value % 300);

		// Exercise06
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);

		// Exercise07
		int a = 10;
		int b = 5;
		
		System.out.println( (a>7) && (b<=5));
		System.out.println( (a%3 == 2) || (b%2 != 1));
		
		// Exercise08
		double c = 5.0;
		double d = 0.0;
		
		double e = c % d;
		
		if(Double.isNaN(e)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}	else {
			double r = e +10;
			System.out.println("결과: " + r);
		}
		
	}
}
