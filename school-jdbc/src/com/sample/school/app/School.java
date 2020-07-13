package com.sample.school.app;

import com.sample.school.util.KeyboardUtil;

public class School {
	
	public static void main(String[] args) throws Exception {
		
		// SchoolService service = new SchoolService();
		
		while(true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.과정목록조회	2.수강신청		3.수강취소		4.수강신청내역조회	0.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = KeyboardUtil.nextInt();
			
			if (menuNo == 1) {
				System.out.println("[과정 목록 조회]");
				
				System.out.print("과정 번호를 입력하세요 : ");
				int processNo = KeyboardUtil.nextInt();
				
				// service.과정목록조회(processNo);
			} else if (menuNo == 2) {
				System.out.println("[수강신청]");
				
				
			} else if (menuNo == 3) {
				
			} else if (menuNo == 4) {
				System.out.println("[수강신청내역조회]");
				
				System.out.print("수강신청 번호를 입력하세요 : ");
				int enrolmentNo = KeyboardUtil.nextInt();
				System.out.print("과정 번호를 입력하세요 : ");
				int processNo = KeyboardUtil.nextInt();
				System.out.print("학생 번호를 입력하세요 : ");
				int studentNo = KeyboardUtil.nextInt();
				
				// Enrolment enrolment = new Enrolment();
				
				// service.수강신청내역조회(enrolmentNo, processNo, studentNo);
				
			} else if (menuNo == 0) {
				KeyboardUtil.close();
				System.out.println("### 프로그램을 종료합니다.");
				break;
			}
		}
	}
}
