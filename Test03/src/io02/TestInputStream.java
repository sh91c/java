package io02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestInputStream {

	public static void main(String[] args) throws IOException {
		String infile = "/Users/choi/Documents/PKNU/java/Test03/src/io02/TestInputStreamtxt";
		FileInputStream fis = new FileInputStream(infile);
		
		int ch;
		while( (ch = fis.read())  != -1 ) { // EOF(End Of File: 파일의 마지막부분.. -1)가 나올때 까지 반복하며 한 문자씩 읽는다.
			System.out.print( (char) ch );
		}
		
		fis.close();

	}

}
