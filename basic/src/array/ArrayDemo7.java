package array;

import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		// 숫자 5개 입력받아서 입력받은 숫자의 총합 계산
		
		// 키보드 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 5개 입력받는 배열 생성
		int[] num = new int[5];
		
		// 숫자 5번 입력받기
		for(int i=0; i<5; i++) {
			System.out.print("숫자를 입력하세요 : ");

			// 입력받은 숫자를 변수에 저장
			int n = sc.nextInt();
			
			// 변수에 저장된 값을 배열에 담기
			num[i] = n;
		}
		
		// 입력받은 숫자들의 총합 계산
		int total = 0;
		for (int a : num) { // Enhanced-for문 사용
			// total에 숫자 누적
			total += a;
		}
		System.out.println("입력된 숫자들의 총합 : " + total);
		
		sc.close();
	}
}
