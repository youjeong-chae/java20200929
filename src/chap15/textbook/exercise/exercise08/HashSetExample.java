package chap15.textbook.exercise.exercise08;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
//		set.add(new Student(1, "조민우"));
		set.remove(new Student(1, "조민우"));
		
		for (Student s: set) {
			System.out.println(s.studentNum + ":" + s.name);
		}
	}
}