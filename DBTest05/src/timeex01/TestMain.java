package timeex01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestMain {

	// 자바의 날짜와 시간 처리
	public static void main(String[] args) {
		// 자바 버전별로 함수가 다르다.
		// 1. new Date
		Date today = new Date();  // 컴퓨터의 현재 날짜와 시간을 가져온다.
		                          // 생성자를 사용한 new Date()는 java.util.Date로 사용가능, sql로 불러오면 따로 작성해야함
		System.out.println(today);                  // 미국식
		System.out.println(today.toString());
		System.out.println(today.toLocaleString());
		System.out.println(today.toGMTString());    // 국제 표준시
		
	    System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초 %02d요일\n"
	    				  , today.getYear(), today.getMonth()+1, today.getDate()
	    				  , today.getHours(), today.getMinutes(),today.getSeconds()
	    				  , today.getDay()); // 자바스크립트에서 사용되고있음
	    
	    
	    // 2. SimpleDateFormat ( v1.6? )
	    Date today2 = new Date();
	    SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy/MM/dd");
	    SimpleDateFormat timeFmt = new SimpleDateFormat("hh:mm:ss a");
	    
	    System.out.println("날짜: " + dateFmt.format(today2));
	    System.out.println("시간: " + timeFmt.format(today2));
	    
	    // 3.
	    Date xmas = new Date(119, 11, 25); // 2020년 12월 25일.. 불편
	    System.out.println(xmas);
	    
	    long time = System.currentTimeMillis();
	    System.out.println("time: " + time); // 밀리초로 출력됨.
	    
	    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
	    String str = dayTime.format(new Date(time));
	    System.out.println(str);
	    
	    // 경과 시간 체크
	    long start = System.currentTimeMillis();
	    double   d = 1.0;
	    for (int i = 0; i < 1000000; i++) {
	    	d = d * 0.1;
		}
	    long end = System.currentTimeMillis();
	    
	    System.out.println((end - start) + "밀리초 걸림.");
	    
	    
	    // 4.1
	    Calendar cal = Calendar.getInstance();
	    System.out.println("Year: " + cal.get(Calendar.YEAR));
	    System.out.println("Month: " + (cal.get(Calendar.MONTH)+1));
	    System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
	    System.out.println("Hours: " + cal.get(Calendar.HOUR_OF_DAY));
	    System.out.println("Minutes: " + cal.get(Calendar.MINUTE));
	    System.out.println("Second: " + cal.get(Calendar.SECOND));

	    // 4.2 특정 파일의 날짜 정보 불러오기
	    File         f = new File("/Users/choi/Documents/GitHub/todolist.zip");
	    Date  fileDate = new Date( f.lastModified() );
	    Calendar  cal2 = Calendar.getInstance();
	    cal2.setTime( fileDate );
	    System.out.println("파일 생성 및 최근 수정 일자");
	    System.out.println("Year: "    + cal2.get(Calendar.YEAR));
	    System.out.println("Month: "   + (cal2.get(Calendar.MONTH)+1));
	    System.out.println("Day: "     + cal2.get(Calendar.DAY_OF_MONTH));
	    System.out.println("Hours: "   + cal2.get(Calendar.HOUR_OF_DAY));
	    System.out.println("Minutes: " + cal2.get(Calendar.MINUTE));
	    System.out.println("Second: "  + cal2.get(Calendar.SECOND));
	    
	    // 5. 날짜 구하기
	    GregorianCalendar today3 = new GregorianCalendar();
	    int year = today3.get(today3.YEAR);
	    int month = today3.get(today3.MONTH) + 1;
	    int date = today3.get(today3.DAY_OF_MONTH);
	    
	    GregorianCalendar gc = new GregorianCalendar();
	    System.out.println( gc.get (Calendar.YEAR));
	    System.out.println( String.valueOf(gc.get(Calendar.MONTH)+1));
	    System.out.println( gc.get (Calendar.DATE));
	    System.out.println( gc.get (Calendar.DAY_OF_MONTH));
	    
	    // 6. 현재 날짜에서 두달전 날짜 구하기 
	    Calendar cal4 = Calendar.getInstance();
	    cal4.add(cal4.MONTH, -2);
	    System.out.println( cal4.get(cal.YEAR) );
	    System.out.println( cal4.get(cal.MONTH) + 1 );
	    System.out.println( cal4.get(cal.DATE) );
	    
	    // 7. 특정일부터 n일 수 만큼 증감한 날짜 구하기
	    // 특정일의 시간을 long 타입으로 읽은 다음
	    // +, - (long) + n * 24 * 60 * 60 * 1000
	    // 날짜(+,- n) 읽어오기
	    Date today4 = new Date();
	    Date tomorrow = new Date( today4.getTime() + (long) - 30 * 24 * 60 * 60 * 1000);
	    System.out.println(tomorrow.toLocaleString());
	    
	    // 두 날짜 사이의 차이를 일 수로 구하기
	    
	    // 해당 월의 마지막 날짜 구하기
	}

}
