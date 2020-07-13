package collection.recruit;

import java.util.Scanner;

import collection.recruit.repo.RecruitmentRepository;
import collection.recruit.service.RecruitmentService;
import collection.recruit.vo.Career;
import collection.recruit.vo.Recruitment;
import collection.recruit.vo.Resume;

public class RecruitApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecruitmentService service = new RecruitmentService();
		
		while (true) {
			System.out.println("=========================================");
			System.out.println("1.구직자  2.인사담당자  0.종료");
			System.out.println("=========================================");
			
			System.out.print("메뉴를 선택하세요: ");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {
				System.out.println("==========================================================================");
				System.out.println("1.이력서등록 2.경력사항등록 3.채용상태확인 4.이력서수정 5.구직신청 삭제");
				System.out.println("==========================================================================");
				
				System.out.print("구직자 메뉴를 선택하세요 : ");
				int empMenuNo = sc.nextInt();
				
				if (empMenuNo == 1) {
					// 이름, 전화번호, 지원부서를 입력받는다.
					System.out.println();
					System.out.println("[이력서 등록]");
					System.out.print("이름을 입력하세요 : ");
					String name = sc.next();
					System.out.print("전화번호를 입력하세요 : ");
					String tel = sc.next();
					System.out.print("지원부서를 입력하세요 : ");
					String dept = sc.next();
					
					Resume resume = new Resume();
					resume.setName(name);
					resume.setTel(tel);
					resume.setDept(dept);
					
					service.addNewResume(resume);
					System.out.println("이력서 등록이 완료되었습니다.");
					
				} else if (empMenuNo == 2) {
					// 구직신청번호, 재직회사명, 근무부서, 직위, 근무년수를 입력받는다.
					System.out.println("[경력사항 등록]");
					System.out.print("구직신청번호를 입력하세요 : ");
					int no = sc.nextInt();
					System.out.print("재직회사명을 입력하세요 : ");
					String companyName = sc.next();
					System.out.print("근무부서를 입력하세요 : ");
					String dept = sc.next();
					System.out.print("직위를 입력하세요 : ");
					String position = sc.next();
					System.out.print("근무년수를 입력하세요 : ");
					int year = sc.nextInt();
					
//					Recruitment recruitment = new Recruitment();
//					int recruitmentNo = recruitment.setNo(no);
					int recruitmentNo = no;
					
					Career career = new Career();
					career.setCompanyName(companyName);
					career.setDept(dept);
					career.setPosition(position);
					career.setYear(year);
					
					service.addCareer(recruitmentNo, career);
					System.out.println("경력사항 등록이 완료되었습니다.");
					
				} else if (empMenuNo == 3) {
					// 구직신청번호를 입력받는다.
					System.out.println("[채용상태 확인]");
					System.out.print("구직신청번호를 입력하세요 : ");
					int no = sc.nextInt();
					
					service.printRecruitmentDetail(no);
					
				} else if (empMenuNo == 4) {
					// 구직신청번호, 이름, 전화번호, 지원부서를 입력받는다.
				} else if (empMenuNo == 5) {
					// 구직신청번호를 입력받는다.
				} 
				
			} else if (menuNo == 2) {
				System.out.println("==========================================================================");
				System.out.println("1.채용신청서 조회  2.채용신청서 상세조회  3.채용신청서 심사");
				System.out.println("==========================================================================");
				
				System.out.print("구직자 메뉴를 선택하세요");
				int empMenuNo = sc.nextInt();
				
				if (empMenuNo == 1) {
					// 입력값 없음
				} else if (empMenuNo == 2) {
					// 구직신청번호를 입력받는다.
				} else if (empMenuNo == 3) {
					// 구직신청번호와 합격불합격여부를 Y/N으로 입력받는다.
				} 
				
			} else if (menuNo == 0) {
				System.out.println("### 프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}
		sc.close();
	}
}