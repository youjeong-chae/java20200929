package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		/* byte : 정수형
		 * 크기 : 1byte (8bit)
		 *  
		 *  2진법 : 0과 1의 조화
		 * 
		 *-128: 1000 0000 
		 *    :              1씩 계속 빼다보면 
		 * -3 : 1111 1101
		 * -2 : 1111 1110
		 * -1 : 1111 1111
		 *             +1
		 *    1 0000 0000 : 8개의 비트만으로 표현 앞의 1버려
		 *                 
		 *  0 : 0000 0000
		 *  1 : 0000 0001
		 *  2 : 0000 0010
		 *    :
		 *    :
		 * 127: 0111 1111 양수로 표현할 수 있는 가장 큰 수
		 *             +1
		 *-128: 1000 0000 음수로 표현할 수 있는 가장 작은 수
		 * 
		 * 음수, 0, 양수 : 맨앞에 비트가 1이면 음수고, 
		 *                 0이면 0 또는 양수
		 *       
		 */
		
		byte byteValue;
		
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
//		byteValue = 128; 오류 뜸
		
		byteValue++;  //++ : 1증가
		System.out.println(byteValue);
	}
}
