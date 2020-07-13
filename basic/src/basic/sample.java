package basic;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		/*
		난수 ㄴㅇㄹㄴㅇㄻㄴㄻㅇㄴㄻㅇㄴㅁㄹㅇ 
		*/

		int[] num = new int[3];
		 
		for(int i=0; i<num.length; i++){
		    num[i] = (int)(Math.random() * 9 + 1);
		 
		    for(int j=0; j<i; j++){
		        if(num[i] == num[j]) {
		            i--; 
		            break; 
		        }
		    }
		}
		
		int fire = 1;
		while(true) {
			System.out.println("야구 게임을 시작합니다!");
			int strike = 0;
			int ball = 0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫번째 숫자를 입력하세요 : ");
			int a = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 : ");
			int b = sc.nextInt();
			System.out.print("세번째 숫자를 입력하세요 : ");
			int c = sc.nextInt();
			
			
			
		}
		
			
			
	}
}
