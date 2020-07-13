package com.sample.bookstore.vo;

public class Rental {
	
	public int no;
	public int userNo;
	public int bookNo;
	public boolean isRent; // true : 대여중 / false : 반납완료
	
	public Rental() {
		
	}
	
	public Rental(int no, int userNo, int bookNo, boolean isRent) {
		super();
		this.no = no;
		this.userNo = userNo;
		this.bookNo = bookNo;
		this.isRent = isRent;
	}
	
	public void display() {
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 고객 정보 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("번호	대여자 번호	도서 번호	대여 여부");
		System.out.println(no + "\t" + userNo + "\t" + bookNo + "\t" + isRent);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
}
