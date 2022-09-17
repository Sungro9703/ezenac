package kr.co.ezenac.lambda2;

public class LambdaTest {
	public static void main(String[] args) {
		
		MyInterface myinterface = null;
		
		myinterface = (x) -> {
			int result = x * 10;
			System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 갑: " + result);
		};
		myinterface.method(500);
		
		// 괄호 생략
		myinterface = x -> System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 갑: " + (x*10));
		myinterface.method(500);
	}
}
