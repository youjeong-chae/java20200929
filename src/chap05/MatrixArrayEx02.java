package chap05;

public class MatrixArrayEx02 {
	public static void main(String[] args) {
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[2][];
		mat2[0] = new int[2]; // 왜 0인데 앞이 아니라 뒤에 ?
		mat2[1] = new int[3];

		int[] arr1 = null;
		arr1 = new int[4];
	}
}
