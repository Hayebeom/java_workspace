package datatype;

public class DataTypeDemo4 {
	public static void main(String[] args) {
		
		//리터럴 : 코드에 직접 값을 표시하는 것
		//값의 종류에 따라서 표기법이 정해져 있다.
		
		//논리값 리터럴		true, false
		//정수 리터럴		1, 10, 0, -3, 1_000_000(_로 자리 표시), 1000000000000L(int 범위 초과하는 값+L)
		//실수 리터럴		3.14, 3.0, 3., -5.04, 3.14F, 3.14f
		//문자 리터럴		'A', '1', '\n', '\b'(백스페이스), '\t', '\u0042'(유니코드0042 = B)
		//문자열 리터럴		"안녕하세요", "서울특별시 종로구\n 디아망빌딩 401호\n L2강의실"
		
		//자바의 기본자료형
		//논리값 타입		boolean
		//정수 타입		byte, short, int, long
		//실수 타입		float, double
		//문자 타입		char
		
		//문자열 전용(기본자료형X)		String
		
		
		/* 각 리터럴 별 변수 사용하기 */
		//논리값 다루기				true/false는 참/거짓 논리값을 나타내는 자바의 예약어이다.
		boolean soldOut = true;
		boolean passed = false;
		
		System.out.println(soldOut);
		System.out.println(passed);
		
		
		//정수값 다루기
		byte num1 = 100;
		short num2 = 30000;
		int num3 = 1000000;
		long num4 = 1000000;
		//byte num5 = 232;  		--> byte값의 범위를 초과하여 오류
		//int num6 = 3000000000; 	--> int값의 범위를 초과하여 오류
		long num7 = 3000000000L;	//--> int값의 범위를 초과하는 값을 long에 대입할 때 리터럴에 L을 붙인다.
		int num8 = 012;				//8진수 12가 저장된다. 1*8^1 + 2*8^0
		int num9 = 0x12;			//16진수 12가 저장된다. 1*16^1 + 2*16^0
		int num10 = 0xA4;			//10*16^1 + 4*16^0
		
		System.out.println(num10);

		//실수값 다루기
		float value1 = 3.14f;		//실수 리터럴은 double타입으로 판단한다. float차입으로 판단하도록 f을 붙인다.
		double value2 = 3.14;
		
		
		//문자 다루기
		char ch1 = 'A';				//문자 A를 대입한다.
		char ch2 = '\u0041';		//유니코드 0041 = A
		char ch3 = 65;				//아스키코드 65 = A
		
		
		//문자열 다루기
		//문자열은 0개 이상의 문자들이 나열되어 있는 것이다.
		String str1 = "A";
		String str2 = "안녕하세요";
		String str3 ="서울특별시 종로구\n봉익동 디아망빌딩\n4층 L2강의실";
	}
}
