package chap4;

public class mission4_3 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum += j;
				System.out.print("(" + j +")");
			}
			System.out.println();
		}
		System.out.println(sum);
	}
	
	/*
	 	1 + (1+2) + (1+2+3) + ... (1+2+3+4+5...+10)
	*/
}
