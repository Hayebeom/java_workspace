package oop2;

/**
 * 건강관련 지수를 계산하는 기능 제공 클래스
 * @author 홍길동
 *
 */
public class Health {
	
	/**
	 * 체질량지수를 계산해서 그 값을 반환
	 * @param weight 몸무게, kg단위
	 * @param height 키, m단위
	 * @return 체질량지수
	 */
	double bmi (double weight, double height) {
		double bodyMassIndex = weight / (height*height);
		return bodyMassIndex;
	}
	
	/**
	 * 체질량지수 계산, 지수에 따라 비만, 정상, 저체중 등의 값 반환
	 * @param weight 몸무게, kg단위
	 * @param height 키, m단위
	 * @return 체질량지수, 고도비만/중증도비만/경도비만/과체중/정상/저체중 중 반환
	 */
	String bmiText (double weight, double height) {
		String bmiGrade = "";
		double bmi = weight / (height*height);
		
		if(bmi >= 40) {
			bmiGrade = "고도비만";
		} else if (bmi >= 35) {
			bmiGrade = "중증도비만";
		} else if (bmi >= 30) {
			bmiGrade = "경도비만";
		} else if (bmi >= 25) {
			bmiGrade = "과체중";
		} else if (bmi >= 18.5) {
			bmiGrade = "정상";
		} else {
			bmiGrade = "저체중";
		}
		
		return bmiGrade;
	}
}
