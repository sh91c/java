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

public class Post4 {

	static int cnt;
	
	public static void main(String[] args) {
		File open = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/zipcode.csv");
		File save = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/post4_result.txt");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("동명 또는 건물명 검색: ");
		String search = in.nextLine();
		
		try {
			fr = new FileReader(open);
			br = new BufferedReader(fr);
			fw = new FileWriter(save);
			bw = new BufferedWriter(fw);
			
			String line = "";
			br.readLine();
			while((line = br.readLine()) != null) {
				String [] addr = line.trim().split(",");
				String    dong = addr[3].trim();
			
				if( dong.contains(search) ) {
					System.out.println(line);
					bw.write(line + "\n");
					cnt++;
				}
			}
			
			System.out.println("총 " + cnt + "건 검색완료.");
			bw.write("총 " + cnt + "건 검색완료.\n");
			
			System.out.println("4번 문제 완료.");
			
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
