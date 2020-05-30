package io03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestPost1 {
	
	static String prevSido = "";
	static String sido = "";
	static List<String> sidoList = new ArrayList<>();
	static int sidoCnt = 0;
	
	static int cnt = 0; // 전역변수
	
	public static void main(String[] args){
		String 			path = "/Users/choi/Documents/PKNU/java/Test03/src/io03/zipcode.csv";
		File 			file = new File(path);
		if ( !file.exists() ) {
			System.out.println(path + "읽을 파일이 없습니다.");
			return;		// 함수 종료(메인)
//			System.exit(0); // 시스템 강제 종료
		}
		File			cntSidoName = new File("/Users/choi/Documents/PKNU/java/Test03/src/io03/1_cntSidoName.csv");
		File			cntSeoulGugun = new File("/Users/choi/Documents/PKNU/java/Test03/src/io03/2_cntSeoulGugun.csv");		
		File			printBusanNaugu_dong = new File("/Users/choi/Documents/PKNU/java/Test03/src/io03/3_printBusanNamgu_dong.csv");		
		File			searchAddr = new File("/Users/choi/Documents/PKNU/java/Test03/src/io03/4_searchAddr.csv");		
//		File			temp = new File("/Users/choi/Documents/PKNU/java/Test03/src/io03/5_1_seoul.csv");		
		
		FileReader 		fr = null;
		BufferedReader 	br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = "";
			while((line = br.readLine()) != null) {
				address_work(line);
				cntSidoName(line);
			} // 전국의 롯데백화점 찾기
			
			br.readLine();
			while((line = br.readLine()) != null) {
				cntSidoName(line);
			}
			
			for (String sido : sidoList) {
				System.out.println(sido);
			}
			System.out.println(sidoCnt);
			
			System.out.println( TestPost1.cnt + "건 검색 되었습니다.");
			System.out.println("작업 완료!");
			
		} catch (IOException e) {
			System.out.println("오류 발생: " + e.getMessage());
		} finally {
			try {
				if( br != null ) br.close();
				if( fr != null ) fr.close();
			} catch (IOException e) {
			}
		}
	}

	private static void cntSidoName(String line) {
		String [] addr = line.trim().split(",");
		sido = addr[1].trim();
		
		if ( !prevSido.equals(sido) ) {
			sidoList.add(sido);
			prevSido = sido;
			sidoCnt++;
		}
	}

	private static void address_work(String line) {
//		String [] addr 	= line.trim().split(",");
//		String zipcode 	= addr[0];
//		String sido 	= addr[1];
//		String gugun	= addr[2];
//		String dong		= addr[3];
//		String bunji	= addr[4];
//		String seq		= addr[5];
//		String fmt = "%s %s %s %s %s %s\n";
//		String msg = "";
//		if ( dong.contains("롯데백화점") ) {
//			msg = String.format(fmt, zipcode, sido, gugun, dong, bunji, seq);
//			System.out.println(msg);
//			cnt++;
		}
//	}
}
