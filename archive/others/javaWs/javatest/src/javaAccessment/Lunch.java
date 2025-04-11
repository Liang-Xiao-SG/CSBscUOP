package javaAccessment;

public class Lunch {
	static int s=0;
	static void add() {
		s++;
	}
	public static void main(String[] args) {
		Food lunch =new Food();
		
		for(int i=0;i<100;i++) {
			add();
		}
		System.out.println(s);
	}
}

abstract class Food {
	


	abstract void printf();
}

class Pepper extends Food {
	void printf() {
		System.out.println("spicy");
	}
}