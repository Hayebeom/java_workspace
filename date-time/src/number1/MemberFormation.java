package number1;

import java.text.DecimalFormat;

public class MemberFormation {
	
	public static void main(String[] args) {
		
		double number = 1234567.89;
		
		// DecimalFormat
		// 숫자를 지정한 형식의 텍스트로 변환
		
		DecimalFormat df = new DecimalFormat("0000000.00");
		String text = df.format(number);
		System.out.println(text);
		
		
		/*
		  "0"			1234568
		  "#"			1234568
		  "000000000"	0001234568
		  "#########"	1234568
		  "0.0"			1234567.9
		  "#.#"			1234567.9
		  "0.000"		1234567.890
		  "#.###"		1234567.89
		  "0,000"		1,234,568
		  "#,###"		1,234,568
		*/
		
		
		/*
		 기호 		의미			설명
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 0 		숫자			해당 위치에 숫자 없어도 0을 표시
		 #		숫자			해당 위치에 숫자가 없으면 표시하지 않음	
		 .		소수점
		 ,		단위구분자
		
		 */
	}
}
