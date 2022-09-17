package kr.co.ezenac.loop2;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면, q를 입력하세요.");
		
		String str = null;
		
		do {
			System.out.print("=>");
			str = scan.nextLine();
			System.out.println("입력받은 메시지: " + str);
		} while(!str.equals("q"));
	
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		}
}
