package kr.co.ezenac.decision;

/*
 * 점수를 입력하세요: n
 * 
 * 점수가 80~89점 사이입니다.
 * 학점은 B입니다.
 * 
 * 90~100 A
 * 80~89  B
 * 70~79  C
 * 		  D
 */

import java.util.Scanner;

public class IfElseIfElse2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요.: ");
		
		int score = scan.nextInt();
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("점수가 90~100점 사이입니다");
		}
		else if(score >= 80) {
			grade = 'B';
			System.out.println("점수가 80~89점 사이입니다");
		}
		else if(score >= 70) {
			grade = 'C';
			System.out.println("점수가 70~79점 사이입니다");
		}
		else {
			grade = 'D';
			System.out.println("점수가 70점 미만입니다");
		}
		System.out.println("학점은 " + grade + "입니다.");
		
		scan.close();
		
	}
}
