package chap4;

public class mission4_4 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		int switching = 1;
		
		while(sum<100) {
		
			sum += switching * ++num;	// 1  
			switching = -switching;		// -1
			
		}
		
		System.out.println(num);
	}
}
