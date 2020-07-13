package ex2;

import java.util.Scanner;

public class UserApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserService service = new UserService();
		ErrorCode code = new ErrorCode();

		while (true) {

			try {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1.회원가입	2.로그인	3.비밀번호변경	0.종료");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

				System.out.print("메뉴를 선택하세요 : ");
				int menuNo = sc.nextInt();

				if (menuNo == 1) {
					System.out.println("[회원가입]");

					System.out.print("아이디를 입력하세요 : ");
					String id = sc.next();
					System.out.print("이름을 입력하세요 : ");
					String name = sc.next();
					System.out.print("비밀번호를 입력하세요 : ");
					String pwd = sc.next();
					
					service.addNewUser(id, name, pwd); // HTA 예외발생이 예고된 메서드 실행
					
					System.out.println("### 가입이 완료되었습니다 ###"); // 예고된 예외가 발생하지 않은 경우에만 실행됨

				} else if (menuNo == 2) {
					System.out.println("[로그인]");
					
					System.out.print("아이디를 입력하세요 : ");
					String id = sc.next();
					System.out.print("비밀번호를 입력하세요 : ");
					String pwd = sc.next();
					
					service.login(id, pwd);
					System.out.println("### 로그인이 완료되었습니다 ###");
					
				} else if (menuNo == 3) {
					System.out.println("[비밀번호 변경]");
					
					System.out.print("아이디를 입력하세요 : ");
					String id = sc.next();
					System.out.print("이전 비밀번호를 입력하세요 : ");
					String oldPwd = sc.next();
					System.out.print("비밀번호를 입력하세요 : ");
					String newPwd = sc.next();
					
					service.changePassword(id, oldPwd, newPwd);
					System.out.println("### 비밀번호 변경이 완료되었습니다 ###");
					
				} else if (menuNo == 0) {
					break;
				}
				
			} catch (HTAException e) {
//				String errorMessage = e.getMessage();
//				System.err.println("[에러메시지] -> " + errorMessage);
				System.err.println(e);
				
				String errorCode = e.getErrorCode();
				String errorDescription = code.getDescription(errorCode);
				System.err.println("[" + errorCode + "] -> " + errorDescription);
			}
		}

	}
}
