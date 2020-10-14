package chap06.lecture.packageKeyword;

import java.util.Scanner;
import java.util.*;		// 모든 클래스가 import
// Ctrl + Shift + O 를 누르면 필요한 패키지가 자동으로 
// import java.lang.String; 생략가능

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1
			= new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		java.lang.String str = "java";
		String str2 = "css";
		
		ArrayList list = new ArrayList();
	}
}
