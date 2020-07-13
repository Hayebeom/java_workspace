package oop1;

import java.util.Scanner;

public class OrderDemo {
	public static void main(String[] args) {
		
		// Order 는 클래스
		// orders 는 Order 클래스로 만든 배열
		// orderP 는 orders[i] 배열로 만든 i번째 배열
		// order 는 Order 클래스로 만든 새 객체

		Scanner sc = new Scanner(System.in);
		Order[] orders = new Order[100];
		int savePosition = 0;
		
		while(true) {
			System.out.println();
			System.out.println("[고객 주문내용 관리 프로그램]");
			System.out.println("=================================================");
			System.out.println("1.조회	2.검색	3.입력	4.종료");
			System.out.println("=================================================");
			
			System.out.print("번호를 입력하세요 : ");
			int MenuNo = sc.nextInt();
			
			if (1 == MenuNo) {
				System.out.println("[고객 주문내용 조회]");
				
				if(savePosition == 0) {
					System.out.println("고객 주문내용이 존재하지 않습니다.");
				} else {
					System.out.println("고객명	고객등급	총구매금액	적립포인트	사은품");
					System.out.println("=================================================");
					
					for (int i=0; i<savePosition; i++) {
						Order orderP = orders[i]; // 요기 안에서만 쓰는 지역변수
						System.out.print(orderP.name + "\t");
						System.out.print(orderP.grade + "\t");
						System.out.print(orderP.price + "\t");
						System.out.print(orderP.point + "\t");
						System.out.println(orderP.gift);
					}
					
				}
				
			} else if (2 == MenuNo) {
				System.out.println("[고객 주문내용 검색]");
				
				System.out.println("검색조건을 입력하세요(N:이름, G:사은품)");
				String option = sc.next();
				System.out.print("검색 내용을 입력하세요");
				String text = sc.next();
				
				System.out.println("고객명	고객등급	총구매금액	적립포인트	사은품");
				System.out.println("=================================================");
				
				for (int i=0; i<savePosition; i++) {
					Order orderP = orders[i];
					
					boolean isFound = false;
					if (option.equals("N") && text.equals(orderP.name)) {
						isFound = true;
					} else if (option.equals("G") && text.equals(orderP.gift)) {
						isFound = true;
					}
					
					if (isFound) {
						System.out.print(orderP.name + "\t");
						System.out.print(orderP.grade + "\t");
						System.out.print(orderP.price + "\t");
						System.out.print(orderP.point + "\t");
						System.out.println(orderP.gift);
					}
				}
				
			} else if (3 == MenuNo) {
				System.out.println("[고객 주문내용 입력]");
				
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("등급을 입력하세요 : ");
				String grade = sc.next();
				System.out.print("총구매금액을 입력하세요 : ");
				int price = sc.nextInt();
				
				// 여기 헷갈림
				Order order = new Order();
				order.name = name;
				order.grade = grade;
				order.price = price;
				
				if(order.grade.equals("프리미어")) {
					order.point = (int) (order.price*0.05);
				} else if(order.grade.equals("에이스")) {
					order.point = (int) (order.price*0.03);
				} else if(order.grade.equals("베스트")) {
					order.point = (int) (order.price*0.02);
				} else if(order.grade.equals("클래식")) {
					order.point = (int) (order.price*0.01);
				}
				
				if(order.price >= 5000000) {
					order.gift = "숙박권"; // String gift 가 아님
				} else if (order.price >= 1000000) {
					order.gift = "상품권";
				} else if (order.price >= 500000) {
					order.gift = "할인권";
				} else {
					order.gift = "주차권";
				}
				
				orders[savePosition] = order;
				savePosition++;
				
			} else if (4 == MenuNo) {
				System.out.println("[고객 주문내용 관리 프로그램 종료]");
				break;
			}
		}
		
		sc.close();
	}
}
