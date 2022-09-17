package kr.co.ezenac.decision2;

import java.util.Scanner;

/*
 *  사용자로부터 월을 입력받아서
 *  해당 월의 마지막 날짜를 출력하는 프로그램을 작성하시오.
 *  단 2월은 28일로 가정한다.
 *  예시) 월: 3
 *  	31일까지입니다.
 */

public class SwitchTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월: ");
		int month = scan.nextInt();
		
		switch(month) {
		case 2:
			System.out.println("28일 까지입니다.");
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일까지입니다.");
			break;
		case 4: case 6: case 9: case 11 :
			System.out.println("30일까지입니다.");
			break;
		default:
			System.out.println("존재하지 않는 달입니다.");
		}
		scan.close();
		

	}

}
