package array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		
		// 배열의 값 조회,변경
		
		// 정수형 배열 생성
		int[] score = new int[3];
		
		// 배열의 각 요소에 정수 대입
		score[0] = 90;
		score[1] = 70;
		score[2] = 60;
		
		// 배열의 각 요소에 저장된 정수값 사용
		int total = score[0] + score[1] + score[2];
		System.out.println("국어점수 : " + score[0]);
		System.out.println("영어점수 : " + score[1]);
		System.out.println("수학점수 : " + score[2]);
		System.out.println("총점 : " + total);
		
		
		// String형 배열 생성
		String[] names = {"이순신", "강감찬", "홍길동"};
		System.out.println("0번째 문자열 : " + names[0]);
		System.out.println("1번째 문자열 : " + names[1]);
		System.out.println("2번째 문자열 : " + names[2]);
		// System.out.println("3번째 문자열 : " + names[3]); 
		// 예외 발생 ArrayIndexOutOfBoundsException
		// 기존 생성한 배열의 크기를 초과한 인덱스는 작성할 수 없다
		
		// 배열 내용 변경
		names[1] = "김유신";
		System.out.println("1번째 문자열 : " + names[1]);
		
	}
}
