package etc;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		// 콜렉션 프레임워크의 표준 메서드를 사용한 경우
		Stack<String> stack = new Stack<String>();
		stack.add("길동");
		stack.add("유신");
		stack.add("순신");
		
		for (String value : stack) {
			System.out.println(value);
		}
		
		System.out.println();
		
		// Stack 고유의 기능을 제공하는 메서드를 사용한 경우
		Stack<String> stack2 = new Stack<String>();
		stack2.push("길동");	// Stack 객체에 저장
		stack2.push("유신");
		stack2.push("순신");
		
		while(!stack2.isEmpty()) {
			String value = stack2.pop();
			System.out.println(value);
		}
		
	}
}
