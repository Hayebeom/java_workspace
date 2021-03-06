package com.sample.bookstore.service;

import java.util.ArrayList;

import com.sample.bookstore.vo.Book;

public class BookService {

	private Book[] db = new Book[100];
	private int position = 0;
	private int bookSequence = 20001;

	public BookService() {
		Book b1 = new Book(bookSequence++, "자바의 정석", "남궁성", 35000, 10000);
		Book b2 = new Book(bookSequence++, "머신러닝", "안동현", 25000, 10000);
		Book b3 = new Book(bookSequence++, "스프링 입문", "박재성", 32000, 10000);
		Book b4 = new Book(bookSequence++, "JSP 입문", "백기선", 24000, 10000);
		Book b5 = new Book(bookSequence++, "알고리즘", "백준", 37000, 10000);

		db[position++] = b1;
		db[position++] = b2;
		db[position++] = b3;
		db[position++] = b4;
		db[position++] = b5;

	}

	// 신규 도서 등록기능
	// 도서정보를 전달받아서 책번호 발급, db에 저장
	public void insertBook(Book book) {
		book.no = bookSequence;

		db[position] = book;
		position++;
		bookSequence++;
	}

	// 책번호 전달받아서 db에서 책번호에 해당하는 책정보를 찾아서 반환
	public Book findBookByNo(int bookNo) {
		Book result = null;
		// rental에 책 재고 감소하려고 쓰는 듯
		
		for(int i=0; i<position; i++) {
			Book book = db[i];
			if(bookNo == book.no) {
				result = book;
				break;
			}
		}

		return result;
	}

	// 책제목 전달받아서 db에서 입력한 책제목을 포함하고 있는 모든 책을 찾아서 반환
	public Book[] findBookByTitle(String title) {
		ArrayList<Book> books = new ArrayList<Book>();
		for (int i = 0; i < position; i++) {
			if (db[i].title.contains(title)) {
				books.add(db[i]);
			}
		}
		Book[] result = new Book[books.size()];
		books.toArray(result);

		return result;
	}

	// 도서정보 수정 기능
	// 도서정보를 전달받아서 책번호에 해당하는 책정보를 찾기. 그 책의 정보를 새정보로 변경
	public void updateBook(Book book) {

		for (int i = 0; i < position; i++) {
			Book foundBook = db[i];

			if (book.no == foundBook.no) {
				foundBook.title = book.title;
				foundBook.writer = book.writer;
				foundBook.price = book.price;
				break;
			}

		}
	}

	// 모든 책 조회 기능
	public Book[] getAllBooks() {
		return db;
	}
}
