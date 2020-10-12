package chap05.exercises;

public class Exercise06 {
	public static void main(String[] args) {

		// 배열의 길이에 대한 문제
		// array.length의 값과 array[2].length의 값은 얼마입니까?
		//  array.length : 3, array[2].length : 5
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		System.out.println(array[2].length);
	}
}
