package set;

import java.util.Date;
import java.util.HashMap;

public class HashMapDemo3 {
	
	public static void main(String[] args) {
		
		// Map에서 V에 해당하는 타입을 Object로 지정하는 경우
		// 여러 종류의 값을 저장하는 용도로 사용 가능
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("no", 100);
		data.put("title","자바의정석");
		data.put("writer", "남궁성");
		data.put("publisher", "도우출판사");
		data.put("price", 25000);
		data.put("discountRate", 0.05);
		data.put("incomeDate", new Date());
		
		// V의 타입을 Object로 지정하는 경우
		// 값을 꺼낼 때 반드시 해당 값을 타입 형변환이 필요
		int no = (Integer) data.get("no");
		String title = (String) data.get("title");
		String writer = (String) data.get("writer");
		String publisher = (String) data.get("publisher");
		int price = (Integer) data.get("price");
		double discountRate = (Double) data.get("discountRate");
		Date incomeDate = (Date) data.get("incomeDate");
		
		System.out.println("도서번호 : " + no);
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
		System.out.println("할인율 : " + discountRate);
		System.out.println("입고일 : " + incomeDate);
		
	}
}
