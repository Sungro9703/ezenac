package kr.co.ezenac.decision;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(3+5);
		System.out.println("3"+"5");
		System.out.println("3"+5);
		
		// 참조형 변수
		String str1 = new String("abc");
		String str2 = "abc";
		String str3 = str2;		
		
		System.out.println("str1의 현재 값: [" + str1 + "]");
		System.out.println("str2의 현재 값: [" + str2 + "]");
		System.out.println("str3의 현재 값: [" + str3 + "]");
		
		// 비교연산자 ==
		// 실제 값 비교가 아닌 그 변수에 저장된 주소값 비교
		System.out.println("str1 == str2: " + (str1 == str2)); 	
		System.out.println("str1 == str2: " + (str1 == str3)); 	
		System.out.println("str1 == str2: " + (str2 == str3)); 	
		
		// 참조형 변수(객체)를 비교할 때 해당 객체의 객체.equals(비교대상) 메서드를 사용. 
		System.out.println("str1.equals(str2): " + (str1.equals(str2)));
		System.out.println("str2.equals(str3): " + (str2.equals(str3)));
		System.out.println("str1.equals(str3): " + (str1.equals(str3)));
		
		
		
	}

}
