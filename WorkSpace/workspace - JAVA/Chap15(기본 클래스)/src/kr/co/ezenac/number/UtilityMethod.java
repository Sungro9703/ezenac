package kr.co.ezenac.number;

public class UtilityMethod {
	public static void main(String[] args) {
		Integer num1 = Integer.valueOf(5);
		Integer num2 = Integer.valueOf("0408");
		
		System.out.println("큰 수: " + Integer.max(num1, num2));
		System.out.println("작은 수: " + Integer.min(num1, num2));
		System.out.println("합: " + Integer.sum(num1, num2));
		
		System.out.println("12의 2진 표현: OB" + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현: OB" + Integer.toOctalString(12));
		System.out.println("12의 16진 표현: Ox" + Integer.toHexString(12));
	}
}
