package chap3;

public class mission3_2 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);	// ????
		System.out.println(y >= 5 || x < 0 && x > 2);	// 연산자 우선순위
		System.out.println(y += 10 - x++);	// 13, x=3
		System.out.println(x += 2);	// 5
		System.out.println(!('A' <= c && c <= 'Z'));	// 앞의 ! 주의
		System.out.println('C' - c);	// 2
		System.out.println('5' - '0');	// 5
		System.out.println(c + 1);	// 66
		System.out.println(++c);	// 66 숫자 안붙었으면 문자로
		System.out.println(c++);	// 66
		System.out.println(c);		// 67
		
		// https://yahma.tistory.com/143 참고
	}
}
