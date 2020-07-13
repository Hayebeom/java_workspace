package set;

import java.util.HashMap;

public class HashMapDemo1 {
	
	public static void main(String[] args) {
		
		// HashMap 객체에 key / value 쌍으로 처리
		HashMap<String, String> contacts = new HashMap<String, String>();
		contacts.put("hong", "홍길동");
		contacts.put("lee", "이순신");
		contacts.put("hong123", "홍길동");
		contacts.put("kang", "홍길동");
		
		// HashMap 객체에 저장된 값 조회 (키를 다 알고있어야됨)
		String value = contacts.get("hong");
		System.out.println("키 [hong]으로 조회한 값 : " + value);
		// 값을 쓰면 null 값 반환
		
		// HashMap 객체에 key가 이미 존재하는지 확인
		boolean exist = contacts.containsKey("Kang");
		System.out.println("key[kang]가 존재하는가? : " + exist);
		// Kang 말고 kang은 있음
		
		// HashMap 객체에 저장된 entry(키/값의 쌍)의 개수 조회
		int size = contacts.size();
		System.out.println("HashMap 객체에 저장된 Entry의 총 개수 : " + size);
		
		// HashMap 객체에 저장된 Entry 삭제
		contacts.remove("hong");
		
		System.out.println(contacts);
		
	}
	
}
