package postHomework;

// 2.2. 전국의 시도와 구군 명칭과 우편번호 개수
//  ex) 서울 강남구 187개
//      	   ~
//      부산 부산진구 120개

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Post2_2 {

	public static void main(String[] args) {
		File open = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/zipcode.csv");
		File save = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/post2_2_result.txt");
		
		FileReader 		 fr = null;
		BufferedReader	 br = null;
		FileWriter 		 fw = null;
		BufferedWriter   bw = null;
		
		try {
			fr = new FileReader(open);
			br = new BufferedReader(fr);
			fw = new FileWriter(save);
			bw = new BufferedWriter(fw);
			
//			zipcode,sido,gugun,dong,bunji,seq
			
			String []  temp3 = new String[250];
			List<String>  temp = new ArrayList<>();
			List<Integer> list = new ArrayList<>();
			int 		 cnt       = 1;
			List<String> nextPost  = new ArrayList<>();
			String    	 prevGugun = "";
			int			 cnt2      = 1;
			
			String line = "";
			br.readLine();
			while( (line = br.readLine()) != null ) {
				String [] addr  = line.trim().split(",");
				String    sido  = addr[1].trim();
				String    gugun = addr[2].trim();
				temp.add(gugun);
				for (int i = 0; i < temp3.length; i++) {
					temp3[i] = gugun;
				}
				
				if( !prevGugun.equals(gugun) ) {
					nextPost.add(sido + " " + gugun);
					prevGugun = gugun;
				}
			} // 구군 중복없이 출력만
			
			prevGugun = "";
			
			for (int i = 0; i < temp.size()-1; i++) {
				if ( !temp.get(i).equals(prevGugun) ) {
					prevGugun = temp.get(i);
				}
				if ( temp.get(i).equals(prevGugun) ) {
					cnt++;
					if ( !temp.get(i+1).equals(prevGugun)) {
						list.add(cnt);
						cnt = 1;
						prevGugun = temp.get(i+1);
					}
				}
			}
			for (int i = 0; i < temp.size(); i++) {
				if( temp.get(i).equals("청원군") ) {
					cnt2++;
				}	
			}
			
			
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(nextPost.get(i) + " " + list.get(i));
				bw.write(nextPost.get(i) + " " + list.get(i) + "\n");
			}
			
			System.out.println("충북" + " " + temp3[249] + " " +cnt2);
			bw.write("충북" + " " + temp3[249] + " " +cnt2 + "\n");
			
			
			System.out.println("2.2번 문제 완료.");
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
