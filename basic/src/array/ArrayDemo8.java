package array;

import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		/*
		5개의 정수를 입력받아서 그 중에 가장 큰 값을 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성
		int[] num = new int[5];
		
		// 5번 반복해서 숫자를 입력받고 배열에 담기
		for (int i=0; i<num.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int n = sc.nextInt();
			num[i] = n;
			// number[i] = sc.nextInt();
		}
		
		// 최대값 구하기
		int max = 0;
		// 배열에서 가장 큰 값을 찾아서 max에 담기
		
		for(int a : num) {
			if(a > max) {
				max = a;
			}
		}
		
		// 최대값 출력
		System.out.println("가장 큰 값 : " + max);

		sc.close();
	}
}

/*
내 풀이		// 최대값 구하기
int max = 0;

// 5번 반복해서 각 숫자 입력받고 배열에 담기
for(int i=0; i<num.length; i++) {
	System.out.print("숫자를 입력하세요 : ");
	int n = sc.nextInt();
	num[i] = n;
	
	// 가장 큰 값을 찾아서 max에 담기
	if(max < num[i]) {
		max = num[i];
	}
	
*/		
