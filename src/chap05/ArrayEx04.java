package chap05;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {99, 88, 77};
		int[] arr2 = {99, 88, 76};
		
		for (int i = 0; i <3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("----------");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3; 
		int[] arr4;
		
		arr3 = new int[] {11, 22, 33};
//		arr4 = {11, 22, 33}; 
//		배열 변수를 이미 선언한 후에 다른 실행 문에서 중괄호를 사용한 배열 생성은 허용되지 앟는다 p153	
	}
}
