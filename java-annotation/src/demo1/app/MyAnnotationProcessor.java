package demo1.app;

import java.lang.reflect.Method;

import demo1.annotation.Test;

public class MyAnnotationProcessor {

	public static void main(String[] args) throws Exception {

		MyTester tester = new MyTester();

		// 생성된 객체의 설계도정보가 들어있는 Class 객체를 조회
		Class clazz = tester.getClass();
		
		// Class 객체의 설계도 정보 중에서 해당 객체에 선언된 메서드를 전부 조회
		// 메서드 정보가 포함된 Method 객체의 배열이 획득됨
		Method[] methods = clazz.getDeclaredMethods();
		
		// 각 메서드 순회
		for (Method method : methods) {
			// 메서드의 이름 조회
			String methodName = method.getName();
			
			// 메서드에 @Test 어노테이션이 부착되어 있는지 확인
			boolean isPresent = method.isAnnotationPresent(Test.class);
			System.out.println(methodName + ", @Test 부착여부 : " + isPresent);
			
			// @Test 어노테이션이 부착되어 있으면
			if (isPresent) {
				// 해당 객체의 메서드를 실행
				method.invoke(tester);
			}
			
		}

	}
}
