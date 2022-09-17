package kr.co.ezenac.operator1;

public class AssignOperatorTest {

	public static void main(String[] args) {
		int result = 0;
//		복합 대입 연산자
		result += 10;		// result = result + 10;
		System.out.println("result: " + result);
		
		result -= 5;		// result = result -5;
		System.out.println("result: " + result);
		
		result *= 5;		// result = result * 5;
		System.out.println("result: " + result);
		
		result /= 5;		// result = result / 5;
		System.out.println("result: " + result);
		
		result %= 5;		// result = result % 5;
		System.out.println("result: " + result);
		
	}

}
