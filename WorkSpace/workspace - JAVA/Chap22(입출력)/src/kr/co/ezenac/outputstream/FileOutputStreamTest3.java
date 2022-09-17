package kr.co.ezenac.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		try(FileOutputStream fos = new FileOutputStream("output.txt3")){
			byte[] bs = new byte[26];
			byte data = 65;			// 'A'의 아스키 값
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			fos.write(bs, 2, 10);			// 배열의 2번째 위치부터 10개 바이트 출력하기
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
