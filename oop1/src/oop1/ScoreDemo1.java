package oop1;

import java.util.Scanner;

public class ScoreDemo1 {
	public static void main(String[] args) {
		/*
		학생 이름, 국어, 영어, 수학 점수를 입력받아서 배열에 저장
		배열에 저장된 성적 정보를 출력, 검색 가능
		*/
		
		Scanner sc = new Scanner(System.in);
		Score[] scores = new Score[100];
		int savePosition = 0;
		
		while (true) {
			System.out.println();
			System.out.println("==============================================================");
			System.out.println("1.조회	2.검색	3.입력	4.수정	0.종료");
			System.out.println("==============================================================");
			
			System.out.print("번호를 입력하세요 : ");
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
				System.out.println();
				System.out.println("[성적 정보 조회]");
				System.out.println("이름	국어	영어	수학	총점	평균	합격여부");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for(int i=0; i<savePosition; i++) {
					Score score = scores[i]; // 지역변수라 3.과 중복되지 않음
					System.out.print(score.studentName + "\t");
					System.out.print(score.kor + "\t");
					System.out.print(score.eng + "\t");
					System.out.print(score.math + "\t");
					System.out.print(score.total + "\t");
					System.out.print(score.average + "\t");
					System.out.println(score.isPassed);
				}
			} else if(menuNo == 2) {
				System.out.println();
				System.out.println("[성적 정보 검색]");
				
				System.out.print("조회할 이름을 입력하세요 : ");
				String stdName = sc.next();
				
				Score foundScore = null;		
				for (int i=0; i<savePosition; i++) {
					Score score = scores[i];
					if(stdName.equals(score.studentName)) {
						foundScore = score;
						break;
					}
				}
				
				if (foundScore != null) {
					System.out.println();
					System.out.println("----- 검색 결과 -----");
					System.out.println("이름 : " + foundScore.studentName);
					System.out.println("국어 : " + foundScore.kor);
					System.out.println("영어 : " + foundScore.eng);
					System.out.println("수학 : " + foundScore.math);
					System.out.println("총점 : " + foundScore.total);
					System.out.println("평균 : " + foundScore.average);
					System.out.println("합격여부 : " + foundScore.isPassed);
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				} else {
					System.out.println("[" + stdName + "]과 일치하는 학생정보를 찾을 수 없습니다.");
				}
				
			} else if(menuNo == 3) {
				System.out.println();
				System.out.println("[성적 정보 입력]");
				
				// 이름, 과목 점수 입력
				System.out.print("이름을 입력하세요 : ");
				String stdName = sc.next();
				System.out.print("국어 점수를 입력하세요 : ");
				int korScore = sc.nextInt();
				System.out.print("영어 점수를 입력하세요 : ");
				int engScore = sc.nextInt();
				System.out.print("수학 점수를 입력하세요 : ");
				int mathScore = sc.nextInt();
				
				// Score 객체 생성
				Score score = new Score();
				
				// 생성된 Score 객체에 이름, 국어, 영어, 수학 점수를 저장
				score.studentName = stdName;
				score.kor = korScore;
				score.eng = engScore;
				score.math = mathScore;
				score.total = korScore + engScore + mathScore;
				score.average = score.total/3;
				score.isPassed = (score.average >= 60 ? true : false);
				
				// 성적 정보가 저장된 Score 객체를 위에서 정의한 Scores 배열에 순서대로 저장
				scores[savePosition] = score;
				savePosition++;
				
			} else if(menuNo == 4) {
				System.out.println();
				System.out.println("[성적 정보 변경]");
				
				// 이름, 과목명, 점수를 입력받음
				System.out.print("성적을 변경할 학생 이름을 입력하세요 : ");
				String stdName = sc.next();
				System.out.print("변경할 과목명을 입력하세요 : ");
				String std = sc.next();
				System.out.print("점수를 입력하세요 : ");
				int stdScore = sc.nextInt();
				// score 배열에서 이름과 일치하는 학생을 찾음
				// 2번의 검색과 같은 작업
				Score foundScore = null;
				for(int i=0; i<savePosition; i++) {
					Score score = scores[i];		
					if(stdName.equals(score.studentName)) {
						foundScore = score;
						break;
					}
				}
				
				// foundScore가 null이 아니라면 입력한 과목명에 해당 점수를 변경
				// 과목명이 "국어"라면 foundScore의 kor값 변경
				// 과목명이 "영어"라면 foundScore의 eng값 변경
				// 과목명이 "수학"이라면 foundScore의 math값 변경
				if(foundScore != null) {
					if (std.equals("국어")) {
						foundScore.kor = stdScore;
					} else if (std.equals("영어")) {
						foundScore.eng = stdScore;
					} else if (std.equals("수학")) {
						foundScore.math = stdScore;
					}
					foundScore.total = foundScore.kor + foundScore.eng + foundScore.math;
					foundScore.average = foundScore.total/3;
					foundScore.isPassed = (foundScore.average >= 60 ? true : false);
				}
				
				
			} else if(menuNo == 0) {
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
		sc.close();
	}
}
