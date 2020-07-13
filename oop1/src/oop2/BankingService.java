package oop2;

/**
 * 고객 계좌정보 관리 신규 계좌 등록, 계좌 입출금/해지 서비스 제공
 * 
 * @author HYB
 *
 */
public class BankingService {

	// 모든 개설된 계좌정보를 저장하는 배열
	Banking[] db = new Banking[100];
	int savePosition = 0;

	// 기본생성자를 사용하는 경우 계좌정보 100개 저장 가능한 배열 생성
	BankingService() {
		db = new Banking[100];
	}

	// 이 생성자 사용하는 경우 size만큼 계좌정보 저장 가능한 배열 생성
	BankingService(int size) {
		db = new Banking[size];
	}

	// 등록된 전체 계좌정보를 출력하는 서비스
	void printAllBankings() {
		System.out.println("=========================================");
		System.out.println("예금주	계좌번호	잔액	가입기간");
		System.out.println("=========================================");
		for (int i = 0; i < savePosition; i++) {
			Banking banking = db[i];
			System.out.print(banking.name + "\t");
			System.out.print(banking.no + "\t");
			System.out.print(banking.balance + "\t");
			System.out.println(banking.period + "\t");
		}
		System.out.println("=========================================");
	}

	// 신규계좌를 등록하는 서비스
	void addNewBanking(String name, int pwd, long money) {
		Banking banking = new Banking();

		banking.name = name;
		banking.no = "" + (int) (Math.random() * 100000 + 10000);
		banking.password = pwd;
		banking.balance = money;
		banking.period = 24; // 계약기간

		db[savePosition] = banking;
		savePosition++;
	}

	// 계좌번호에 해당하는 계좌정보 조회 서비스
	void printBankingByNo(String bankingNo) {
		Banking foundBanking = findBankingByNo(bankingNo);

		if (foundBanking != null) {
			foundBanking.display();
			
		} else {
			System.out.println("입력한 계좌번호와 일치하는 정보를 찾을 수 없습니다.");
		}

	}

	// 계좌번호, 입금액을 전달받아 해당 계좌에 입금하는 서비스
	void depositBanking(String bankingNo, long money) {
		Banking foundBanking = findBankingByNo(bankingNo);
		
		if(foundBanking != null) {
			foundBanking.deposit(money);
			
		} else {
			System.out.println("입력한 계좌번호와 일치하는 정보를 찾을 수 없습니다.");
		}
				
	}

	// 계좌번호, 비밀번호, 출금액을 전달받아 반환하는 서비스
	long withdrawFromBanking(String bankingNo, int pwd, long money) {
		long result = 0L;

		Banking foundBanking = findBankingByNo(bankingNo);
		if (foundBanking != null) {
			result = foundBanking.withdraw(money, pwd);

		} else {
			System.out.println("입력한 계좌번호와 일치하는 정보를 찾을 수 없습니다.");
		}

		return result;
	}

	// 계좌번호, 비밀번호를 전달받아 계좌 해지, 해지금액 전체 반환 서비스
	long closeBanking(String bankingNo, int pwd) {
		long result = 0L;

		Banking foundBanking = findBankingByNo(bankingNo);
		if (foundBanking != null) {
			result = foundBanking.close(pwd);
		} else {
			System.out.println("입력한 계좌번호와 일치하는 정보를 찾을 수 없습니다.");
		}

		return result;
	}
	
	// 서비스에서 자주 사용 (계좌번호에 해당하는 계좌정보를 찾아서 반환하는 기능)
	Banking findBankingByNo(String bankingNo) {
		Banking result = null;

		for (int i = 0; i < savePosition; i++) {
			Banking banking = db[i];

			if (bankingNo.equals(banking.no)) {
				result = banking;
				break;
			}
		}
		
		return result;
	}

}
