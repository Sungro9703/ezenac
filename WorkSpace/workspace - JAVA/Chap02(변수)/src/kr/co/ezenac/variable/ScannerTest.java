package kr.co.ezenac.variable;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/*
		 * Scanner 클래스: 입력을 받기 위한 클래스
		 * 				 자원(Resource)는 사용하고 나서 반드시 닫아줘야 함.
		 */				 
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("정수 한자리 입력: ");
//		int num = scan.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자: "+ num);
//		
//		System.out.print("실수 한자리 입력: ");
//		float num2 = scan.nextFloat();
//		System.out.println("사용자로부터 입력받은 숫자: " + num2);
		
//		next(): 공백을 기준으로 문자열 입력 => 단어 입력 시 사용
//		nextLine(): 엔터키를 입력할 때까지 문자열을 입력 => 문장을 입력 시 사용
		System.out.print("문자열 입력: ");
		String str = scan.nextLine();
		System.out.println("사용자로부터 입력받은 문자열: " + str);
		
		System.out.print("문자열 입력(숫자): ");
		int result = 100;
		String num = scan.nextLine();
//		 Integer.parseInt(): 문자열로 입력받은 숫자들을 
//		   				     문자열이 아니라 숫자로 바꿔주는 역할을 하는 메서드
		int temp = Integer.parseInt(num);	
		int total = result + temp;
		System.out.println("연산결과: " + total);
		
		scan.close();
	}

}
