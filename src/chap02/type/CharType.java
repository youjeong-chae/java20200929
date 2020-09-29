package chap02.type;

public class CharType {
	public static void main(String[] args) {
		// char : 2byte
		// short는 정수니까 음수, 양수, 제로
		// char 은 문자
		// 작은 따옴표를 이용해 하나의 문자를 표현

		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab'; 컴파일에러
//		charValue = '';
		charValue = ' '; // 스페이스는 문자
		System.out.println(charValue);
		
		charValue = 44032; // 2byte 문자
		System.out.println(charValue);
	
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00'; //역슬래시 16진법
		System.out.println(charValue);
	}
}
