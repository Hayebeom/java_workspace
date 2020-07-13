package oop4;

public class Book {

	String title;
	String writer;
	String publisher;
	int price;
	String genre;
	
	// 생성자 메서드
	// 기본 생성자 메서드(default constructor)
	// 클래스에 정의된 생성자가 하나도 없을 때 컴파일러가 자동으로 추가하는 생성자 메서드
	Book() {
		publisher = "한빛미디어"; // 대부분 책이 한빛미디어 출판이기 때문에 Book 객체 생성 후에 publisher를 한빛미디어로 설정
	}
	
	// 매개변수가 있는 생성자 메서드
	// 생성자 메서드 중복정의
	Book(String inputTitle, String inputWriter, int inputPrice, String inputGenre) {
		title = inputTitle;
		writer = inputWriter;
		publisher = "한빛미디어";
		price = inputPrice;
		genre = inputGenre;
	}
	
	Book(String inputTitle, String inputWriter, String inputPublisher, int inputPrice, String inputGenre) {
		title = inputTitle;
		writer = inputWriter;
		publisher = inputPublisher;
		price = inputPrice;
		genre = inputGenre;
	}
	
	// 일반 멤버 메서드(인스턴스 메서드)
	void printBookInfo() {
		System.out.println("ㅡㅡㅡㅡㅡ 도서 정보 ㅡㅡㅡㅡㅡ");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
		System.out.println("장르 : " + genre);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println();
		
	}
	
}
