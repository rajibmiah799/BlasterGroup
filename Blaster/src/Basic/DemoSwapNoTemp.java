package Basic;

public class DemoSwapNoTemp {

	public static void main(String[] args) {
		int a = 25;
		int b = 30;
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("a " + a);
		System.out.println("b " + b);

	}

}
