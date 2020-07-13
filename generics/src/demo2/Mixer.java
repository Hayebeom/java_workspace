package demo2;

public class Mixer {
	
	// 제네릭 메서드
	// 메서드가 여러 종류의 객체를 다루는 경우 (여러 종류의 객체를 매개변수로)
	// (여러 종류의 객체를 매개변수로 전달받아야 하는 경우) 제네릭 메서드로 만듬
	
	// 메서드의 리턴타입 앞체 제네릭 선언
	// 메세드 호출 전달 받은 객체의 타입 주저애서 T를 릭어랜
	
	public static <T> void mix(FruitBox<T> box) {
		int size = box.size();
		for (int i=0; i<size; i++) {
			T t = box.get(i);
			System.out.println(t.toString() + "를 믹싱합니다.");
			
		}
		System.out.println();
	}
	
}
