package lang2;

import java.util.StringTokenizer;

public class StringDemo2 {
	public static void main(String[] args) {
		
		/*
		★ split()과 StringTokenizer
		spilt()는 구분자를 기준으로 잘랐을 때 빈 문자열로 배열에 담음
		StringTokenizer는 구분자를 기준으로 잘랐을 때 빈 문자열은 제외
		*/
		
		String str = "김유신,,강감찬,이순신";
		
		String[] items = str.split(",");
		
		for (String item : items) {
			System.out.println("배열의 값 : [" + item + "]");
		}
		
		// 배열의 값 : [김유신] [] [강감찬] [이순신]
		System.out.println();
		
		StringTokenizer tokens = new StringTokenizer(str, ",");
		while(tokens.hasMoreTokens()) {
			String value = tokens.nextToken();
			System.out.println("토큰의 값 : " + value);
		}
		// 배열의 값 : [김유신] [강감찬] [이순신]
		
	}
}
