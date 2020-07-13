package demo1;

public class Parent {
	
	public void m() {
		
	}
	
	@Deprecated
	// 곧 있으면 사라질 기능
	public void m1() {
		
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m();
		p.m1();
	}
	
}
