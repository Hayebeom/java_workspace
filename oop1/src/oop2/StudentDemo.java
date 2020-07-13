package oop2;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[100];
		int savePosition = 0;

		while (true) {
			System.out.println();
			System.out.println("[학생 정보 관리 프로그램]");
			System.out.println("======================================");
			System.out.println("1.조회	2.검색	3.입력	0.종료");
			System.out.println("======================================");
			
			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.println("[학생정보 조회]");
				System.out.println("이름	반	번호	국어	영어	수학	총점	평균");
				System.out.println("============================================================");
				
				for (int i=0; i<savePosition; i++) {
					Student student = students[i];
					student.displayStudentsInfoRow();
				}
				
				System.out.println("============================================================");
				
			} else if (menuNo == 2) {
				System.out.println("[학생정보 검색]");
				System.out.print("검색할 이름을 입력하세요 : ");
				String searchName = sc.next();
				
				boolean isFound = false;
				for (int i=0; i<savePosition; i++) {
					Student student = students[i];
					if(searchName.equals(student.name)) {
						student.displayStudentInfo();
						isFound = true;
					}
				}
				
				if (!isFound) {
					System.out.println("입력한 이름과 일치하는 정보를 찾을 수 없습니다.");
				}
							
			} else if (menuNo == 3) {
				System.out.println("[학생정보 입력]");
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("반을 입력하세요 : ");
				int ban = sc.nextInt();
				System.out.print("번호를 입력하세요 : ");
				int no = sc.nextInt();
				System.out.print("국어점수를 입력하세요 : ");
				int kor = sc.nextInt();
				System.out.print("영어점수를 입력하세요 : ");
				int eng = sc.nextInt();
				System.out.print("수학점수를 입력하세요 : ");
				int math = sc.nextInt();
				
				Student student = new Student();
				
				student.name = name;
				student.ban = ban;
				student.no = no;
				student.kor = kor;
				student.eng = eng;
				student.math = math;
				
				students[savePosition] = student;
				savePosition++;
				
			} else if (menuNo == 0) {
				System.out.println();
				System.out.println("[프로그램 종료]");
				break;
			}
			
			sc.close();
		}
	}
}
