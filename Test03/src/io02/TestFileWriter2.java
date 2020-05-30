package io02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter2 {

	public static void main(String[] args) {
		String path = "/Users/choi/Documents/PKNU/java/Test03/src/io02/";
		String filename = "out2.csh";
		String filepath = path + filename;
		
		File       file = new File(filepath);
		FileWriter fw   = null;				    // try~catch 에서 fw.close()를 하기 위해 예외처리문 밖에서 null로 작성해놓자
		try {
			fw          = new FileWriter(file); // new 와 동시에 파일 점유권을 가진다(open을 가짐)
			fw.write("hello");
			System.out.println("저장완료");
		} catch (IOException e) {
			System.out.println("파일 저장 중 오류 발생!\n관리자에게 문의하세요." + e.getMessage());
		} finally {
		  try {								
				if(fw != null)
					fw.close();						// fw.close()는 try~catch문 안에 작성되어야한다.
			} catch (IOException e1) {
			}
		}
	}
}
