package lang2;

public class StringDemo4 {

	public static void main(String[] args) {
		/*
		 ★ StringBuilder와 StringBuffer
		 두 객체 모두 문자열을 다루기 위한 객체
		 내부에 버퍼(저장소)를 가지고 있어서, 문자열을 추가, 변경, 삭제하는 것이 가능 (String과 차이)
		 주요 메서드
		  ☆자주씀	StringBuilder append(다양한타입 값) : 맨 뒤에 붙임
				StringBuilder delete(int begin, int end) : 지정된 범위의 문자열 삭제
				StringBuilder insert(int position, 다양한타입 값) : 지정된 위치에 문자열 삽입
				StringBuilder replace(int start, int end, String str) : 지정된 범위의 문자열을 새 문자열로 변경
		*/
		
		String name = "홍길동";
		String tel = "010-1111-1111";
		String dept = "영업팀";
		int workedYear = 6;
		int salary = 3500000;
		
		StringBuilder sb = new StringBuilder();
		sb.append("이름:");
		sb.append(name);
		sb.append(", 전화번호:");
		sb.append(tel);
		sb.append(", 소속부서:");
		sb.append(dept);
		sb.append(", 근무연수:");
		sb.append(workedYear);
		sb.append(", 급여:");
		sb.append(salary);
		
		String text = sb.toString();
		System.out.println(text);
		
		StringBuffer sf1 = new StringBuffer();
		String resultText = sf1.append("이름:").append(name).append(", 전화번호:").append(tel).append(", 소속부서:").append(dept).append(", 근무연수:").append(workedYear).append(", 급여:").append(salary).toString();
		System.out.println(resultText);
		
	}
}
