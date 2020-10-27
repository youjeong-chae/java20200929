package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		
		int cnt = 0;
		int r = 0;
		// 더 이상 읽을 내용이 없으면 -1
		while ((r = is.read()) != -1) {
			System.out.print((char) r);
			cnt++;
		};
		System.out.println(cnt);
		
		
		is.close();
	}
}
