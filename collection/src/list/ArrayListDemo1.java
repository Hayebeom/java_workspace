package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		/*
		 ArrayList의 특징
		 	1. 저장했던 순서대로 다시 꺼낼 수 있다 (순서보장)
		 	2. 타입 파라미터<E>는 특정타입만 저장하는 콜렉션을 생성함 (타입안정성)
		 	3. 저장소의 크기를 별도로 지정할 필요가 없음
		 	4. 더 이상 저장할 공간이 없으면 공간의 크기를 자동으로 조절
		 		(더 큰 크기의 배열 생성 후 기존 배열의 데이터를 새 배열로 복사, 저장)
		 	5. 저장할 때 인덱스를 별도로 지정할 필요가 없음 (자동으로 맨 끝에 저장됨)
		 	6. Enhanced-for문을 사용해서 저장된 모든 객체를 쉽게 꺼낼 수 있음
		 	7. 특정 위치의 객체를 삭제하면 자동으로 그 다음에 위치하고 있는 객체들이 앞으로 이동, 빈곳을 채움
		*/
		
		// ArrayList 생성하기  <--- String 객체를 담는 ArrayList 객체 생성
		ArrayList<String> names = new ArrayList<String>();
		
		// ArrayList 저장소에 String 객체 담기
		names.add("홍길동");
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		
		// ArrayList 저장소에 저장된 String객체 꺼내기
		// 1.Enhanced-for문 사용
		//  * 조회만 가능 (삭제 불가)
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		// 2.Iterator 사용
		//  * 조회 , 삭제 가능 (Iterator에서 삭제 시 ArrayLisy에서도 삭제됨)
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			
//			if(name.equals("강감찬")) {
//				itr.remove();
//			}
			
		}
//		System.out.println(names);
		
		// 3. 일반 for문 사용 (List 자손들만 가능) - 권장하지 않음
		int length = names.size();
		for (int i=0; i<length; i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		
		System.out.println();
		
		boolean empty = names.isEmpty();
		System.out.println("비어있는가? " + empty);
		
		System.out.println();

		// 저장된 객체 전부 삭제
		names.clear();
		System.out.println("저장된 모든 객체 삭제됨");
		
		System.out.println();
		
		// 저장된 객체의 개수 조회
		int size = names.size();
		System.out.println("저장된 갯수 : " + size);
	}
}
