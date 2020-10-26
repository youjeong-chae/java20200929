package chap15.textbook.exercise.p1608;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamExample {
	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}
	
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);

		Map<String, List<String>> groupingMap = new HashMap<>();
		// 작성위치
		
		
		// 출력
		List<String> developers = groupingMap.get("개발자");
		List<String> designers = groupingMap.get("디자이너");
		
		System.out.print("[개발자]");
		for (String name : developers) {
			System.out.print(" " + name);
		}
		System.out.println();
		
		System.out.print("[디자이너]");
		for (String name : designers) {
			System.out.print(" " + name);
		}
	}

}






