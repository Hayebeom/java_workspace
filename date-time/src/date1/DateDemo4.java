package date1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateDemo4 {
	public static void main(String[] args) throws ParseException {
		
		/*
		 지정된 날짜 형식으로 작성된 문자열을 Date로 변환
		*/
		
		String text = "1995.12.1.";
		SimpleDateFormat df = new SimpleDateFormat("yyyy.M.d");
		Date date = df.parse(text);
		System.out.println(date);
				
	}
}
