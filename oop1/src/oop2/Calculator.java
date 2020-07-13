package oop2;

public class Calculator {
	
	int plus(int x, int y) {
		System.out.println("int + int의 합 계산");
		int result = x + y;
		return result;
	}
	
	int plus(int x, int y, int z) {
		System.out.println("int + int + int의 합 계산");
		int result = x + y + z;
		return result;
	}
	
	double plus(double x, double y) {
		System.out.println("double + double의 합 계산");
		double result = x + y;
		return result;
	}
	
	long plus(long x, long y) {
		System.out.println("long + long의 합 계산");
		long result = x + y;
		return result;
	}
	
	// 중복정의 규칙 위반
	// 매개변수 이름만 다를뿐 매개변수 타입, 갯수가 같기 때문에 오버로딩이 성립하지 않음
//	long plus(long a, long a) {
//		long result = x + y;
//		return result;
//	}
	
}
