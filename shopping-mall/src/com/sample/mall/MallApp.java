package com.sample.mall;

import java.util.Scanner;

import com.sample.mall.service.MallService;

public class MallApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MallService service = new MallService();
		
		while(true) {
			System.out.println("##### 작은 쇼핑몰 #####");
			System.out.println("=================================================================================");
			System.out.println("1.모든 상품조회 2.상품상세조회 3.장바구니담기 \n4.내 장바구니 보기 5.구매하기 6.나의 구매내역 \n0.종료");
			System.out.println("=================================================================================");
			
			System.out.print("메뉴를 선택하세요: ");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {
				// 모든 상품을 조회하기
				// 입력값 없음
				System.out.println();
				System.out.println("모든 상품을 조회합니다.");
				service.displayAllProducts();
				
			} else if (menuNo == 2) {
				// 상품상세정보 조회하기
				// 상품번호 입력받기
				System.out.print("상세 조회할 상품 번호를 입력하세요 : ");
				int productNo = sc.nextInt();
				service.displayProductDetail(productNo);
				
			} else if (menuNo == 3) {
				// 장바구니 담기
				// 사용자아이디, 상품번호 입력받기
				System.out.print("사용자 아이디를 입력하세요 : ");
				String userId = sc.next();
				System.out.print("상품 번호를 입력하세요 : ");
				int productNo = sc.nextInt();
				service.addCartItem(userId, productNo);
				
			} else if (menuNo == 4) {
				// 내 장바구니 보기
				// 사용자아이디 입력받기
				System.out.println("내 장바구니를 확인합니다.");
				System.out.print("사용자 아이디를 입력하세요 : ");
				String userId = sc.next();
				service.displayMyCart(userId);
				
			} else if (menuNo == 5) {
				// 구매하기
				// 사용자아이디 입력받기
				System.out.print("사용자 아이디를 입력하세요 : ");
				String userId = sc.next();
				service.cartToOrder(userId);
				
			} else if (menuNo == 6) {
				// 나의 구매내역 보기
				// 사용자아이디 입력받기
				System.out.println("구매 내역을 확인합니다.");
				System.out.print("사용자 아이디를 입력하세요 : ");
				String userId = sc.next();
				service.displayMyOrders(userId);
				
			} else if (menuNo == 0) {
				// 종료
				break;
				
			}
			System.out.println();
			System.out.println();
		}
		
		sc.close();
		System.out.println("[프로그램 종료]");
	}
}
