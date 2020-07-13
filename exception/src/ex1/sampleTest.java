package ex1;

public class sampleTest {
	
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
			// throw new Exception("고의로 발생시킴); 으로 축약 가능
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
