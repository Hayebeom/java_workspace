package chap4;

import java.util.Scanner;

public class ex4_15 {
	
	public static void main(String[] args) {
		
		int input = 0;
		int result = 0;
		
		result = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요>");
			input = sc.nextInt();
			
			if(input > result) {
				System.out.println("더 작은 값으로 시도해보세요");
			} else if (input < result) {
				System.out.println("더 큰 값으로 시도해보세요");
			}
		} while (input != result);
		
		System.out.println("정답입니다!");
	}
}
