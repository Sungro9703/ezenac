package kr.co.ezenac.array;

public class StringArray {
	
	public static void main(String[] args) {
		//문자열 배열
		String[] name = new String[7];
		
		name[0] = new String("이순신");
		name[1] = new String("신사임당");
		name[2] = new String("정도전");
		name[3] = new String("이방원");
		name[4] = new String("하륜");
		name[5] = new String("이숙번");
		name[6] = new String("이성계");
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
	}
}
