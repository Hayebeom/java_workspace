package oop4;

/**
 * 상품 관리 서비스를 제공하는 클래스
 * 
 * @author HYB
 *
 */
public class ProductService {
	
	Product[] db = new Product[20];
	int Position = 0;
	
	// 배열에 저장된 모든 상품 정보 출력
	void printAllProduct() {
		System.out.println("=========================================================");
		System.out.println("상품명	제조사명	카테고리	가격	할인율	재고	절판여부");
		System.out.println("=========================================================");
		
		for(int i=0; i<Position; i++) {
			Product product = db[i];
			System.out.print(product.name + "\t");
			System.out.print(product.maker + "\t");
			System.out.print(product.category + "\t");
			System.out.print(product.price + "\t");
			System.out.print(product.discountRate + "\t");
			System.out.print(product.stock + "\t");
			System.out.println(product.isSoldOut);
		}
		System.out.println("=========================================");
	}
	
	// 상품객체(새 상품, 이월상품)를 전달받아서 배열에 저장
	void insertProduct(Product product) {
		
		db[Position] = product;
		Position++;
	}

	// 상품명과 입고량을 전달받아서 이미 배열에 저장된 상품의 재고량을 증가
	void addProductStock(String name, int amount) {
				
		boolean bl = false;
		for (int i=0; i<Position; i++) {
			Product product = db[i];
			
			if(name.equals(product.name)) {
				product.stock += amount;
				bl = true;
				break;
			}
			
			if(!bl) {
				System.out.println("제품명이 존재하지 않습니다.");
			}
			
		}
	}
	
	// 상품명과 출고량을 전달받아서 배열에서 해당 상품 탐색, 재고량을 감소
	// 단, 재고량보다 출고량이 많은 경우 오류 메시지 출력
	// 단, 재고량이 0이 되면 해당 상품의 절판여부 true로 설정
	void exportProduct(String name, int amount) {
		
	}
	
	// 상품 명을 전달받아서 배열에서 상품명이 일치하는 상품 정보 출력
	void printProductsByName(String name) {
		Product foundProduct = findProductByString(name);
		
		if(foundProduct != null) {
			foundProduct.display();
		} else {
			System.out.println("입력한 상품과 일치하는 정보를 찾을 수 없습니다.");
		}
	}
	
	// 제조사 명을 전달받아서 배열에서 제조사 명이 일치하는 상품 정보 출력
	void printProductsByMaker(String maker) {
		Product foundProduct = findProductByString(maker);
		
		if(foundProduct != null) {
			foundProduct.display();
		} else {
			System.out.println("입력한 제조사와 일치하는 정보를 찾을 수 없습니다.");
		}
	}
	
	// 카테고리 명을 전달받아서 배열에서 카테고리 명이 일치하는 상품 정보 출력
	void printProductsByCategory(String category) {
		Product foundProduct = findProductByString(category);

		if (foundProduct != null) {
			foundProduct.display();
		} else {
			System.out.println("입력한 카테고리와 일치하는 정보를 찾을 수 없습니다.");
		}
	}

	// 최저가격, 최고가격을 전달받아서 배열에서 해당 가격범위에 속하는 상품 정보 출력
	void printProductsByPrice(int minPrice, int maxPrice) {
		
		for(int i=0; i<Position; i++) {
			Product product = db[i];
			if (maxPrice >= product.price && minPrice <= product.price) {
				product.display();
			}
			
		}
		
	}
	
	Product findProductByString(String productString) {
		Product result = null;
		
		for (int i=0; i<Position; i++) {
			Product product = db[i];
			
			if(productString.equals(product.name)) {
				result = product;
				break;
			}
		}
		return result;
	}
	
}
