package kr.co.ezenac.variable;

public class VarTest06 {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 = 20;
		float fNum = iNum1;
		
		int iNum2 = 10;
		byte bNum2 = (byte) iNum2;
		
		double dNum = 3.14;
		int iNum3 = (int) dNum;
		
		byte b1 = 127;
//		System.out.println(Byte.MAX_VALUE);
//		byte b2 = b1 + 1;	// 128 (오버플로우)
		byte b2 = (byte)(b1+1);
		System.out.println("강제 캐스팅 후:" + b2);
		
		byte b3 = 127;
		int i1 = 350;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		
		b3 = (byte)i1;	// 큰 바이트 => 작은 바이트 (데이터 손실 발생,원하지 않는 값이 나옴)
		System.out.println(b3);
		
		/*	
		 * 정수와 실수 간의 캐스팅
		 */
		int i2 = 100;
		float f1 = i2;		// 자동 형변환, 캐스팅 생략 가능
		System.out.println("정수 => 실수: " + f1);
		
		float f2 = 10.55f;
		int i3 = (int)f2;
		System.out.println("실수 => 정수: " + i3);		// any 타입 + "" => 문자열 타입
		
	}

}
