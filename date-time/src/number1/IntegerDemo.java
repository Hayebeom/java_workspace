package number1;

public class IntegerDemo {
	public static void main(String[] args) {
		
		String text = "		1234567.89";
		
		double number1 = Double.parseDouble(text); // double은 괜찮음
		System.out.println(number1);
		
//		int number2 = Integer.parseInt("	100000"); // Integer는 앞의 공백 오류
//		System.out.println(number2);
		
	}
}

