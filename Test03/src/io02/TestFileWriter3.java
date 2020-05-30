package io02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter3 {

	public static void main(String[] args) throws IOException {
		File       file = new File("/Users/choi/Documents/PKNU/java/Test03/src/io02/out3.csh");
		
		FileWriter fw = new FileWriter(file, true); // 				boolean true  : append -> 데이터를 덮어쓰지 않고 추가로 작성함
													// 작성하지 않거나 또는 false : 기존의 데이터를 무시하고 덮어씀. (새로 작성된 것 처럼)
		
		fw.write("Square\n");
		
		fw.close();
		System.out.println("저장되었습니다.");
	}

}
