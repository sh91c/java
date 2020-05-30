package postHomework;

// 2.1. 서울시 자치구 이름과 개수 출력하기(중복제거)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Post2_1 {

	public static void main(String[] args) {
		File open = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/zipcode.csv");
		File save = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/post2_1_result.txt");
		
		FileReader 		 fr = null;
		BufferedReader	 br = null;
		FileWriter 		 fw = null;
		BufferedWriter   bw = null;
		
		try {
			fr = new FileReader(open);
			br = new BufferedReader(fr);
			fw = new FileWriter(save);
			bw = new BufferedWriter(fw);
			
		
			int seoulGuCnt = 0;
			String prevGu = "";
			List<String> seoulGu = new ArrayList<>();
			String line = "";
			while((line = br.readLine()) != null) {
				String [] addr  = line.trim().split(",");
				String    sido  = addr[1].trim();
				String    gugun = addr[2].trim();
				if( sido.equals("서울") && !prevGu.equals(gugun) ) {
						seoulGu.add(gugun);
						prevGu = gugun;
						seoulGuCnt++;
				}
			}
			System.out.println("2013년 기준 서울특별시는 ");
			bw.write("2013년 기준 서울특별시는 \n");
			for (String gugun : seoulGu) {
				System.out.print(gugun + " ");
				bw.write(gugun + " ");
			}
			System.out.println("\n총 " + seoulGuCnt + "개의 자치구가 존재합니다.");
			bw.write("\n총 " + seoulGuCnt + "개의 자치구가 존재합니다.");
			
			System.out.println("2번 문제 완료.");
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
