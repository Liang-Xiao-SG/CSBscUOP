package javatest3;

public class FinalTest {

	public static void main(String[] args) {
		final Student s1=new Student();
		FinalTest t=new FinalTest();
		t.change(s1.x);
		t.chagne1(s1);
		System.out.println(s1.name);
		System.out.println(s1.x);
		char x = 0;
		System.out.println("  "+x);
	}
	void change(int x) {
	    x=999;
	}
	void chagne1(Student s) {
		s.name="name changed";
	}
}

class Student{
	int x;
	String name="";
}