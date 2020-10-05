package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개

		
		// 1byte    2byte  4byte  8byte
		// boolean  char
		// byte     short  int    long
		//                 float  double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// 자동 형변환 : 작은 값에서 큰 값으로
		shortValue = byteValue;
		intValue = shortValue;[[]]
		longValue = intValue;
		
		// 강제 형변환 : 큰 값에서 작은 값으로(문제가 생길수 있음_가지고 있는 값을 버려야 할 수 있음)
		longValue = 3333;
		intValue = (int) longValue;  // 앞에 꼭 명시)
		System.out.println(intValue);
		3
		longValue = 2300000000L;
		intValue = (int) longValue;  // 앞에 꼭 명시)
		System.out.println(intValue);
		
		// 자동 형변화(정수 -> 실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		// 잃어버리는 값
		floatValue = longValue;
		
		longValue = 9223372036854775807L;
		floatValue = longValue;
		System.out.println(floatValue);
		
		doubleValue = longValue;
		
		// 강제 형변화 (실수 -> 정수) 소숫점 밑에가 버려짐
		intValue = (int) floatValue;
		
		
	
	}
}
