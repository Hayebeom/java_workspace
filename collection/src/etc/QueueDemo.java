package etc;

import java.util.LinkedList;

public class QueueDemo {
	public static void main(String[] args) {
		
		// LinkedList는 Queue 인터페이스의 구현클래스이기도 함
		LinkedList<String> queue = new LinkedList<String>();
		
		// Queue의 구현객체(LinkedList)에 값 저장
		queue.offer("이순신");
		queue.offer("김유신");
		queue.offer("강감찬");
		
		while(!queue.isEmpty()) {
			System.out.println(queue);
			System.out.println("poll -> " + queue.poll());
		}
		
		if (queue.isEmpty()) {
			System.out.println(queue);
		}
		
		// Queue의 구현객체(LinkedList)에서 값 꺼내기
//		System.out.println(queue);
//		System.out.println("poll -> " + queue.poll());
//		System.out.println(queue);
//		System.out.println("poll -> " + queue.poll());
//		System.out.println(queue);
//		System.out.println("poll -> " + queue.poll());
//		System.out.println(queue);
		
	}
}
