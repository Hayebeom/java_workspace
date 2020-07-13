package serialization;

public class UserGrade {
	
	private String grade;
	private int point;
	
	public UserGrade() {
		
	}

	public UserGrade(String grade, int point) {
		super();
		this.grade = grade;
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
