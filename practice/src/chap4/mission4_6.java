package chap4;

public class mission4_6 {
	public static void main(String[] args) {
		// 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수 출력
		
		int dice1 = 1;
		int dice2 = 5;
		
		while(dice1 >= 1 && dice2 >= 1) {
			System.out.println("dice1 : " + dice1 + " dice2 : " + dice2);
			dice1++;
			dice2--;
		}
	}
}
