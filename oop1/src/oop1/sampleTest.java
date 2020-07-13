package oop1;

/**
 * 이 클래스는 연습용 클래스입니다.
 * 
 * @author HYB
 *
 */
public class sampleTest {
	String color;
	String gearType;
	int door;

	sampleTest() {
		this("white", "auto", 4);
	}

	sampleTest(String color) {
		this(color, "auto", 4);
	}

	sampleTest(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}

