package chap4;

public class mission4_9 {
	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		
		while(true) {
			if(num%10 != 0) {
				sum += num%10;
				num /= 10;
			}
			
			else {
				break;
			}
		}
		
		System.out.println("sum="+sum);
	}
}
