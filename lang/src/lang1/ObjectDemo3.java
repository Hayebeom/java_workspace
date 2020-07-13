package lang1;

import java.util.Date;

public class ObjectDemo3 {
	
	public static void main(String[] args) {
		User user1 = new User(10, "홍길동", "010-1234-5679");
		User user2 = new User(10, "홍길동", "010-1234-5679");
		
		// 참조변수 출력
		// Object의 toString() 메서드 실행결과가 출력
		// ☆ Object의 toString() 메서드는 "클래스명@해시코드"를 반환
		// ☆ Object의 toString() 메서드를 재정의해서 객체의 멤버변수(속성값)을 텍스트로 반환하도록 하는 경우가 많음
		// ☆ 출력할 때 쓰는건 아니고, 디버깅 용도로 사용하는 것
		System.out.println(user1);
		System.out.println(user1.toString());
		
		System.out.println(user2);
		System.out.println(user2.toString());
		
		// Date 객체도 Object의 toString()을 재정의함
		Date today = new Date();
		System.out.println(today); // Thu Apr 02 15:43:10 KST 2020
		
	}
}
