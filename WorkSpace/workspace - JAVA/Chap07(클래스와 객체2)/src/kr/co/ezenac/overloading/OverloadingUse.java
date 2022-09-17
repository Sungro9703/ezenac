package kr.co.ezenac.overloading;

class Cal {
	public int add(int a, int b) {
		return a +b;
	}
	public int add(int a) {
		return a;
	}
	public double add(double a, double b) {
		return a + b;
	}
}

public class OverloadingUse {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int result1 = cal.add(3,9);
		int result2 = cal.add(3);
		double result3 = cal.add(3.0, 9.0);
		
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result2= " + result3);
	
	}
	
	
}
