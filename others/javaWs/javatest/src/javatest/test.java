package javatest;

import java.util.function.Function;

public class test extends TestParent{
	private String childName;
	
	public test(String name) {
		super(name);
		this.childName = super.parentName+" child";
		System.out.println(this.childName);
	}


	

	@Override
	protected void dothing() {
		System.out.println("do something");
	}

	static void doSeveralTimes(Runnable task, int repCount) {
		for (int i = 0; i < repCount; i++) {
			task.run(); // Perform the task!
		}
	}
	static double sum( Function<Integer, String> f, int start, int end ) {
		double total = 0;

		return total;
		}
	class Food {
	    Food() { System.out.println("bland"); }
	}
	class Pepper extends Food {
	    Pepper() { this("spicy"); }
	    Pepper(String flavor) { System.out.println(flavor); }
	}
	public  class Lunch {
	    public void main(String[] args) {
	        Food lunch = new Pepper();
	    }
	}
}
