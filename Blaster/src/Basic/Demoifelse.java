package Basic;

public class Demoifelse {

	public static void main(String[] args) {
		int x = 25;
		int y = 20;
		if (x > y) {
			System.out.println("x is bigger");
		} // x is bigger than y
		
		else if (x < y) {
			System.out.println("y is bigger");
		} // y is bigger than x
		
		else if (x == y) {
			System.out.println("x & y are equal");
		}
		else {
			System.out.println("unknown");
		}

	}//end of main

}//end of class
