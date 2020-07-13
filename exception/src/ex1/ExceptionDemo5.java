package ex1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		try {
			ExceptionDemo5.saveImage("https://lh3.googleusercontent.com/proxy/m1r7TL7vhUtCOxL1oUvednM4rqZiHJtmJ7gl7O0TsReUlbrmlvfqZeHfrW0Bp0CiZdyz3URuvkDRHf-P-ADHZo_TqFWKdMsbsSAJvNbcZD2G-cldwKINFBVpBNGUJhc1i74f9vOGd_Wdkg");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 예외처리를 saveImage() 메서드를 호출한 측에 위임
	// throws 키워드 사용시 해당 메서드 안에서 발생되는 예외에 대한 처리를 호출한 측에 위임
	private static void saveImage(String path) throws MalformedURLException, IOException {
		URL url = new URL(path);
		InputStream in = url.openStream();

		FileOutputStream out = new FileOutputStream("c:/files/iu.jpg");
		byte[] buf = new byte[1024];
		int len = 0;
		while ((in.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		out.close();
		
		ExceptionDemo5.copy(in, out);

	}
	
	private static void copy(InputStream in, OutputStream out) throws IOException {
		byte[] buf = new byte[1024];
		int len = 0;
		while ((in.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		out.close();
	}
	
}
