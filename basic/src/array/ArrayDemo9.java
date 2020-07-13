package array;

import java.util.Scanner;

public class ArrayDemo9 {
	public static void main(String[] args) {
		/*
		숫자를 10개 입력받아서 그 중에 짝수들의 합계만 구해서 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			num[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int a : num) {
			if(a % 2 == 0) {
				sum += a;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}
