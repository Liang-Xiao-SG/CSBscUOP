package javatest;

public class Person {
	int age;
	String name;
	String gender;
	public Person(int age, String name, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}	
	public void eat(String food) {
		System.out.println("Start to eat");
	}
	public void sleep(int hours) {
		System.out.println("Start to sleep");
	}
}
