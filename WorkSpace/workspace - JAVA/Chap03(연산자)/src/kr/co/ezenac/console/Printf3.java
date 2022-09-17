package kr.co.ezenac.console;

import java.util.Scanner;

public class Printf3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하고 엔터를 치세요.");
		String name1 = scan.nextLine();		// 줄 단위 입력처리
		
		System.out.println("문자열을 입력하고 엔터를 치세요.");
		String name2 = scan.next();			// 공백이나 탭 단위 처리
		String name3 = scan.next();
		String name4 = scan.next();
		
		System.out.printf("[%s] [%s] [%s] [%s]", name1, name2, name3, name4);
		
		scan.close();
	}

}
