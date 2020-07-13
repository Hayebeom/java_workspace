package com.sample.bookstore.service;

import com.sample.bookstore.vo.Rental;

public class RentalService {

	private Rental[] db = new Rental[100];
	private int position = 0;
	private int rentalSequence = 50001;

	// 대여정보 저장 기능
	// 전달받은 대여정보를 db에 저장
	public void insertRental(Rental rental) {
		
		rental.no = rentalSequence;
		
		db[position] = rental;
		position++;
		rentalSequence++;
		//////////////////
		
	}

	// 대여정보 조회기능
	// 대여번호에 해당하는 대여정보를 반환
	public Rental findRentalByNo(int rentalNo) {
		Rental result = null;
		// 반납 서비스에 사용하는 건가본데
		
		for(int i=0; i<position; i++) {
			Rental rental = db[i];
			
			if(rentalNo == rental.no) {
				result = rental;
				break;
			}
		}
		
		return result;
	}

	// 반납처리 기능
	// 사용자번호를 전달받아서 그 사용자의 모든 대여도서를 반납처리하는 기능
	public void returnAllRentalByUserNo(int userNo) {

		for (int i = 0; i < position; i++) {
			Rental rental = db[i];

				if (userNo == rental.no) {
					rental.isRent = false;
					/*
					 * rental.userNo = 0; rental.bookNo = 0;
					 * 
					 * position--; rental = db[position]; rentalSequence -= rental.no;
					 * 
					 * break;
					 */

				}
			////////////////////////////////////////
			// 좀 애매하다 대여 반납 대여 반납이
		}

	}
	
	public void returnAllRentalByRentalNo(int rentalNo) {

		for (int i = 0; i < position; i++) {
			Rental rental = db[i];

			if (rentalNo == rental.no) {
				rental.userNo = 0;
				rental.bookNo = 0;
				
				break;

			}
			////////////////////////////////////////
			// 좀 애매하다 대여 반납 대여 반납이
		}

	}

	
	// 대여현황조회기능
	// 모든 대여정보를 반환
	public Rental[] getAllRentals() {
		return db;
	}

}