package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		// 오류 : 타입파라미터<E>에는 클래스명이 정의되어야 함
		//		int는 자바의 기본 자료형 키워드 (클래스명이 아님)
		// ArrayList<int> numbers = new ArrayList<int>();
		
		// 기본 자료형에 대응되는 Wrapper 클래스를 타입파라미터로 지정
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Long> currencies = new ArrayList<Long>();
		ArrayList<Double> rates = new ArrayList<Double>();
		
		numbers.add(new Integer(10));
		// 오토 박싱 
		numbers.add(10); // numbers.add(new Integer(10));
		
		currencies.add(new Long(10000000000L));
		// 오토 박싱 
		currencies.add(10000000000L); // currencies.add(new Long(10000000000L));
		
		rates.add(new Double(4.3));
		// 오토 박싱 
		rates.add(4.3); // rates.add(new Double(4.3));
		
		for (Integer num : numbers) {
			System.out.println(num);
		}
		
		for (int num : numbers) { // 반복될 때 마다 Integer 객체가 꺼내짐 -> 언박싱 후 숫자만 num에 대입
			System.out.println(num);
		}
		
		Iterator<Long> itr = currencies.iterator();
		while (itr.hasNext()) {
			Long curr = itr.next();
			System.out.println(curr);
		}
		
		itr = currencies.iterator();
		while (itr.hasNext()) {
			long curr = itr.next(); // itr.next() -> Long 객체 반환 -> 언박싱 후 숫자만 curr에 대입
			System.out.println(curr);
		}
		
	}
}
