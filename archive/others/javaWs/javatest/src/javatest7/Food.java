package javatest7;

public class Food {
	static int count;
	private String flavor="sweet";
	
    public Food(String s) {
		flavor=s;
	}
    String getFlavor() {
    	return flavor;
    }
    
    void printFlav() {
    	System.out.println("bland");
    }
	 static public void main(String[] args) {
      Food pepper=new Food("spicy");
      System.out.println(pepper.getFlavor());	
      }

}
