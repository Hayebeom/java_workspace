package set;

import java.util.HashSet;
import java.util.Iterator;

import vo.Product;

public class HashSetDemo2 {
	public static void main(String[] args) {
		
		HashSet<Product> products = new HashSet<Product>();
		
		Product p1 = new Product(100, "공책", "모나미", 1000);
		Product p2 = new Product(101, "샤프", "모나미", 2000);
		Product p3 = new Product(102, "수첩", "모나미", 3000);
		Product p4 = new Product(103, "볼펜", "모나미", 4000);
		Product p5 = new Product(104, "연필", "모나미", 5000);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			Product product = itr.next();
			if(product.getPrice() >= 3000) {
				itr.remove();
			}
		}
		
		for (Product product : products) {
			System.out.println(product.getNo() + " , " + product.getName() + " , " + product.getPrice());
		}
		
		int size = products.size();
		System.out.println("저장된 상품객체 개수 : " + size);

		// 주소값이 다른데 객체내용은 같다면 해시코드를 재정의
		// hashCode 재정의 후 사이즈 검사 시 1개만 출력됨
		
		System.out.println(products);
		
	}
}
