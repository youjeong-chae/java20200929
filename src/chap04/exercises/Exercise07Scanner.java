package chap04.exercises;

import java.util.Scanner; // 꼭 써야함

public class Exercise07Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 꼭 써야함

		System.out.println("입력");
		String line = scanner.nextLine(); // nextLine 콘솔에 쓸수 있게 해준다
										  // 마우스 가져가 보면 String으로 표시 nextLine는 string을 가짐
		                                  // nextint 는 int

		System.out.println("출력");
		System.out.println(line);

		int num = Integer.valueOf(line);
		// Integer = int, valueOf() ()안을 앞에 Integer로 바꿔라
		int i = num * 2;
		System.out.println(i);
	}
}
