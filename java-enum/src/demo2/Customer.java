package demo2;

public class Customer {
	
	private String name;
	private Grade grade; //enum 타입의 grade 변수
	
	public Customer() {
		
	}
	
	public Customer(String name, Grade grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public Customer(String name, String gradeName) {
		this.name = name;

		// 둘 중 하나
		this.grade = Enum.valueOf(Grade.class, gradeName);
		this.grade = Grade.valueOf(gradeName);
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public Grade getGrade() {
		return grade;
	}
	
}
