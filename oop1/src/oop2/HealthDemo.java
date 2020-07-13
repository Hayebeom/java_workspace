package oop2;

public class HealthDemo {
	public static void main(String[] args) {
		
		Health h = new Health();
		double result1 = h.bmi(73, 1.76);
		System.out.println("bmi지수 : " + result1);
		
		String result2 = h.bmiText(73, 1.76);
		System.out.println("bmi등급 : " + result2);
	}
}
