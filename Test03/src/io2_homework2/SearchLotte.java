package io2_homework2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchLotte {

	public static void main(String[] args) throws IOException {
		File open = new File("/Users/choi/Documents/PKNU/java/Test03/src/io2_homework2/zipcode.txt");				// 불러올 파일
		File save = new File("/Users/choi/Documents/PKNU/java/Test03/src/io2_homework2/zipcodeSearchLotte.txt");   // 저장될 파일
		
		String line = ""; // 데이터를 1라인씩 읽어 담을 변수
		
		FileReader			fr = new FileReader(open);
		BufferedReader 		br = new BufferedReader(fr);
		FileWriter			fw = new FileWriter(save);
		BufferedWriter		bw = new BufferedWriter(fw); 
		
		bw.write("ZIPCOD SIDO	GUGUN	DONG	BUNJI	SEQ\n");
		
		while ( (line = br.readLine()) != null ) { // null이 아닐때까지 반복(ture-무한루프), null이 되면 탈출(false-무한루프 탈출)
			// 한 줄을 읽고 각 탭의 데이터를 잘라 배열로 저장 
			String [] info = {};
			info		   = line.split("\\s");    // "\\s"로 공백을 구분해 문자열 자르기
			String zipCode = info[0].trim();
			String sido    = info[1].trim();
			String gugun   = info[2].trim();
			String dong    = info[3].trim();
			String bunji   = info[4].trim();
			String seq     = info[5].trim();
//			String temp1   = info[6].trim();      배열 6개 초과시 에러나는 부분
//			String temp2   = info[7].trim();
			
			
			// bunji 배열에 롯데백화점만 뽑아야함
			// !!! 수정 !!! 경기도의 주소에 ~시 ~구 ~동의 정보가 더 있는 경우도 있음
			// -> or로 검색.. dong || bunji || seq로 검색하기 
			if( dong.contains("롯데백화점") || bunji.contains("롯데백화점") || seq.contains("롯데백화점")) {
				// 롯데백화점이 일치하면 FileWriter, BufferedWriter가 동작해서 zipcodeSearchLotte.txt에 저장되도록
//				String fmt = "%s %s	%s    %s	%s    %s\n";
				String fmt = "%s\n";
				String msg = String.format(fmt, line);
				// *** 공백으로 자르고 배열로 저장했을때 최대 인덱스는 9인데 6개 이상 배열을 만들 시 에러남.. 
				// 그래서 검색된 line을 통으로 출력했음..                                      질문해볼것 ***
				bw.write(msg);
			}
			
		} // while문 끝
		
		
		
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		System.out.println("롯데백화점 추출 완료.");
	}

}

// 롯데백화점만 추출해서 텍스트파일로 만들기
// 한줄 읽어서 BUNJI 탭에서 일치하면 될거같고
// 1. 한 라인 읽어서 split 한다음 각 탭을 배열로 저장하고 -> 번지탭에서 롯데백화점이 일치하면 -> 모든 정보를 한 라인으로 출력하고 다음줄로 넘어감