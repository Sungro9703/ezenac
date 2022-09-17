package kr.co.ezenac.lambda6;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		// 람다식 쓰임1 : 함수의 구현부가 변수에 대입함.
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("EzenIT!");
		
		// 람다식 쓰임2: 매개변수로 전달됨
		showMyString(lambdaStr);
		
		// 람다식 쓰임3: 람다식 자체가 반환됨
		PrintString pstr = returnStr();
		pstr.showString("EzenIT");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("EzenIT!!");
	}
	
	public static PrintString returnStr() {
		return s -> System.out.println(s + "!!!");
	}
	
}
