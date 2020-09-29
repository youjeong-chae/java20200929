package chap02.type;

public class DoubleType {
	public static void main(String[] args) {
		// double : 8byte
		// 부동소수점 ieee : 754
		
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		doubleValue = 3e6; // 3.0 * 10의 6제곱
		System.out.println(doubleValue);
		
		// 실수형 계산시 주의
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		System.out.println(d3);
		// 답이 0.3이 안돼 : 컴퓨터의 한계
		// 컴퓨터가 이진법으로 값을 저장하기 때문에 
		// 저장할 수 있는 공간의 한계 (근사치를 가지게 됌)
	}
}
