package kr.co.ezenac.string;

public class StingTest {

	public static void main(String[] args) {
		
		//new 연산자와 문자열 매개변수가 있는 생성자를 이용
		String str1 = new String("오늘은 금요일입니다.");
		String str2 = new String("오늘은 금요일입니다.");
		
		// 문자열 리터럴을 직접 대입
		String str3 = "오늘은 금요일입니다.";
		String str4 = "오늘은 금요일입니다.";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 동일 객체 참조");
		}
		else {
			System.out.println("str1과 str2는 다른 객체 참조");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 동일 객체 참조");
		}
		else {
			System.out.println("str3과 str4는 다른 객체 참조");
		}
	}

}
