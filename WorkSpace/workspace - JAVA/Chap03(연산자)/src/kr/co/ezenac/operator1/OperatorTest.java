package kr.co.ezenac.operator1;

public class OperatorTest {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 0;
		int result = 0;
		
//		예외 처리 코드 
		try {
			result = v1 / v2;
		} catch(Exception e) {		// 산술연산 예외 발생하는 부분
			System.out.println("예외 발생:" + e.getMessage());
		}
		
		//System.out.println("나누기 결과: " + result);

	}

}
