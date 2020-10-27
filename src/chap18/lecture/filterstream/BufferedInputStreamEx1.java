package chap18.lecture.filterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "2008_008_4.jpg";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		long start = System.currentTimeMillis();
		while (bis.read() != -1) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("총 읽은 시간 " + (end-start) + "ms");
		fis.close();
		
		
		
	}
}
