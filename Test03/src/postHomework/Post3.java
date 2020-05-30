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

public class Post3 {

	static int sidoCnt;
	
	public static void main(String[] args) {
		File open = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/zipcode.csv");
		File save = new File("/Users/choi/Documents/PKNU/java/Test03/src/postHomework/post3_result.txt");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader(open);
			br = new BufferedReader(fr);
			fw = new FileWriter(save);
			bw = new BufferedWriter(fw);
			
			String prevDong = "";
			String line = "";
			String prevSido = "";
			List<String> sidoList = new ArrayList<>();
			br.readLine();
			while((line = br.readLine()) != null) {
				String [] addr = line.trim().split(",");
				String    sido = addr[1].trim();
				String   gugun = addr[2].trim();
				String    dong = addr[3].trim();
				
				if( dong.contains(" ")) {
					String[] divDong = dong.split(" ");
					String   splitDong = divDong[0].trim();
					if ( sido.equals("부산") && gugun.equals("남구") && !prevDong.equals(splitDong)) {
						prevDong = splitDong;
						if( prevDong.equals(splitDong) )	{
							sidoList.add(sido + " " + gugun + " " + splitDong);
						}
					}
				}
			}
			
			for (int i = 0; i < sidoList.size(); i++) {
				System.out.println(sidoList.get(i));
				bw.write(sidoList.get(i) + "\n");
			}
			
			System.out.println("3번 문제 완료.");
			
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
