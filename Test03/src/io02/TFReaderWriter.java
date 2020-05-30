package io02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TFReaderWriter {

	public static void main(String[] args) {
		File file1 = new File("/Users/choi/Documents/PKNU/java/Test03/src/io02/TestFileReaderName");
		File file2 = new File("/Users/choi/Documents/PKNU/java/Test03/src/io02/TestFileReaderName_result");
		
		
		FileReader         fr = null;
		BufferedReader     br = null;
		FileWriter         fw = null;
		BufferedWriter     bw = null;
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			String line = "";
			int num = 0;
			
			int [] location   = {0,0,0,0,0,0,0}; // 동구 서구 남구 북구 중구 사하구 해운대구
			
			while( (line = br.readLine()) != null ) {
				++num;
				String name = line;
				
				// 이름 사이 공백 넣기
				String [] cutName = {};
				cutName           = name.split("");
				String newName    = cutName[0] + " " + cutName[1] + " " + cutName[2];
				
				// 이름 옆에 지역 출력 및 지역 카운트
				String [] addr    = {};
				addr              = name.split(",");
				String addrName   = addr[1].trim();
				if(addrName.equals("동구")) location[0]++;
				else if(addrName.equals("서구")) location[1]++;
				else if(addrName.equals("남구")) location[2]++;
				else if(addrName.equals("북구")) location[3]++;
				else if(addrName.equals("중구")) location[4]++;
				else if(addrName.equals("사하구")) location[5]++;
				else if(addrName.equals("해운대구")) location[6]++;
				
				// 초성으로 팀 출력
				int tNum = 0;
				if (cutName[0].compareTo("ㄱ") >=  0 && cutName[0].compareTo("낗") <= 0) tNum = 1;
					else if (cutName[0].compareTo("ㄴ") >=  0 && cutName[0].compareTo("닣") <= 0) tNum = 2;
					else if (cutName[0].compareTo("ㄷ") >=  0 && cutName[0].compareTo("띻") <= 0) tNum = 3;
					else if (cutName[0].compareTo("ㄹ") >=  0 && cutName[0].compareTo("맇") <= 0) tNum = 4;
					else if (cutName[0].compareTo("ㅁ") >=  0 && cutName[0].compareTo("밓") <= 0) tNum = 5;
					else if (cutName[0].compareTo("ㅂ") >=  0 && cutName[0].compareTo("삫") <= 0) tNum = 6;
					else if (cutName[0].compareTo("ㅅ") >=  0 && cutName[0].compareTo("앃") <= 0) tNum = 7;
					else if (cutName[0].compareTo("ㅇ") >=  0 && cutName[0].compareTo("잏") <= 0) tNum = 8;
					else if (cutName[0].compareTo("ㅈ") >=  0 && cutName[0].compareTo("찧") <= 0) tNum = 9;
					else if (cutName[0].compareTo("ㅊ") >=  0 && cutName[0].compareTo("칳") <= 0) tNum = 10;
					else if (cutName[0].compareTo("ㅋ") >=  0 && cutName[0].compareTo("킿") <= 0) tNum = 11;
					else if (cutName[0].compareTo("ㅌ") >=  0 && cutName[0].compareTo("팋") <= 0) tNum = 12;
					else if (cutName[0].compareTo("ㅍ") >=  0 && cutName[0].compareTo("핗") <= 0) tNum = 13;
					else if (cutName[0].compareTo("ㅎ") >=  0 && cutName[0].compareTo("힣") <= 0) tNum = 14;
				
				String fmt = "%03d. %s, %s %d팀\n";
				String msg = String.format(fmt, num, newName, addrName, tNum);
				
				
				System.out.println(msg);
				bw.write(msg);
				
			}
			
			String fmt = "==============================\n"
					+ "동구 인원: %d 명\n"
					+ "서구 인원: %d 명\n"
					+ "남구 인원: %d 명\n"
					+ "북구 인원: %d 명\n"
					+ "중구 인원: %d 명\n"
					+ "사하구 인원: %d 명\n"
					+ "해운대구 인원: %d 명\n";
			String msg = String.format(fmt, location[0],location[1],location[2],location[3],location[4],location[5], location[6]);
			
			bw.write(msg);
			
			System.out.println(msg);
			System.out.println("작업완료.");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
			}
		}
	}

}
