package kr.co.ezenac.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("reader.txt");

		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
	}

}
