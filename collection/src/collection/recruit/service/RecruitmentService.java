package collection.recruit.service;

import collection.recruit.repo.RecruitmentRepository;
import collection.recruit.vo.Career;
import collection.recruit.vo.Recruitment;
import collection.recruit.vo.Resume;

public class RecruitmentService {

	private RecruitmentRepository repo = new RecruitmentRepository();
	
	// 이력서 등록기능
	public void addNewResume(Resume resume) {
		// 구직신청객체 생성
		// 구직신청객체에 전달받은 이력서 객체 저장
		// 레포지토리객체를 사용해서 db에 저장하고, 자신의 구직신청번호를 출력한다.
		// 구직신청번호를 반환한다.
		Recruitment recruitment = new Recruitment();
		recruitment.setResume(resume);
		repo.addRecuitment(recruitment);
		//////////////////
	}
	
	// 경력사항 등록기능
	public void addCareer(int recruitmentNo, Career career) {
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회한다.
		// 구직신청객체의 경력사항에 전달받은 경력사항객체를 추가한다.
//		Career<Recruitment> foundCareer = repo.getAllRecruitments();
//		repo.getRecruitmentByNo(recruitmentNo);
		
	}
	
	// 구직신청 상태 조회 기능
	public void printRecruitmentDetail(int recruitmentNo) {
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회해서 화면에 출력한다.
		Recruitment foundRecruitment = repo.getRecruitmentByNo(recruitmentNo);
		
		if(foundRecruitment == null) {
			System.out.println("구직신청 내용이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("==========================");
		System.out.println("구직신청번호" + foundRecruitment.getNo());
		System.out.println("이력서 정보");
		System.out.println("경력사항" + foundRecruitment.getCareers());
		System.out.println("합격여부");
		System.out.println("");
		
	}
	
	// 이력서 수정 기능
	public void updateResume(int recruitmentNo, Resume resume) {
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회한다.
		// 구직신청객체의 이력서정보를 전달받은 이력서 정보로 교체한다.
	}
	
	// 구직신청 삭제하기
	public void deleteRecruitment(int recruitmentNo) {
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 삭제한다.
	}
	
	// 전체 구직신청정보 간단 조회
	public void printAllRecruitment() {
		// 레포지토리에서 모든 구직신청 정보를 조회해서 화면에 출력한다.
	}
	
	// 구직신청 심사하기
	public void checkRecruitment(int recruitmentNo, boolean passed) {
		// 레포지토리에서 구직신청번호에 해당하는 구직신청객체를 조회한다.
		// 합격/불합격여부를 결정한다.
	}
}