package etc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 설정 프로그램");
		System.out.print("서버 URL을 입력하세요 : ");
		String url = sc.next();
		System.out.print("서버의 포트 번호를 입력하세요 : ");
		String port = sc.next();
		System.out.print("서버 접속 계정을 입력하세요 : ");
		String username = sc.next();
		System.out.print("서버 비밀번호를 입력하세요 : ");
		String password = sc.next();
		
		Properties prop = new Properties();
		prop.setProperty("mail.server.url", url);
		prop.setProperty("mail.server.port", port);
		prop.setProperty("mail.server.username", username);
		prop.setProperty("mail.server.password", password);
		
		prop.store(new FileWriter("src/mail.properties"), "Mail Server Configuration");
		
		sc.close();
		
	}
}
