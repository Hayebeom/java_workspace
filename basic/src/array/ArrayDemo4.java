package array;

public class ArrayDemo4 {
	public static void main(String[] args) {
		
		/* 배열의 값 조회,출력 (1.5버전부터 가능)
		Enhanced-for문 : 항이 2개
		 - 배열, Collection와 같이 (값을 여러개 저장하는 저장소에서) 각 요소의 값을 하나씩 조회할 때 사용하는 for문 
		 - 반드시 배열, Collection(Set, List)를 대상으로만 사용 가능
		for (타입 변수명 : 반복의 대상이 되는 배열) {
		 	수행문;
		}
		지정된 배열의 처음부터 끝까지 저장된 값을 하나씩 순서대로 가져와서 변수에 저장하고 수행문을 실행
		배열 : 조회할 값을 가지고 있는 배열
		타입 : 배열에 저장된 값의 타입
		변수 : 배열에 저장된 값이 순서대로 작성됨
		*/
		
		int[] scores = {60, 70, 80};
		for (int a : scores) {
			System.out.println(a);
		}		
		// 앞의 for문보다 훨씬 간단
		
		String[] names = {"김유신", "강감찬", "홍길동"};
		
		for(String str : names) {
			System.out.println(str);
		}
		// String도 가능
		
		// 인덱스를 활용해야 할 때는 앞서 했던 것을 사용해야 하지만, 순서대로 조회-출력만 할 때는 Enhance-for문이 훨씬 간단

	}
}
