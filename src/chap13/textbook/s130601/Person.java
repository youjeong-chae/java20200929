package chap13.textbook.s130601;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}