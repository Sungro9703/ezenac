package kr.co.ezenac.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("입력 후 '끝'이라고 쓰세요: ");
	
		int i;
		
		try {
			// 바이트로 읽어들인 것을 문자로 변환해 줌
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '끝') {
				System.out.print((char)i);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
