package Abstraction;

public abstract class Myclass implements calc {

	@Override
	public void add() {
		int add = x+y;
		System.out.println(add);
	}
	@Override
	public void sub(int x, int y) {
		int sub = x-y;
		System.out.println(sub);
	}
	@Override
	public void multiple(double x, double y) {
		double multiple= x*y;
		System.out.println(multiple);		
	}
	//@Override
	//public double sub (double a, double b) {
		//double sub = a-b;
		
		
	}
	
	

	


