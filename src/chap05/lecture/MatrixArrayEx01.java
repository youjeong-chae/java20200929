package chap05.lecture;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		
	
	int[][] matrix = new int[3][2];
	
	int[] arr = new int[3];
	System.out.println(arr.length);
	
	System.out.println(matrix[0].length);
	System.out.println(matrix[1].length);
	System.out.println(matrix[2].length);
	
	arr[0] = 99;
	arr[1] = 88;
	arr[2] = 77;
	
	matrix[0][0] = 9; //첫번째의 첫번째, [행번호][열번호] 0부터 시작임
	matrix[2][0] = 1; //세번째의 첫번째
	
//	matrix[2][2] = 2; 열 없음 오류뜸
//	matrix[3][0] = 3; 행 없음 오류뜸
	}
}
