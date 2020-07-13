package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:/files/data.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		String text1 = br.readLine();
//		String text2 = br.readLine();
//		String text3 = br.readLine();
//		String text4 = br.readLine();
//		String text5 = br.readLine();
//		String text6 = br.readLine();
//		
//		System.out.println(text1);
//		System.out.println(text2);
//		System.out.println(text3);
//		System.out.println(text4);
//		System.out.println(text5);
//		System.out.println(text6);
		
		String text = null;
		int totalOrderPrice = 0;
		
		while ((text = br.readLine()) != null) {
			if (!text.isEmpty()) {
//				System.out.println(text); // 위의 text들을 한 줄로 요약
				String[] items = text.split(",");
//				System.out.println(items[4]); // 4번째 가격만 출력
				int price = Integer.parseInt(items[4]);
				totalOrderPrice += price;
			}
		}
		
		System.out.println("총 구매금액 : " + totalOrderPrice);

		br.close();
	}
}
