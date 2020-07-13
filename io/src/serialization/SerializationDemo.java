package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		User user = new User();
		user.setNo(100);
		user.setUserId("hong");
		user.setPassword("zxcv1234");
		user.setTel("010-1234-5678");
		user.setEmail("hong@gmail.com");
		
		UserGrade grade = new UserGrade();
		grade.setGrade("VIP");
		grade.setPoint(24000);
		
		FileOutputStream fos = new FileOutputStream("c:/files/user.sav");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// user 참조변수가 참조하는 객체를 스트림으로 전송가능한 상태로 작성
		// 연결될 FileOutputStream으로 전송
		// FileOutputStream은 user.sav 파일로 출력됨
		oos.writeObject(user);
		
		oos.close();
	}
}
