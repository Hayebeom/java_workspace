package array;

public class ArrayDemo3 {
	public static void main(String[] args) {
		// 배열의 길이 조회
		// 배열이름.length : 조회만 가능
		// 배열의 길이는 불변 (변경 불가)
		String[] names = {"이순신", "김유신", "강감찬"};
		
		// 배열의 길이
		int len = names.length;
		System.out.println("배열의 길이 : " + names.length);
		System.out.println("배열의 길이 : " + len);
		
		// 배열의 길이 활용, 배열의 각 요소값 조회
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		// 위 코드는 배열값만 다르고 System.out.println이 3번이나 중복됨
		// 따라서 for문으로 코드의 중복을 줄임
		
		for(int i=0; i<len; i++) { // len 말고 names.length로도 가능
			System.out.println(names[i]);
		}
		
		int[] scores = {80, 50, 67, 70, 49, 68, 64, 86, 29, 86, 68, 38, 100};
		int totalScore = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.println("점수 : " + scores[i]);
			totalScore += scores[i];
		}
		
		System.out.println("총점 : " + totalScore);
		
	}
}
