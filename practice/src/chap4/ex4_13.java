package chap4;

public class ex4_13 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while(sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}
		
		// 0 - 0 1을 s에 1
		// 1 - 1 2를 s에 3
		// 2 - 3 3을 s에 6
		// 3 - 6 4를 s에 10
		// 4 - 10 5를 s에 15
		// 5 - 15 6을 s에 21 ...
	}
}
