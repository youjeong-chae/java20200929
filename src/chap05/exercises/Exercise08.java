package chap05.exercises;

public class Exercise08 {
	public static void main(String[] args) {
		// 주어진 배열의 전체 항목의 합과 평균값을 구해보세요(중첩for문 사용)
		// 배열의 배열 
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
	
		// 작성위치
		
		int cnt = 0;
		
		for (int i=0 ; i < array.length; i++) { 		// 3번 돌아  0부터 세니까 2 길이는3
			for (int j =0; j < array[i].length; j++) { 	// 인덱스는 0부터 세고 length는 갯수
				sum += array[i][j];
				cnt++;
			}
		}
		
		avg = (double) sum / cnt;  
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}
}
