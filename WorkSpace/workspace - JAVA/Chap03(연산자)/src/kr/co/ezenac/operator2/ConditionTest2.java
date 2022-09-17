package kr.co.ezenac.operator2;

import java.util.Scanner;

	public class ConditionTest2 {
		public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("점수를 입력하세요.: ");
	int score = scanner.nextInt();
	
	char grade = (score >= 90) ? 'A' : 'B';
	System.out.println("당신의 점수등급은: " + grade);
	
//	삼항연산자 중첩
	grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
	System.out.println("당신의 점수등급은: " + grade);
	
	
	
	scanner.close();
	}

}
