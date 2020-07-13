package oop2;

public class BankingDemo {
	public static void main(String[] args) {
		
		Banking banking = new Banking();
		
		banking.name = "홍길동";
		banking.no = "11-1111-1100";
		banking.password = 1234;
		banking.balance = 200000;
		banking.period = 6;
		
		
		// 현재 계좌정보 조회
		banking.display();
		
		// 입금
		banking.deposit(100000);
		banking.display();
		
		// 출금
		long money1 = banking.withdraw(50000, 1234);
		System.out.println("출금액 : " + money1);
		banking.display();
		
		// 해지
		long money2 = banking.close(1234);
		System.out.println("최종 해지금액 : " + money2);
		banking.display();
		
	}
}
