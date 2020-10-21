package chap05.lecture;

public class ArrayCoppyEx1 {
	public static void main(String[] args) {
		int[][] arr1 = { { 3, 4 }, { 88, 99 }, { 2, 1 } };
		int[][] arr2 = new int[arr1.length][];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		arr1[0][0] = 100; // arr2에서 3이 100으로 변경될까? 	 응 변경돼
		
		for (int[] arr : arr2) {
			for (int n : arr) {
			System.out.println(n);
			}
		}
	}
}
