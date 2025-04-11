package javatest;

public class TestParent {
	protected String parentName;
	
	public TestParent(String name) {
		this.parentName = name+" parent";
		System.out.println(parentName);
	}
	protected void dothing() {
		System.out.println("do nothing");
	}
}
