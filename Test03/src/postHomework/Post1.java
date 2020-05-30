package postHomework;

// 전국의 시도 명과 개수 출력하기(중복제거)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Post1 {

	static int sidoCnt;
	
	public static void main(String[] args) {
		File open = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/zipcode.csv");
		File save = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/post1_result.txt");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader(open);
			br = new BufferedReader(fr);
			fw = new FileWriter(save);
			bw = new BufferedWriter(fw);
			
			String line = "";
			String prevSido = "";
			List<String> sidoList = new ArrayList<>();
			br.readLine();
			while((line = br.readLine()) != null) {
				String [] addr = line.trim().split(",");
				String    sido = addr[1].trim();
				
				if( !prevSido.equals(sido) ) {
					sidoList.add(sido);
					prevSido = sido;
					sidoCnt++;
				}
			}
			for (String sido : sidoList) {
				System.out.println(sido);
				bw.write(sido + "\n");
			}
			bw.write("전국 시도 개수: " + sidoCnt);
			
			System.out.println("전국 시도 개수: " + sidoCnt);
			System.out.println("1번 문제 완료.");
			
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
