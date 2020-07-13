package com.sample.bookstore;

import java.util.Scanner;

import com.sample.bookstore.service.BookstoreService;

import com.sample.bookstore.vo.Book;
import com.sample.bookstore.vo.User;

/**
 * UI클래스
 * 
 * @author HYB
 *
 */
public class BookstoreApp {

	public static void main(String[] args) {

		BookstoreService service = new BookstoreService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("[도서 대여점 관리 프로그램]");
			System.out.println("=======================================================");
			System.out.println("1.회원관리		2.도서관리		3.대여관리		0.종료");
			System.out.println("=======================================================");

			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.println();
				System.out.println("[회원 관리]");
				System.out.println("===========================================================");
				System.out.println("1.등록	2.조회	3.변경	4.탈퇴	5.전체 조회		6.대여 현황 조회");
				System.out.println("===========================================================");

				System.out.print("회원관련 메뉴를 선택하세요 : ");
				int userMenuNo = sc.nextInt();

				if (userMenuNo == 1) {
					System.out.println("[신규 회원 등록]");
					System.out.print("이름을 입력하세요 : ");
					String name = sc.next();
					System.out.print("전화번호를 입력하세요 : ");
					String tel = sc.next();

					service.addNewUser(name, tel); // 1.BookstoreService의 addNewUser로 값 전달
					System.out.println("### 회원등록이 완료되었습니다 ###");

				} else if (userMenuNo == 2) {
					System.out.print("조회할 회원번호를 입력하세요 : ");
					int userNo = sc.nextInt();

					service.retrieveUserInfo(userNo);

				} else if (userMenuNo == 3) {
					System.out.print("회원번호를 입력하세요 : ");
					int no = sc.nextInt();
					System.out.print("변경할 이름을 입력하세요 : ");
					String name = sc.next();
					System.out.print("변경할 전화번호를 입력하세요 : ");
					String tel = sc.next();

					User user = new User();
					user.no = no;
					user.name = name;
					user.tel = tel;

					service.modifyUserInfo(user);
					System.out.println("### 회원변경이 완료되었습니다 ###");

				} else if (userMenuNo == 4) {
					System.out.print("탈퇴할 회원번호를 입력하세요 : ");
					int userNo = sc.nextInt();

					service.disabledUser(userNo);
					System.out.println("회원 탈퇴가 완료되었습니다.");
					
				} else if (userMenuNo == 5) {
					System.out.println("전체 회원정보를 출력합니다.");
					service.retrieveAllUsers();
				} else if (userMenuNo == 6) {
					System.out.print("회원번호를 입력하세요 : ");
					int userNo = sc.nextInt();
					
					service.retrieveRentalsByUserNo(userNo);
					
				}

			} else if (menuNo == 2) {
				System.out.println();
				System.out.println("[도서 관리]");
				System.out.println("=====================================================");
				System.out.println("1.검색	2.등록	3.수정	4.전체 조회		5.대여 현황 조회");
				System.out.println("=====================================================");
				System.out.print("도서관련 메뉴를 선택하세요 : ");
				int bookMenuNo = sc.nextInt();

				if (bookMenuNo == 1) {
					System.out.print("조회할 도서 제목을 입력하세요 : ");
					String title = sc.next();

					service.searchBooks(title);

				} else if (bookMenuNo == 2) {

					System.out.println("[신규 도서 등록]");
					System.out.print("제목을 입력하세요 : ");
					String title = sc.next();
					System.out.print("저자를 입력하세요 : ");
					String writer = sc.next(); // 띄어쓰기 불가
					System.out.print("가격을 입력하세요 : ");
					int price = sc.nextInt();

					service.insertNewBook(title, writer, price);
					System.out.println("### 도서등록이 완료되었습니다 ###");

				} else if (bookMenuNo == 3) {
					System.out.print("도서번호를 입력하세요 : ");
					int no = sc.nextInt();
					System.out.print("변경할 제목을 입력하세요 : ");
					String title = sc.next();
					System.out.print("변경할 저자를 입력하세요 : ");
					String writer = sc.next();
					System.out.print("변경할 가격을 입력하세요 : ");
					int price = sc.nextInt();

					Book book = new Book();
					book.no = no;
					book.title = title;
					book.writer = writer;
					book.price = price;

					service.modifyBook(book);
					System.out.println("### 도서변경이 완료되었습니다 ###");

				} else if (bookMenuNo == 4) {

					System.out.println("### 전체 도서목록을 출력합니다 ###");
					service.retrieveAllBooks();
					
				} else if (bookMenuNo == 5) {
					
					System.out.print("도서 번호를 입력하세요 : ");
					int bookNo = sc.nextInt();
					
					service.retrieveRentalsByBookNo(bookNo);
					
				}

			} else if (menuNo == 3) {
				System.out.println();
				System.out.println("[대여/반납 관리]");
				System.out.println("==================================");
				System.out.println("1.대여	2.반납	3.대여현황조회	4.전체반납");
				System.out.println("==================================");
				System.out.print("대여관련 메뉴를 선택하세요 : ");
				int rentalMenuNo = sc.nextInt();

				if (rentalMenuNo == 1) {
					System.out.print("사용자 번호를 입력하세요 : ");
					int userNo = sc.nextInt();
					System.out.print("도서 번호를 입력하세요 : ");
					int bookNo = sc.nextInt();
					
					service.rentBook(userNo, bookNo);
					System.out.println("대여가 완료되었습니다.");

				} else if (rentalMenuNo == 2) {
					System.out.print("대여 번호를 입력하세요 : ");
					int rentNo = sc.nextInt();

					service.returnBook(rentNo);
					System.out.println("### 도서반납이 완료되었습니다 ###");

				} else if (rentalMenuNo == 3) {
					
					service.retrieveAllRentals();
					System.out.println("### 대여 현황을 조회합니다 ###");

				} else if (rentalMenuNo == 4) {
					System.out.println("모든 도서를 반납합니다.");
					System.out.print("사용자 번호를 입력하세요 : ");
					int userNo = sc.nextInt();
					service.returnBookAll(userNo);
					System.out.println("### 모든 도서를 반납했습니다 ###");

				}
				
			} else if (menuNo == 0) {
				System.out.println("[프로그램 종료]");
				break;
			}
			
			System.out.println();
			System.out.println();
		}

		sc.close();
	}
}
