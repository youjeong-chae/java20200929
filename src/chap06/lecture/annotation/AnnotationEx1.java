package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEx1 {
	@MyAnnotation
	private int i;

	// 주석들.......
	
	// annotation
	
	@Override
	@MyAnnotation
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation(value="abc", number=5, names= {"c", "d"})
	public static void mymethod() {
		
	}
}