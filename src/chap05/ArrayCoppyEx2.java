package chap05;

public class ArrayCoppyEx2 {
	public static void main(String[] args) {
		int[] arr1 = { 5, 6, 7 };

		int[] arr2 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[1];
		}
		
		for (int n : arr2) {
			System.out.println(n);
		}
	}
}
