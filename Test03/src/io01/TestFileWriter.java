package io01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		File outFile = new File("/Users/choi/Documents/PKNU/java/Test03/src/io01/abc1.txt");
		
		if(outFile.exists()) { 
			System.out.println("파일이 존재합니다.");
		}else{
			System.out.println("파일이 없습니다.");
		}
		
		FileWriter	fw1    = new FileWriter(outFile);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		
		String msg = "";
		String [] names = {"석준","원석","다솔","소연","은영"};
		
		for (int i = 0; i < names.length; i++) {
			
			msg = String.format("%d %s\n", i+1, names[i]);
			bw1.write(msg);			
		}
		
		bw1.close();
		fw1.close();
		
		System.out.println(outFile.getName() + "파일이 저장되었습니다.");
	}

}
