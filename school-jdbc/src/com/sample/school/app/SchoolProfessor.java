package com.sample.school.app;

import com.sample.school.util.KeyboardUtil;
import com.sample.school.vo.Process;

public class SchoolProfessor {
	
	public static void main(String[] args) throws Exception {
		
		// SchoolService service = new SchoolService();

		while(true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.과목조회		2.과목등록		3.과정목록조회		4.과정상세조회		5.과정등록		0.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = KeyboardUtil.nextInt();
			
			if (menuNo == 1) {
				System.out.println("[과목조회]");
				
				System.out.print("과목 번호를 입력하세요 : ");
				int subjectNo = KeyboardUtil.nextInt();
				
				// service.과목조회(subjectNo);
			} else if (menuNo == 2) {
				System.out.println("[과목등록]");
				
				System.out.println("과목 번호를 입력하세요 : ");
				int subjectNo = KeyboardUtil.nextInt();
				
				System.out.println("과목명을 입력하세요 : ");
				String subjectName = KeyboardUtil.nextString();
				
				System.out.println("학과 번호를 입력하세요 : ");
				int departmentNo = KeyboardUtil.nextInt();
				
				// service.과목등록(subjectNo, subjectName, departmentNo);
				
			} else if (menuNo == 3) {
				System.out.println("[과정 목록 조회]");
				
				System.out.print("과정 번호를 입력하세요 : ");
				int processNo = KeyboardUtil.nextInt();
				
				// service.과정목록조회(processNo);
			} else if (menuNo == 4) {
				System.out.println("[과정 상세 조회]");
				
				System.out.print("과정 번호를 입력하세요 : ");
				int processNo = KeyboardUtil.nextInt();
				
				
				Process process = service.과정상세정보(processNo);
				
				if (process == null) {
					System.out.print("일치하는 과정이 존재하지 않습니다.");
				} else {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("ㅈㅈㄷㅂㅈㄷㅂㄷㅂㅈㄷㅈㅂㄷㅂㅈㄷㅂㅈㄷㅈㅂㄷㅂ");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					
				}
				
				System.out.print("학생 번호를 입력하세요 : ");
				int studentNo = KeyboardUtil.nextInt();
				
				// Enrolment enrolment = new Enrolment();
				
				// service.수강신청내역조회(enrolmentNo, processNo, studentNo);
				
			} else if (menuNo == 5) {
				
			} else if (menuNo == 0) {
				KeyboardUtil.close();
				System.out.println("### 프로그램을 종료합니다.");
				break;
			}
		}
	}
}
