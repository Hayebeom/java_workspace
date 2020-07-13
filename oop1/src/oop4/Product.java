package oop4;

public class Product {
	
	String name;
	String maker;
	String category;
	int price;
	double discountRate;
	int stock;
	boolean isSoldOut;
	
	Product() {
		
	}
	
	Product(String name, int stock) {
		this(name, null, null, 0, 0.0, stock, false);
	}
	
	// this() 생성자
	// 신제품 객체의 멤버변수 초기화에 적합한 생성자 메서드
	Product(String name, String maker, String category, int price, int stock) {
		this(name, maker, category, price, 0.0, stock, false);
		// 원래 아래 코드를 작성해야 하는데, this() 메서드로 한줄 코딩이 가능하게 됨
		// this() 메서드 사용 전 코드
//		this.name = name;
//		this.maker = maker;
//		this.category = category;
//		this.price = price;
	}
	
	// 이월 상품 객체의 멤버변수 초기화에 적합한 생성자 메서드
	Product(String name, String maker, String category, int price, double discountRate, int stock) {
		this(name, maker, category, price, discountRate, stock, false);
		// 원래 아래 코드를 작성해야 하는데, this() 메서드로 한줄 코딩이 가능하게 됨
		// this() 메서드 사용 전 코드
//		this.name = name;
//		this.maker = maker;
//		this.category = category;
//		this.price = price;
//		this.discountRate = discountRate;
	}
	
	Product(String name, String maker, String category, int price, double discountRate, int stock, boolean isSoldOut) {
		this.name = name;
		this.maker = maker;
		this.category = category;
		this.price = price;
		this.discountRate = discountRate;
		this.stock = stock;
		this.isSoldOut = isSoldOut;
	}
	
	void display() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 상품정보 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("상품이름 : " + name);
		System.out.println("제조회사 : " + maker);
		System.out.println("카테고리 : " + category);
		System.out.println("판매가격 : " + price);
		System.out.println("할인비율 : " + discountRate);
		System.out.println("재고량 : " + stock);
		System.out.println("절판여부 : " + isSoldOut);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
}
