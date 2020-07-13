package array;

import java.util.Scanner;

public class ArrayDemo10 {
	public static void main(String[] args) {
		/*
		숫자를 10개 입력받아서 인접한 두 수의 차이가 가장 많이 나는 숫자를 각각 출력 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성
		int[] num = new int[10];
		
		// 숫자 10개 입력받아서 배열에 담기
		for (int i=0; i<num.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			num[i] = sc.nextInt();
		}
		
		// 출력할 값을 담는 변수 만들기
		int prev = 0;
		int next = 0;
		int gap = 0;

		// 인접한 숫자들간의 차이를 계산해서 가장 차이가 큰 숫자와 그 차이를 구하기
		for (int j = 0; j < num.length - 1; j++) {

			int currentPrev = num[j];
			int currentNext = num[j + 1];
			int currentGap = Math.abs(currentPrev - currentNext);

			if (currentGap > gap) {
				prev = currentPrev;
				next = currentNext;
				gap = currentGap;
			}

		}
		// 결과 출력
		System.out.println("숫자 1 : " + prev + ", 숫자 2 : " + next + ", 갭 : " + gap);
		
		sc.close();
	}
}


/*		
  		내 풀이
		// 출력할 값을 담는 변수 만들기
		int prev = 0;
		int next = 0;
		int gap = 0;
		int highgap = 0;
		
		// 인접한 숫자들간의 차이를 계산해서 가장 차이가 큰 숫자와 그 차이를 구하기
		for (int j=0; j<num.length-1; j++) {
			
			prev = num[j];
			next = num[j+1];
			gap = Math.abs(prev - next);
			
			if (gap > highgap) {
				highgap = gap;
			}
		
		}
		// 결과 출력
		System.out.println("숫자 1 : " + prev + ", 숫자 2 : " + next + ", 갭 : " + highgap);
*/
