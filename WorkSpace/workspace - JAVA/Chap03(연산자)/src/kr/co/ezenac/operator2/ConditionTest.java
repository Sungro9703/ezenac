package kr.co.ezenac.operator2;

import java.util.Scanner;

// 입력받은 두 수 중에서 큰 수를 출력하시오.
public class ConditionTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 받은 두 수 중에서 큰 수를 출력하시오.");
		System.out.print("입력1 : ");
		int x = scan.nextInt();

		System.out.print("입력2 : ");
		int y = scan.nextInt();

		int big = (x > y) ? x : y;
		System.out.println(big);
		
		scan.close();
	}

}
