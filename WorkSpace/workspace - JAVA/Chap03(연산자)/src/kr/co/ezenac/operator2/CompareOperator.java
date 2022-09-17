package kr.co.ezenac.operator2;

public class CompareOperator {

	public static void main(String[] args) {
		System.out.println("2 >= 1 : " + (2 >= 1));
		System.out.println("2 <= 1 : " + (2 <= 1));
		
		// 비교연산 시에도 형변환이 일어남
		System.out.println("1.0 == 1 : " + (1.0 == 1)); 	// 실수형으로 자동 형변환
		System.out.println("1.0 != 1 : " + (1.0 != 1)); 	
		

	}

}
