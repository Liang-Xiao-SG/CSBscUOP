package javatest;

public class Counter {
	public static void main(String[] args) {
		int whilestart=5;
		while (whilestart>0){
			System.out.printf("now number is %5d\n",whilestart);
			whilestart--;
		}
		//equivalent do while loop
		int dowhilestart=5;
		do{
			System.out.printf(" do while now number is %5d\n",dowhilestart);
			dowhilestart--;
		}while(dowhilestart>0);
		
		for(int i =0;i%2==0&&i<10;i++) {
			System.out.printf("now number is %5d\n",i);
		}
	}
}
