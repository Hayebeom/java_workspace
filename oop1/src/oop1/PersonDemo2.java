package oop1;

public class PersonDemo2 {
	public static void main(String[] args) {
		/*
		Person 객체를 여러 개 담는 배열 사용
		*/
		
		// Person 객체 3개 담을 수 있는 배열 생성, people에 대입
//		int[] num = new int[3];
		Person[] people = new Person[3];
		
		Person p1 = new Person(); // p1은 Person 객체의 주소값을 가짐
		p1.name = "이순신";
		p1.email = "leesh@naver.com";
		p1.age = 60;
		
		Person p2 = new Person(); // p2은 Person 객체의 주소값을 가짐
		p2.name = "류관순";
		p2.email = "ryugs@gmail.com";
		p2.age = 17;

		Person p3 = new Person(); // p3은 Person 객체의 주소값을 가짐
		p3.name = "강감찬";
		p3.email = "kang@daum.net";
		p3.age = 80;
		
		// 생성된 각각의 Person 객체 주소값을 배열에 저장
		people[0] = p1;
		people[1] = p2;
		people[2] = p3;
		
		// people 배열에 저장된 모든 Person 객체의 속성을 출력
		
		for(int i=0; i<people.length; i++) {
			Person p = people[i]; // p에 Person 객체의 주소값이 순서대로 대입됨
			System.out.println(p.name + "\t" + p.email + "\t" + p.age);
		}
		
	}
}
