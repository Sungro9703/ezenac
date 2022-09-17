package kr.co.ezenac.operator1;

public class Assignment {

	public static void main(String[] args) {
		short num = 10;
		num += 77L;		// 강제 형변환 필요하지 않음
		System.out.println(num);
		
		num = (short) (num + 77L);	// 형변환 필요
		System.out.println(num);
		
		
	}

}
