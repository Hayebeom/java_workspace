package date1;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo5 {
	
	public static void main(String[] args) throws ParseException {
		
		// 기념일 계산기
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy.M.d");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.며칠째 날? 	2.그날은 몇일까?");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.print("메뉴를 선택하세요 : ");
		int menuNo = sc.nextInt();
		
		if(menuNo == 1) {
			System.out.print("기념일을 입력하세요 : (입력예 : 2001.4.2");
			String text = sc.next();
			int ONE_DATE_TIME = sc.nextInt();
			Date memorialDay = df.parse(text);
			
			long todayTime = today.getTime();
			long memoriaDayTime = memorialDay.getTime();
			
			long dayCount = (todayTime - memoriaDayTime) / ONE_DATE_TIME;
			System.out.println("오늘은" + dayCount + "(일째 날입니다)");
			
		} else if (menuNo == 2) {
			System.out.println("날짜를 입력하세요 (입력예 : 100) : ");
			int dayCount = sc.nextInt();
			int ONE_DATE_TIME = sc.nextInt();
			
			long todayTime = today.getTime();
			long dayTime = ONE_DATE_TIME * dayCount;
			
			Date futureDay = new Date(todayTime + dayTime);
			String text = df.format(futureDay);
			System.out.println("오늘부터 [" + dayCount +"] 일째는 " + text + " 입니다.");
			
			
		}
		
	}
}
