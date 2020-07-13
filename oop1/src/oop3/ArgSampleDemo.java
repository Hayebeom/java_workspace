package oop3;

public class ArgSampleDemo {
	public static void main(String[] args) {
		
		ArgSample sample = new ArgSample();
		
		// 기본 자료형 변수가 가진 값을 메서드 호출 시 전달한 경우
		int num = 100;
		
		System.out.println("main()에서 changeValue() 수행 전 num ---> " + num);
		sample.changeValue(num); // <--- num 변수가 가지고 있는 값을 전달
		System.out.println("main()에서 changeValue() 수행 후 num ---> " + num);
		
		System.out.println();
		Data data = new Data();
		
		// 참조형 변수가 가진 값을 메서드 호출 시 전달한 경우
		data.num = 200;
		
		System.out.println("main()에서 changeValue() 수행 전 data.num ---> " + data.num);
		sample.changeDataValue(data); // <--- data 변수가 가지고 있는 주소값을 전달
		System.out.println("main()에서 changeValue() 수행 후 data.num ---> " + data.num);
		
	}
}
