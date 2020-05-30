package io02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) throws IOException {
		String filename = "/Users/choi/Documents/PKNU/java/Test03/src/io02/TestOutputStreamtxt";
		FileOutputStream fos = new FileOutputStream(filename, true);
		
		for (int i = 'A'; i <= 'Z'; i++) {
			fos.write(i);
		}
		
		fos.close();

	}

}
