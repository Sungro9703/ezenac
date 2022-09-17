package kr.co.ezenac.decision;
/*
 * 1. System.out에 있는 3가지 메서드
 * 		1) print(): 괄호 안의 내용을 출력하고, 오른쪽부터 시작
 * 		2) println(): print a line, 괄호 안의 내용을 출력하고, 다음 줄부터 시작 
 * 		3) printf(): print in format, 괄호 안의 내용을 "형식"에 맞추어 출력, 오른쪽부터 시작
 *
 * 2. escape character
 *		1) \n: 다음줄 문자, 이후 출력될 내용을 다음줄로 옮김
 *		2) \t: 탭 공백 문자, 탭 공백을 넣음
 *		3) \": 문자로써의 "을 의미
 */	
public class Printf {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("DEF");
		
//		1) 다음 줄 문자
		System.out.print(str1 + "\n");
		System.out.print(str2 + "\n");
//		2) 탭 공백 문자
		System.out.print(str2 + "\t");
//		3) \"
		System.out.println("\"");
		
		int num = 2800;
		System.out.println("=====1. Decimal=====");
//		10진법 정수를 그대로 출력하시오.
		System.out.printf("[%d]\n", num);
//		10진법 정수를 오른쪽 정렬 5자리 출력하시오.
		System.out.printf("[%5d]\n", num);
//		10진법 정수를 오른쪽 정렬 3자리 출력하시오.
//		출력해야 할 내용이 지정된 자리수보다 많으면 자릿수 지정은 무시
		System.out.printf("[%3d]\n", num);
		
//		10진법 정수를 왼쪽 정렬 5자리로 출력하시오.
		System.out.printf("[%-5d]\n" , num);
//		10진법 정수를 왼쪽 정렬 5자리로 하고, 왼쪽 공백은 0으로 채우시오.
		System.out.printf("[%05d]\n" , num);
		
		System.out.println("=====2. Hexadecimal=====");
		num = 1787;
//		16진법 정수를 자릿수 그대로, 알파벳은 소문자로 출력하시오
		System.out.printf("[%x]\n", num);
//		16진법 정수를 자릿수 그대로, 알파벳은 대문자로 출력하시오
		System.out.printf("[%X]\n", num);
//		16진법 정수를 5자리, 오른쪽 정렬로, 대문자로 출력하시오.
		System.out.printf("[%5X]\n", num);
//		16진법 정수를 5자리, 왼쪽 정렬로, 소문자로 출력하시오.
		System.out.printf("[%-5x]\n", num);
//		16진법 정수를 5자리, 오른쪽 정렬로, 대문자로, 빈자리는 0으로 출력하시오.
		System.out.printf("[%05X]\n", num);
		
		System.out.println("=====3. float=====");
		double d = 123.45;
//		실수를 출력하시오.
		System.out.printf("[%f]\n", d);
//		실수를 15자리 출력하시오.
		System.out.printf("[%15f]\n", d);
//		실수를 15자리, 소수점 아래 첫 째자리까지 출력하시오.
		System.out.printf("[%15.1f]\n", d);
//		실수를 15자리, 왼쪽정렬로 소수점 아래 셋 째자리까지 출력하시오.
		System.out.printf("[%-15.3f]\n", d);
//		실수를 15자리, 공백은 0으로, 소수점 아래 셋 째자리까지 출력하시오.
		System.out.printf("[%015.3f]\n", d);
		
		System.out.println("=====4. String=====");
		String str3 = new String("abcDEF");
//		문자열을 출력하시오.
		System.out.printf("[%s]\n", str3);
//		문자열을 대문자로 출력하시오.
		System.out.printf("[%S]\n", str3);
		
//		printf() 사용 시 주의사항
//			1) %문자와 넘겨받는 값의 종류가 같아야한다.
//			2) 존재하지 않는 %문자를 사용하면 에러 발생.
//			3) %문자의 갯수보다 넘어오는 값의 갯수가 많으면 문제없음.
//			4) %문자의 갯수가 넘어오는 값의 갯수보다 많으면 에러 발생.
		
		

	}

}
