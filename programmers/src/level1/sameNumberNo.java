package level1;

import java.util.*;

public class sameNumberNo {
	public static void main(String[] args) {

		long n = 12532;
	        int[] answer = new int[(int)(Math.log10(n)+1)];
	        
	        // 숫자를 배열로 만든다
	        for (int i=0; i<answer.length; i++) {
	            answer[i] = (int) n%10;
	            n = n/10;
	            System.out.println(answer[i]);
	        }
	       
	        System.out.println(Arrays.toString(answer));

	    }
	
    
}