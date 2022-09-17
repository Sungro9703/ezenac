package kr.co.ezenac.loop2;

import java.util.Scanner;

/*
 * ========================
 * 1. 증속	2. 감속	3. 중지
 * ========================
 * 입력: 1
 * 현재 속도: 1
 * ========================
 * 1. 증속	2. 감속	3. 중지
 * ========================
 * 입력: 1
 * 현재 속도 : 2
 * 
 * ========================
 * 1. 증속	2. 감속	3. 중지
 * ========================
 * 입력: 3
 * 프로그램을 종료합니다.
 * 
 * 잘못된 입력 값입니다.
 */
public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.println("1. 증속	2. 감속	3. 중지");
		System.out.println("========================");
		System.out.print("입력: ");
		
		int x = scan.nextInt();
		int s = 0;
		
		while(x != 3) {
		if(x == 1) {
			s++;
			System.out.println("현재속도: " + s);
		}
		else if(x == 2) {
			s--;
			System.out.println("현재속도: " + s);
		}
		else if(x == 3) {
			break;
		}
		else {
			System.out.println("잘못된 입력 값입니다.");
		}
		System.out.println("========================");
		System.out.println("1. 증속	2. 감속	3. 중지");
		System.out.println("========================");
		System.out.print("입력: ");
		x = scan.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}

}
