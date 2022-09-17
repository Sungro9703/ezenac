package kr.co.ezenac.operator2;

public class OrderOper {

	public static void main(String[] args) {
		System.out.println();			// println()을 이용한 줄바꿈
		System.out.print("\n");			// 줄바꿈 특수 문자 (아스키코드)
		System.out.println("-------");

		int num = 5;					// num에 이미 이진수 할당
		System.out.print(num + '\n'); 	// 이진수 + 이진수 => 줄바꿈 되지 않음
		System.out.println("-------");
		System.out.print(num + "\n");
		
	}

}
