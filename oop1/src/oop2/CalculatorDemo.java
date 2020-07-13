package oop2;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.plus(6, 0);
		calculator.plus(6, 2, 3);
		calculator.plus(6.0, 3.0);
		calculator.plus(6L, 3L);
		
	}
}
