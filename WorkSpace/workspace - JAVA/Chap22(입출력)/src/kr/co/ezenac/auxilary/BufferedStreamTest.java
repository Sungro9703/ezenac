package kr.co.ezenac.auxilary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long milisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("mybatis-3.5.9.zip");
			FileOutputStream fos = new FileOutputStream("copy2.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			milisecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			milisecond = System.currentTimeMillis() - milisecond;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데" + milisecond + "milisecond 소요되었습니다.");
	}

}
