package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:/setup.log");
			BufferedReader br = new BufferedReader(reader);

			String text = br.readLine();
			System.out.println("파일 내용 : " + text);
		} catch (FileNotFoundException  e) { // 순서는 자식-부모 순서로 (부모 먼저 나오면 에러) 왜? 부모 먼저 나오면 자식이 부모한테 들어감
			
			System.out.println("파일이 존재하지 않습니다. 파일명을 다시 확인하세요.");
		} catch (IOException e) {

			System.out.println("파일을 읽어오는 도중 오류가 발생했습니다.");
		} catch (Exception e) {
			
			System.out.println("예상하지 못한 오류가 발생했습니다.");
		}
		
	}
	/*
	catch() {} 블록을 여러 개 작성해야 하는 경우
	 예외를 catch 하는 순서 중요, 부모 클래스가 아래쪽에 위치해야 함
	맨 마지막 catch () {} 블록은 Exception 객체 잡음
	 ㄴ catch() {} 블록에서 Exception 을 지정하면 생각하지 못한 예외도 해당 블록에서 잡을 수 있음 (갑작스러운 종료 방지)  
	*/
}
