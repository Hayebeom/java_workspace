package ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionDemo4 {
	
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://thumb.mtstarnews.com/06/2012/11/2012110618560680005_1.jpg/dims/optimize");
			InputStream in = url.openStream();
			
			FileOutputStream out = new FileOutputStream("C:/files/star.png");
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len=in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			out.close();
			
		} catch (MalformedURLException e) {
//			e.printStackTrace();
//			String errorMessage = e.getMessage();
//			System.out.println("에러 메시지 : " + errorMessage);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			String errorMessage = e.getMessage();
//			System.out.println("에러 메시지 : " + errorMessage);
		} catch (IOException e) {
//			e.printStackTrace();
//			String errorMessage = e.getMessage();
//			System.out.println("에러 메시지 : " + errorMessage);
		}
	}
	
}
