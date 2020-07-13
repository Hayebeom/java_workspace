package array;

public class ArrayDemo1 {
	public static void main(String[] args) {
		/*
		배열
		 - 같은 타입의 값을 여러 개 저장할 수 있는 변수의 묶음
		
		배열의 생성
		 ex. 정수 5개를 저장하는 배열 생성해서 참조변수에 담기
		 	int[] numbers = new int[5];
		 	 = 생성된 배열 [0, 0, 0, 0, 0]
		 	int[] numbers = {10, 20, 30, 40, 50}; // 배열 리터럴
		 	 = 생성된 배열 [10, 20, 30, 40, 50]
		 	int[] numbers = new int[]{10, 20, 30, 40, 50};
		 	 = 생성된 배열 [10, 20, 30, 40, 50]
		
		 - 배열을 생성할 때 배열의 길이만 지정해서 배열을 생성하면
		  배열의 각 요소에는 해당 데이터 타입의 기본값으로 초기화 되어있다
		   * 기본 데이터 타입별 기본값
		    - 정수(byte, short, int, long) -> 0
		    - 실수(float, double)			  -> 0.0
		    - 문자(char)					  -> \u0000
		    - 논리(boolean) 				  -> false
		   * 참조 데이터 타입 기본값
		    - (기본 데이터타입 제외) 모든 데이터 타입 기본값은 null 
		    - 모든 참조 타입의 변수에 null값을 대입할 수 있음
		    - null : 참조변수가 객체를 더 이상 참조하지 못하게 하는 값 (ex.String str = null;)
		    
		*/
		
		// 정수형 배열
		int[] numbers1 = new int[3];
		System.out.println("0번째 정수 : " + numbers1[0]);
		System.out.println("1번째 정수 : " + numbers1[1]);
		System.out.println("2번째 정수 : " + numbers1[2]);
		// [0, 0, 0]
		
		// 실수형 배열
		double[] numbers2 = new double[3];
		System.out.println("0번째 실수 : " + numbers2[0]);
		System.out.println("1번째 실수 : " + numbers2[1]);
		System.out.println("2번째 실수 : " + numbers2[2]);
		// [0.0, 0.0, 0.0]
		
		// String형 배열
		String[] words = new String[3];
		System.out.println("0번째 문자열 : " + words[0]);
		System.out.println("1번째 문자열 : " + words[1]);
		System.out.println("2번째 문자열 : " + words[2]);
		// [null, null, null]

		// 정수형 배열
		int[] scores = {10, 40, 100};
		// [10, 40, 100]
		
		// 실수형 배열
		double[] rates = {0.05, 0.001, 0.005};
		// [0.05, 0.001, 0.005]
		
		// ★ String형 배열 
		String[] names = {"홍길동", "김유신", "강감찬"}; 
		// [#123, #54678, #5758] (각 홍길동, 김유신, 강감찬 객체가 생성되고, 그 객체를 가리키는 주소값이 들어감)

		// 크기가 지정되지 않은 배열은 만들 수 없음
		// 참조 변수 배열엔 그 값이 아니라 그 값이 참조하는 주소값이 담겨있음
		
		
	}
}
