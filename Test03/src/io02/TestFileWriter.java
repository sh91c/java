package io02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student{
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	
	
	public Student() {}
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	public int getTot() {
		return this.kor + this.eng + this.mat;
	}
	
	public int getAvg() {
		return getTot() / 3;
	}
	
	@Override
	public String toString() {
		String fmt = "%d %s %d %d %d %d %d\n";
		String msg = String.format(fmt, this.num, this.name, this.kor, this.eng, this.mat, getTot(), getAvg());
		return msg;
	}
	
	
}

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/choi/Documents/PKNU/java/Test03/src/io02/out.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		// 입력
		Scanner in = new Scanner(System.in);
		System.out.print("번호, 이름, 국어, 영어, 수학 입력(입력을 끝냈으면 exit를 입력하세요.) : \n");
		bw.write("번호 이름 국어 영어 수학 총점 평균\n");
		
	// 무한반복영역 시작

		while(true) {
			String inputLine = in.nextLine();
			
//			if(inputLine.compareToIgnoreCase("exit") == 0) break; // 무한 루프 탈출 작성
			if(inputLine.equalsIgnoreCase("exit")) break; // 같은 작동임
			
			String [] str	 = inputLine.split(",");
			int num			 = Integer.valueOf(str[0].trim());
			String name      = str[1].trim();
			int kor			 = Integer.valueOf(str[2].trim());
			int eng			 = Integer.valueOf(str[3].trim());
			int mat			 = Integer.valueOf(str[4].trim());
			
			Student s1 = new Student(num, name, kor, eng, mat);
	
			
			// 출력
			
			String msg = s1.toString();
			bw.write(msg);
		}
		
	// 반복영역 끝
		
		bw.close();
		fw.close();
		
		System.out.println(file.getName() + "이 작성되었습니다.");
	}

}
