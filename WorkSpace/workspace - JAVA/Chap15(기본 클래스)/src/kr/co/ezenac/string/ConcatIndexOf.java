package kr.co.ezenac.string;

public class ConcatIndexOf {

	public static void main(String[] args) {
		String str1 = "기초";
		String str2 = "프로그래밍";
		
		String str3 = str1.concat(str2);		//String끼리 합치기
		System.out.println(str3);
		
		String str4 = "자바".concat(str3);		//문자열 리터럴과 String 합치기
		System.out.println(str4);
		
		System.out.println();
		
		String str5 = "AppleBananaOrange";
		int num1 = str5.indexOf("a");			//"a" 위치 반환
		int num2 = str5.indexOf("a", num1+1);	//(찾을 문자열, 시작할 위치)
		System.out.println(num1);
		System.out.println(num2);
	}

}
