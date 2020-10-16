package chap08.textbook.exercise.Exercise03;

public class SoundableExample {
	private static void printSound(Soundable soundable)	{
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		 PrintSound(new Cat());
		 PringTsound(new Dog());
	}
}
