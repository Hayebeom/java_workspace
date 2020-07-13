package demo1.app;

import java.lang.reflect.Field;

import demo1.annotation.NotNull;

public class NotNullAnnotationProcessor {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		User user = new User();
		user.setName("홍길동");
		
		Class clz = user.getClass();
		
		// User 객체에 선언된 멤버변수(필드) 모두 조회
		Field[] fields = clz.getDeclaredFields();
		
		for (Field field : fields) {
			// 필드명 조회
			String fieldName = field.getName();
			// 해당 필드가 @NotNull 에노테이션이 부착되어 있는지 확인
			boolean isNotNullField = field.isAnnotationPresent(NotNull.class);
			
			if (isNotNullField) {
				// 해당 필드에 저장된 값 조회
				String value = (String) field.get(user);
				System.out.println("필드명: " + fieldName + ", " + value);
				
				// 필드의 값이 null 이라면
				if (value == null) {
					// 필드에 부착된 NotNull 어노테이션 객체 획득
					NotNull annotation = field.getAnnotation(NotNull.class);
					// 어노테이션의 구성요소 중 message의 값 조회
					String message = annotation.message();
					// 메시지값 화면에 출력
					System.out.println("에러 메시지 " + message);
				}
				
				field.getClass();
			}
			
		}
		
	}
}
