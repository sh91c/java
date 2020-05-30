package io02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException {
		String     filename = "/Users/choi/Documents/PKNU/java/Test03/src/io02/TestFileReaderName";
		
		FileReader      fr  = new FileReader(filename);
		BufferedReader	br  = new BufferedReader(fr);

		String line = "";
		int n = 0;
		while((line = br.readLine()) != null) {
			n++;
			String name = line;
			System.out.println(n + " " + name);
		}
		
		br.close();
		fr.close();
		System.out.println("읽기 완료.");
	}

}
