package kr.co.ezenac.operator2;

public class ShortCircuitEvaluation {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean result;
		
		result = ((x = x + 1) < 0) && ((y = y + 1) > 0);
		System.out.println("result = " + result);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
		result = ((x = x + 1) > 0) || ((y = y + 1) > 0);
		System.out.println("result = " + result);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
//		논리 연산을 수행하는 중에 앞의 항의 값만으로 결과가 결정되는 경우 뒤의 항은 실행되지 않는다.
		
		
		
		
	}

}
