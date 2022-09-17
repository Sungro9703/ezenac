package kr.co.ezenac.operator2;

public class PrefixPostfixOper {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(++num); 		// num 값 1증가 후 출력
		System.out.println(num); 		// num 값 증가 되어있음
		
		System.out.println(num++); 		// 출력 후에 값이 증가
		System.out.println(num); 		// 위 행에서 증가된 값 확인
	}

}
