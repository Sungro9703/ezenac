package kr.co.ezenac.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("reader.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}
			catch (IOException e) {
				e.printStackTrace();	
		}
	}
}

