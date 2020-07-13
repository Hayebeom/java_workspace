package chap4;

public class mission4_8 {
	public static void main(String[] args) {
		
		// math.random() 1~6 사이 임의 정수를 변수 value에 저장
		
		int value =( (int)(Math.random()*6 + 1) );
		
		System.out.println("value:"+value);
	}
}
