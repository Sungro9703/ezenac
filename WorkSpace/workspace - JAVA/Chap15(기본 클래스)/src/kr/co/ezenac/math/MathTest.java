package kr.co.ezenac.math;

public class MathTest {
	
	public static void main(String[] args) {
		System.out.println("4의 제곱근: " + Math.sqrt(4));
		System.out.println("log2(8): " + (Math.log(8) / Math.log(2)));
		System.out.println("2의 3승: " + Math.pow(2, 3));
		
		System.out.println();
		
		System.out.println("싸인 45: " + Math.sin(Math.toRadians(45)));
		System.out.println("코싸인 45: " + Math.cos(Math.toRadians(45)));
		System.out.println("탄젠트 45: " + Math.tan(Math.toRadians(45)));
	}
}
