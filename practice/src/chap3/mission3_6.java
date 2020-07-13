package chap3;

public class mission3_6 {
	public static void main(String[] args) {
		
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
//		double celcius = (); //(Math.round(((double)5/9 * (double)(fahrenheit-32))*100)/100.0);
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);
	}
}
