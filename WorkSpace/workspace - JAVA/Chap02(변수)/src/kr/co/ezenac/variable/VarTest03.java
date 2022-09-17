package kr.co.ezenac.variable;

public class VarTest03 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 65;		// 10진수 값 할당
		char ch3 = 0x41;	// 16진수 값 할당
		char ch4 = 0b0000000001000001;	// 2진수 값 할당
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		
		char ch5 = '한';			
		char ch6 = '\uD55C';	// 유니코드
		
		System.out.println(ch5);
		System.out.println(ch6);
	}

}
