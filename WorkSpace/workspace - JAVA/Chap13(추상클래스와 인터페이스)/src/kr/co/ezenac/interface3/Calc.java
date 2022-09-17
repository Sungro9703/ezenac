package kr.co.ezenac.interface3;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default 키워드 사용 시 body 생성 가능
	default void decribe() {
		System.out.println("계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private method()");
	}
	private static void myStaticMethod() {
		System.out.println("private static method()");
	}
}
