package chap3;

public class mission3_1 {

	public static void main(String[] args) {
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		b = (byte)i;	// byte가 i보다 더 작은 단위니 형변환 필요, 있어야 함
		ch = (char)b;	// 왜 필요하지? char가 더 큰 단위인데?
		short s = (short)ch;	// 왜 필요하지? 같은 단위라 그런가?
		float f = (float)l;	// float가 l보다 더 작은 단위니 있어야 함	// 왜 없됨
		i = (int)ch;	// ch가 int보다 작은 단위니 없어도 됨
		
		System.out.println(b);	// 데이터 손실은 감수
		System.out.println(ch);	// 데이터 손실
		System.out.println(s);	// 왜 100이지
		System.out.println(f);	// 실수형으로 변경됨, f는 왜 안붙었지?
		System.out.println(i);	// 65 아닌가?
	}
}
