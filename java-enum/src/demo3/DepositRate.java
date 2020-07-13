package demo3;

public enum DepositRate {

	BRONZE(0.01), SILVER(0.03),	GOLD(0.05),	VIP(0.1);
	
	// 열거형의 멤버변수는 반드시 final로 정의
	private final double value;
	
	// 열거형의 생성자는 멤버변수를 초기화해야 함
	// 열거형의 생성자는 오직 private만 가능
	// 열거형의 생성자는 열거형 내부적으로 사용
	private DepositRate(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
}
