package chap02.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}
}
