package kr.co.ezenac.decision;

import java.util.Scanner;

/*
 * 성별 (1은 남자, 2는 여자)
 * 나이, 신체등급 순으로 입력받아서
 * => 신체등급 1~3: 현역
 * 	  신체등급 4: 공익
 * 	   그 외 : 면제
 * 여자일 때에는 추가적인 정보 입력 없이 "여성에게는 국방의무가 없습니다."가 출력되게 작성하시오.
 * 남자이지만 미성년자일 경우 추가적인 정보 입력 대신 "미성년자에게는 아직 신체등급이 부여되지 않습니다."
 */
public class IfNested {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("성별을 입력하시오.(1은 남자 2는 여자): ");
			int gender = scan.nextInt();
				
			if(gender == 1) {
				System.out.print("나이를 입력하시오.: ");
				int age = scan.nextInt();
			if(age >=19) {
				System.out.print("신체등급을 입력하시오.(1~4): ");
				int grade = scan.nextInt();
				if(grade <= 3) {
					System.out.println("현역입니다.");
				}
				else if(grade == 4) {
					System.out.println("공익입니다.");
				}
				else {
					System.out.println("면제입니다.");
				}
			}
			else {
				System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
				}
			}
			else {
				System.out.println("여성에게는 국방의무가 없습니다.");
				}
			
			scan.close();

	}

}
