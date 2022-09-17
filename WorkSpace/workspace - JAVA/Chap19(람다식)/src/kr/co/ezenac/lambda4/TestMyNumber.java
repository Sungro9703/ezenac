package kr.co.ezenac.lambda4;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyMaxNumber max = (x, y) -> (x >= y)?x:y;		//삼항 연산자 
		System.out.println(max.getMaxNumber(10, 20));
		
	}

}
