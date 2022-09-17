package kr.co.ezenac.staticmethod;

public class UtilityMethod {

	public static void main(String[] args) {
		MyCalculator calculator1 = new MyCalculator();
		int num1 = calculator1.adder(1, 2);
		System.out.println(num1);
		
		// 객체를 생성하지 않고 사용
		int num2 = MyCalculator.adder(2, 3);		//클래스명.메서드명
		System.out.println(num2);
	}

}
