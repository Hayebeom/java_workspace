package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class FileCopyDemo6 {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("c:/files/SleepAway.mp3");
		FileOutputStream fos = new FileOutputStream("c:/files/sleep away.mp3");
		
		IOUtils.copy(fis, fos);
		
	}
}

