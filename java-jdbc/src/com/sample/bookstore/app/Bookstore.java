package com.sample.bookstore.app;

import java.util.List;

import com.sample.bookstore.service.BookstoreService;
import com.sample.bookstore.util.KeyboardUtil;
import com.sample.bookstore.vo.Book;
import com.sample.bookstore.vo.Order;
import com.sample.bookstore.vo.Question;
import com.sample.bookstore.vo.User;

public class Bookstore {

	public static void main(String[] args) throws Exception {
		
		BookstoreService service = new BookstoreService();
		
		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.회원가입	2.검색	3.상세정보	4.주문	5.내주문	6.주문상세	7.문의게시판	0.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = KeyboardUtil.nextInt();
					
			if (menuNo == 1) {
				System.out.println("[신규 회원 가입]");
				
				System.out.print("아이디를 입력하세요 : ");
				String id = KeyboardUtil.nextString();
				
				System.out.print("비밀번호를 입력하세요 : ");
				String password = KeyboardUtil.nextString();
				
				System.out.print("이름을 입력하세요 : ");
				String name = KeyboardUtil.nextString();
				
				System.out.print("이메일을 입력하세요 : ");
				String email = KeyboardUtil.nextString();
				
				User user = new User();
				user.setId(id);
				user.setPassword(password);
				user.setName(name);
				user.setEmail(email);
				
				boolean isSuccess = service.회원가입(user);
				
				if (isSuccess) {
					System.out.println("### 회원가입이 완료되었습니다.");
				} else {
					System.out.println("!!! 이미 사용중인 아이디입니다.");
				}
				
			} else if (menuNo == 2) {
				System.out.println("[책 검색하기]");
				
				System.out.print("키워드를 입력하세요 : ");
				String keyword = KeyboardUtil.nextString();
				
				List<Book> books = service.도서검색(keyword);
				if (books.isEmpty()) {
					System.out.println("!!! 검색결과가 존재하지 않습니다.");
				} else {
					System.out.println(books.size() + "권의 책이 조회되었습니다.");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("번호\t제목\t저자\t가격\t");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					
					for (Book book : books) {
						System.out.println(book.getNo() + "\t");
						System.out.println(book.getTitle() + "\t");
						System.out.println(book.getWriter() + "\t");
						System.out.println(book.getPublisher() + "\t");
						System.out.println(book.getPrice());
					}
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					
				}
				
			} else if (menuNo == 3) {
				System.out.println("[책 정보 상세보기]");
				
				System.out.print("조회할 책번호를 입력하세요 : ");
				int bookNo = KeyboardUtil.nextInt();
				
				Book book = service.도서상세정보(bookNo);
				if (book == null) {
					System.out.println("!!! 유효한 책 번호가 아닙니다.");
				} else {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("번호 : " + book.getNo());
					System.out.println("제목 : " + book.getTitle());
					System.out.println("저자 : " + book.getWriter());
					System.out.println("장르 : " + book.getGenre());
					System.out.println("출판사 : " + book.getPublisher());
					System.out.println("가격 : " + book.getPrice());
					System.out.println("할인가격 : " + book.getDiscountPrice());
					System.out.println("재고 : " + book.getStock());
					System.out.println("등록일 : " + book.getRegisteredDate());
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				}
				
			} else if (menuNo == 4) {
				System.out.println("[주문하기]");
				
				System.out.print("주문할 책번호를 입력하세요 : ");
				int bookNo = KeyboardUtil.nextInt();
				System.out.print("주문수량을 입력하세요 : ");
				int amount = KeyboardUtil.nextInt();
				System.out.print("주문자 아이디를 입력하세요 : ");
				String userId = KeyboardUtil.nextString();
				
				boolean isSuccess = service.주문하기(userId, bookNo, amount);
				if (isSuccess) {
					System.out.println("### 주문이 완료되었습니다.");
				} else {
					System.out.println("!!! 주문처리 중 오류가 발생하였습니다.");
				}
				
			} else if (menuNo == 5) {
				System.out.println("[내 주문 전부 보기]");
				
				System.out.print("사용자 아이디를 입력하세요 : ");
				String userId = KeyboardUtil.nextString();
				
				List<Order> myOrders = service.내주문조회(userId);
				if(myOrders.isEmpty()) {
					System.out.println("!!! 주문내역이 존재하지 않습니다.");
				} else {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("주문번호\t책제목\t가격\t구매수량");
					
					for (Order order : myOrders) {
						System.out.print(order.getNo() + "\t");
						System.out.print(order.getBook().getTitle() + "\t");
						System.out.print(order.getPrice() + "\t");
						System.out.println(order.getAmount() + "\t");
					}
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

				}
				
			} else if (menuNo == 6) {
				System.out.println("[주문 정보 상세 보기]");
				
				System.out.print("주문번호를 입력하세요 : ");
				int orderNo = KeyboardUtil.nextInt();
				
				Order order = service.주문상세정보(orderNo);
				if (order == null) {
					System.out.print("!!! 주문번호에 해당하는 주문정보가 존재하지 않습니다.");
				} else {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("주문번호 : " + order.getNo());
					System.out.println("사용자명 : " + order.getUser().getName());
					System.out.println("제목 : " + order.getBook().getTitle());
					System.out.println("가격 : " + order.getBook().getPrice());
					System.out.println("구매가격 : " + order.getPrice());
					System.out.println("구매수량 : " + order.getAmount());
					System.out.println("주문날짜 : " + order.getRegisteredDate());
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				}
				
			} else if (menuNo == 7) {
				
				while(true) {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("1.전체조회	2.등록	3.조회	4.삭제");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.print("메뉴를 선택하세요 : ");
					int menuNon = KeyboardUtil.nextInt();
					
					if (menuNon == 1) {
						System.out.println("[전체 조회]");
						// 모든 질문글 표시
						service.문의글전체조회();
					} else if (menuNon == 2) {
						System.out.println("[문의 등록]");
						// 아이디, 제목, 내용, 질문구분(배송,결제,품질) 입력해서 등록
						System.out.print("문의자 아이디를 입력하세요 : ");
						String userId = KeyboardUtil.nextString();
						System.out.print("문의 제목을 입력하세요 : ");
						String title = KeyboardUtil.nextString();
						System.out.print("문의 내용을 입력하세요 : ");
						String content = KeyboardUtil.nextString();
						System.out.print("질문 종류를 구분해주세요 (배송, 결제, 품질) : ");
						String status = KeyboardUtil.nextString(); //////////////
						
						Question question = new Question();
						
						User user = new User();
						user.setId(userId);
						question.setUser(user);
						//user 객체 생성 후 question으로 userId 불러옴
						
						question.setTitle(title);
						question.setContent(content);
						question.setStatus(status);
						
						service.문의등록(question);
						
					} else if (menuNon == 3) {
						// 질문글 번호 입력받아서 질문글, 답변글 표시
						// 답변글 없으면 표시하지 않음
						System.out.println("[문의 조회]");
						
						System.out.print("글 번호를 입력하세요 : ");
						int questionNo = KeyboardUtil.nextInt();
						
						service.문의글조회(questionNo);
						
						Question question = new Question();
						
						/*
						if (question.setStatus(status); == "Y") {
							service.답변
						}
						*/
						
					} else if (menuNon == 4) {
						System.out.println("[문의 삭제]");
						// 아이디와 질문글 번호 입력받아서 질문글 삭제
						System.out.print("아이디를 입력하세요 : ");
						String userId = KeyboardUtil.nextString();
						System.out.print("글 번호를 입력하세요 : ");
						int questionNo = KeyboardUtil.nextInt();
						
						service.문의글삭제(questionNo, userId);
						
					}
				}
				
			} else if (menuNo == 0) {
				KeyboardUtil.close();
				System.out.println("### 프로그램을 종료합니다.");
				break;
			}
		}
		
		
	}
}
