package lang1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectDemo5 {
	
	public static void main(String[] args) {
		
		User user = new User(10, "hong", "010-1111-2345");
		
		// user 참조변수가 참조하는 객체의 설계도 정보를 가지고 있는 Class 객체 반환 (class 못써서 clazz)
		Class<? extends User> clazz = user.getClass();
		
		String className = clazz.getName();
		System.out.println("클래스 이름 : " + className);
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println("필드명 : " + field.getName() + ", " + field.getType().getTypeName());
		}
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			String returnTypeName = method.getReturnType().getTypeName();
			String methodName = method.getName();
			System.out.println("메소드 : " + returnTypeName + " " + methodName);
		}
		
	}
}
