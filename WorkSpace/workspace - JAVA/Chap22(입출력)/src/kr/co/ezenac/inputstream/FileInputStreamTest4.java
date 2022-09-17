package kr.co.ezenac.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		try(FileInputStream fis =new FileInputStream("input.txt")) {
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {
//				for(bute b : bs) {
//					System.out.println((char)b);
//				}
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
					System.out.println();
				}		
			} catch (Exception e) {
				System.out.println(e);
		}
	}
}

