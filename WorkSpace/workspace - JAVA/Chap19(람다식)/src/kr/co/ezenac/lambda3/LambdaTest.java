package kr.co.ezenac.lambda3;

public class LambdaTest {

	public static void main(String[] args) {
		MyInterface myInterface = null;
		
		myInterface = (x, y) -> {
			int result = x + y;
			return result;
		};
	
		int result = myInterface.method(100, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값: " + result);
		
		
		myInterface = (x, y) -> {return x + y;};
		result = myInterface.method(300, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값2: " + result);
		
		myInterface = (x, y) -> x + y;
		result = myInterface.method(1000, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값3: " + result);
	}
}
