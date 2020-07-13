package ex1;

public class ExceptionDemo7 {
	public static void main(String[] args) {

	}

	// CheckedException
	// 		RuntimeException의 자손이 아닌 모든 Exception은 CheckedException
	// 		CheckedException은 컴파일러가 예외처리 구현 여부를 반드시 체크함
	// 		try ~ catch나 throws를 이용한 예외처리가 반드시 구현되어 있어야 함
	public static void checkedException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// 수행문
		}
	}

	public static void checkedException2() throws Exception {
		throw new Exception();
	}

	// UncheckedException
	// 		RuntimeException의 자손은 전부 UncheckedException
	// 		UncheckedException은 컴파일러가 예외처리 구현 여부를 체크하지 않음
	// 		로직 구현 상 필요한 경우 예외처리를 하는 것도 가능
	public static void uncheckedException() {
		throw new RuntimeException();
	}
}