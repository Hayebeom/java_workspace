package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		names.add("홍길동");
		names.add("홍길동"); // 객체 중복시 저장하지 않음
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		names.add("안중근");
		
		// 꺼내기
		// Enhanced-for문
		
		for(String name : names) {
			System.out.println(name);
		}
		
		// Iterator (1.5버전 이전 Enhanced-for문 없을때)
		System.out.println();
		
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {		// Iterator 는 while문 사용
			String data = itr.next();
			System.out.println(data);
		}
		
		System.out.println();
		
		// 저장된 객체의 개수 조회
		int size = names.size();
		System.out.println("저장된 객체의 개수 : " + size);
		
		System.out.println();
		
		// 전부 삭제
		names.clear();
		System.out.println("전체 객체 삭제 완료");

		System.out.println();
		
		// 비어있으면 true 반환
		boolean empty = names.isEmpty();
		System.out.println("비어있는가? " + empty);
		
		System.out.println();
		
		System.out.println(names);
	}
}

	/*
	set 특성 상  동일한 객체는 한번밖에 저장되지 않음
	그렇지만 중복 저장한다고 오류가 나진 않음
	또한 순서 보장 역시 이루어지지 않음
	*/
