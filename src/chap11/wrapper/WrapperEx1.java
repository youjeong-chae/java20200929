package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
	// byte, short, int, long
	// float, double, char, boolean
	
	// Byte, Short, Integer, Long
	// Float, Double, Character, Boolean
	
		int i = 1;
		
		Integer in = Integer.valueOf(i);
		
		method1(in);
		
		int j = 2;
		method1(j);
		
		int l = in.intValue();
		int k = in;		// 언박싱
		
		Integer in2 = 3;
		int m = in2;
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}
}
