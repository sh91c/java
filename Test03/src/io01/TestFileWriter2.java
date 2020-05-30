package io01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter2 {

	public static void main(String[] args) throws IOException {
		String filename = "/Users/choi/Documents/PKNU/java/Test03/src/io01/out2";
		File oFile = new File(filename);
		
		FileWriter 	   fw = new FileWriter(oFile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// 예시 : 1 아이유 100 100 100
		int	   num;
		String name;
		int	   kor;
		int    eng;
		int    mat;
		int    tot, avg;
		
		Scanner in = new Scanner(System.in);
		System.out.print("번호 이름 국어 영어 수학 입력: ");
		String inputString = in.nextLine();
		System.out.println(inputString);
		String [] str = inputString.split(",");
		
		num  = Integer.valueOf(str[0].trim());
		name = str[1].trim();
		kor  = Integer.valueOf(str[2].trim());
		eng  = Integer.valueOf(str[3].trim());
		mat  = Integer.valueOf(str[4].trim());
		tot  = kor + eng + mat;
		avg  = tot / 3;
		
		bw.write("번호 이름 국어 영어 수학 총점 평균\n");
		String fmt  = "%d    %s   %d %d %d %d %d";
		String msg  = String.format(fmt, num, name, kor, eng, mat, tot, avg);
		
		bw.write(msg);
		
		bw.close();
		fw.close();
		
		System.out.println(oFile.getName() + "이 작성되었습니다.");

	}

}
