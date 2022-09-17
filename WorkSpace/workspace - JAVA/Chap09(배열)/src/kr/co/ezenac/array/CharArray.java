package kr.co.ezenac.array;

public class CharArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		// 배열에 각각 값을 저장
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		// char값 출력
		for(char alpha : alphabets) {
			System.out.println(alpha + ","+ (int)alpha);
		}
	
		
		
		
		
	}
}
