package postHomework;

// 부산 남구 x동 출력

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Post5 {
	
	public static void main(String[] args) {
		File open = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/zipcode.csv");
		File save = null;
		
		int cnt = 0;
		String sidoName = "";
		
		FileReader	   fr = null;
		BufferedReader br = null;
		FileWriter     fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(open);
			br = new BufferedReader(fr);
			
			String line = "";
			br.readLine();
			
			while( (line = br.readLine()) != null ) {
				String [] addr = line.trim().split(",");
				String    sido = addr[1].trim();
			
				if(!sido.equals(sidoName)) {
					if(cnt != 0) {
						bw.close();
						fw.close();
					}
					
					sidoName = sido;
					
					save = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/post5_" + sidoName + "_result.txt");
					fw   = new FileWriter(save);
					bw   = new BufferedWriter(fw);
					
					cnt++;
				}
				bw.write(line + "\n");
			}
			
			System.out.println("5번 문제 완료.");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (IOException e1) {
			}
		}
	}
}
