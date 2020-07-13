package com.sample.bookstore.service;

import com.sample.bookstore.vo.Book;
import com.sample.bookstore.vo.Rental;
import com.sample.bookstore.vo.User;

public class BookstoreService {

	BookService bookService = new BookService();
	UserService userService = new UserService();
	RentalService rentalService = new RentalService();

	// 회원등록 서비스
	// 이름과 전화번호를 전달받아서 회원등록 서비스 제공
	// 		User객체 생성, 이름 전화번호 저장
	// 		회원등록시 100포인트 지급
	// 		UserService의 회원등록기능 실행
	public void addNewUser(String name, String tel) { // 2.BookstoreApp로부터 전달받은 name, tel로 User 객체 생성
		User user = new User();
		user.name = name;
		user.tel = tel;
		user.point = 100;
		user.isDisabled = false;

		userService.insertUser(user); // 3.user기본값 받아서 UserService의 insertUser로 전달함
	}

	// 회원조회 서비스
	// 회원번호를 전달받아서 회원번호에 대한 회원정보를 화면에 출력
	//		 UserService의 회원조회기능을 실행해서 회원정보 제공받음
	// 		조회된 회원정보 화면에 출력
	public void retrieveUserInfo(int userNo) {
		User foundUser = userService.findUserByNo(userNo);
		foundUser.display();

	}

	// 회원정보 수정 서비스
	// 수정할 회원정보를 전달받아서 해당 회원 정보 수정
	// 		UserService의 회원정보 변경기능을 실행해서 회원정보 수정
	public void modifyUserInfo(User user) {

		userService.updateUser(user);

	}

	// 회원탈퇴 서비스
	// 탈퇴처리할 회원번호를 전달받아서, 해당 회원 탈퇴처리
	// 		UserService의 회원조회기능을 실행, 회원정보 제공받음
	// 		조회된 회원을 탈퇴여부를 탈퇴처리로 변경
	// 		해당 회원이 대여중인 모든 책을 반납처리
	public void disabledUser(int userNo) {

		userService.disableUser(userNo);
	}

	// 전체 회원조회 서비스
	// 등록된 모든 회원정보 조회를 처리
	// 		- UserService의 모든 회원정보 조회기능을 실행해서 모든 회원정보를 제공받음
	// 		- 조회된 회원정보를 화면에 출력(null체크)
	public void retrieveAllUsers() {
		User[] users = userService.getAllUsers();
		
		for(int i=0; i<users.length; i++ ) {
			User user = users[i];
			
			if (user != null) {
				user.display();
			}
			
		}
	}

	// 도서 검색 서비스
	// 제목를 전달받아서 도서 검색서비스를 처리
	// 		- BookService의 도서 검색기능을 실행해서 책정보를 제공받음
	// 		- 조회된 책정보를 화면에 출력
	public void searchBooks(String title) {
		Book[] books = bookService.getAllBooks();

		for (int i = 0; i < books.length; i++) {
			Book book = books[i];

			if (book != null) {
				if(book.title.contains(title)) {
					book.display();
				} // title(contains(book.title)) 와 다르다??? 왜지????
				
			}

		}
	}

	// 도서등록 서비스
	// 제목, 저자, 가격을 전달받아서 도서 등록 서비스를 처리
	// 		- Book객체를 생성해서 제목, 저자, 가격 정보를 저장
	// 		- 재고는 10000권
	// 		- BookService의 도서등록기능을 실행
	public void insertNewBook(String title, String writer, int price) {
		Book book = new Book();
		book.title = title;
		book.writer = writer;
		book.price = price;
		book.stock = 10000;

		bookService.insertBook(book);
	}

	// 도서 정보 수정 서비스
	// 책정보를 전달받아서 책정보 수정서비스를 처리
	// - BookService의 책정보 수정기능을 실행
	public void modifyBook(Book book) {

		bookService.updateBook(book);
	}

	// 전체도서 조회 서비스
	// 모든 책정보 조회 서비스를 처리한다.
	//		 - BookService의 모든 책조회 기능을 실행한다.
	public void retrieveAllBooks() {
		Book[] books = bookService.getAllBooks();
		
		for(int i=0; i<books.length; i++) {
			Book book = books[i];
			
			if(book != null) {
				book.display();
			}
			
		}
	}

	// 대여 서비스
	// 사용자번호와 책번호를 전달받아서 대여 서비스를 처리
	// 	- Rental객체를 생성해서 사용자번호, 책번호를 저장
	// 	- 대여여부는 대여중으로 설정
	// 	- 책재고 변경하기
	// 		- BookService에서 책번호에 해당하는 책정보 조회기능 실행
	// 		- 조회된 책의 재고를 1감소시킴
	public void rentBook(int userNo, int bookNo) {

		Rental rental = new Rental();
		rental.userNo = userNo;
		rental.bookNo = bookNo;
		rental.isRent = true;
		Book resultBook = bookService.findBookByNo(bookNo);
		resultBook.stock--;

		rentalService.insertRental(rental);
	}

	// 반납 서비스
	// 대여번호를 전달받아서 반납 서비스를 처리
	// 	- RentalService에서 대여번호에 해당하는 대여정보 조회 기능을 실행
	// 	- 조회된 대여정보의 반납여부를 false로 설정
	// 	- 사용자포인트 증가, 책재고 변경하기
	// 		- UserService에서 사용자번호로 사용자정보 조회하기 실행
	// 		- BookService에서 책번호로 책정보 조회하기 실행
	// 		- 조회된 사용자의 포인트를 책가격의 1%만큼 증가시키기
	// 		- 조회된 책정보의 재고를 1증가시키기
	public void returnBook(int rentalNo) {
		Rental foundRental = rentalService.findRentalByNo(rentalNo);
		foundRental.isRent = false;
		int returnUserNo = foundRental.userNo;
		int returnBookNo = foundRental.bookNo;
		Book resultBook = bookService.findBookByNo(returnBookNo);
		User resultUser = userService.findUserByNo(returnUserNo);
		int pointPlus = (int)(resultBook.price * 0.01);
		resultUser.point += pointPlus;
		resultBook.stock++;
		
		rentalService.returnAllRentalByRentalNo(rentalNo);
		///////////////////////////
	}
	public void returnBookAll(int userNo) {
		Rental foundRental = rentalService.findRentalByNo(userNo);
		foundRental.isRent = false;
		int returnUserNo = foundRental.userNo;
		int returnBookNo = foundRental.bookNo;
		Book resultBook = bookService.findBookByNo(returnBookNo);
		User resultUser = userService.findUserByNo(returnUserNo);
		int pointPlus = (int)(resultBook.price * 0.01);
		resultUser.point += pointPlus;
		resultBook.stock++;
		
		rentalService.returnAllRentalByUserNo(userNo);
		///////////////////////////
	}

	// 대여현황 조회 서비스
	// 모든 대여정보를 조회하는 서비스를 처리
	// 		- RentalService의 전체 대여정보조회 기능을 실행
	// 		- 조회된 대여정보를 화면에 출력 (null체크)
	public void retrieveAllRentals() {
		Rental[] rentals = rentalService.getAllRentals();
		
		for(int i=0; i<rentals.length; i++) {
			Rental rental = rentals[i];
			
			if(rental != null) {
				rental.display();
			}
			
		}
	}
	
	public void retrieveRentalsByUserNo(int userNo) {
		Rental[] rentals = rentalService.getAllRentals();

		for (int i = 0; i < rentals.length; i++) {
			Rental rental = rentals[i];
			
			if (rental != null) {
				if (rental.userNo == userNo) {
					rental.display();
				}
			} else {
				System.out.println("대여중인 도서가 없습니다.");
				break;
			}

		}
		
	}

	public void retrieveRentalsByBookNo(int bookNo) {
		Rental[] rentals = rentalService.getAllRentals();

		for (int i = 0; i < rentals.length; i++) {
			Rental rental = rentals[i];

			if (rental != null) {
				if (rental.bookNo == bookNo) {
					rental.display();
				}

			} else {
				System.out.println("대여중인 도서가 없습니다.");
				break;
			}

		}
		
	}

}