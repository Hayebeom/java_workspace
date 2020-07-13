package set;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo5 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		result.put("서울", 25);
		result.put("인천", 4);
		result.put("경기", 19);
		result.put("강원", 3);
		result.put("충청", 6);
		result.put("신라", 10);
		
		// HashMap의 모든 Key 조회
		Set <String> keys = result.keySet();
		for (String key : keys) {
			int count = result.get(key);
			System.out.println("[" + key + "]" + count);
		}
		
		System.out.println();
		
		// HashMap의 모든 Entry 조회
		Set<Entry<String, Integer>> entries = result.entrySet();
		for(Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("[" + key + "]"+ value);
		}
		
	}
}
