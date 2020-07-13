package com.sample.bookstore.service;

import com.sample.bookstore.vo.User;

public class UserService {

	private User[] db = new User[100];
	private int position = 0;
	private int userSequence = 10001;

	public UserService() {
		User u1 = new User(userSequence++, "홍길동", "010-1111-2345", 100, false);
		User u2 = new User(userSequence++, "김유신", "010-2345-7839", 100, false);
		User u3 = new User(userSequence++, "강감찬", "010-1826-8953", 100, false);
		User u4 = new User(userSequence++, "이순신", "010-4386-5256", 100, false);
		User u5 = new User(userSequence++, "유관순", "010-2678-3468", 100, false);

		db[position++] = u1;
		db[position++] = u2;
		db[position++] = u3;
		db[position++] = u4;
		db[position++] = u5;
	}

	// 회원등록 기능
	// 회원정보를 전달받아서 db배열에 저장
	public void insertUser(User user) { // 4. BookstoreService의 addNewUser로부터 전달받은 user기본값
		user.no = userSequence;

		db[position] = user; // 5.user 기본값을 db 배열에 저장
		position++;
		userSequence++;
	}

	// 회원정보 조회 기능
	// 회원번호를 전달받아서 db배열에서 회원정보를 찾아 반환
	public User findUserByNo(int no) {
		User result = null;

		for (int i = 0; i < position; i++) {
			User user = db[i];

			if (no == user.no) {
				result = user;
				break;
			}

		}

		return result;
	}

	// 회원정보 수정 기능
	// 회원정보를 전달받아서 회원번호에 해당하는 회원의 정보를 db에서 검색해서 회원정보를 수정
	public void updateUser(User user) {

		for (int i = 0; i < position; i++) {
			User foundUser = db[i];

			if (user.no == foundUser.no) {
				foundUser.name = user.name;
				foundUser.tel = user.tel;
				break;
			}

		}

	}

	// 전체 회원정보 조회기능
	// 전체 회원정보를 반환
	public User[] getAllUsers() {

		return db;

	}

	// 회원탈퇴 기능
	// 회원번호를 전달받아서 db배열에서 회원정보를 찾아 탈퇴처리
	public void disableUser(int no) {

		for (int i = 0; i < position; i++) {
			User user = db[i];

			if (user.no == no) {
				user.no = no;
				user.name = null;
				user.tel = null;
				user.point = 0;
				user.isDisabled = true;
				// 일시적으로 전부 제로값으로 만듬
				
				position--;
				user = db[position];
				userSequence--;
				userSequence = user.no;
				
				break;
			} // 10006번을 지우면 10006번 이 가지고 있던 배열을 재활용 할 수는 없나?
				// 가능, position과 userSequence를 활용해서 만듬. 잘했음

		}
	}

}
