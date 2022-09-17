package kr.co.ezenac.stream;

import java.io.IOException;

public class SystemInTest3 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요: ");
	
		int i;
		
		try {
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			}
			
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
