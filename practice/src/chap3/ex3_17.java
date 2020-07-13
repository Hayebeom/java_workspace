package chap3;

public class ex3_17 {
	
	public static void main(String[] args) {
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -15;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.println("x=" + signX + absX);
		System.out.println("y=" + signY + absY);
		System.out.println("z=" + signZ + absZ);
		
		/* 혹은
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n', signY, absY);
		System.out.printf("z=%c%d%n', signZ, absZ);
		*/
		

	}
	
}
