package chap18.lecture.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEX2 {
	public static void main(String[] args) throws Exception {
		String source = "2008_008_4.jpg";
		String copy = "2008_008_4-copy.jpg";

		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(copy);
		
		int b = 0; 
		
		while ((b = is.read()) != -1) {
			os.write(b);
		}
		System.out.println("복사 완료");
		
		is.close();
		is.close();
	}
	
}
