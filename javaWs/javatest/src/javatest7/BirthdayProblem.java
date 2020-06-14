package javatest7;

public class BirthdayProblem {
	
	public static void main(String[] args) {
		
		double sum=0;
		for(int i =0;i<1000;i++) {			
			int countForDuplicate = getCountForDuplicate();
			sum+=countForDuplicate;
		}
		Double x= 1.2;
		System.out.println(sum/1000);
	}

	private static int getCountForDuplicate() {
		boolean [] used=new boolean[365];
		int count=0;
		while(true) {
			int date=(int)(Math.random()*365);
//			System.out.println(date);
			if(used[date]) {
//				System.out.println("found duplicate"+count +"and date is"+ date);
				break;
			}
			used[date]=true;

			count++;
		}
		return count;
	}

}
