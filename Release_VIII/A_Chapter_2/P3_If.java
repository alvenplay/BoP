package Release_VIII.A_Chapter_2;

public class P3_If {

	public static void main(String[] args) {
		int x = 10, y = 20;
		
		if(x < y) {
			System.out.println("x < y");
		}
		
		x *= 2;
		
		if(x == y) {
			System.out.println("x == y");
		}
		
		x *= 2;
		
		if(x > y) {
			System.out.println("x > y");
		}
		
		//-- X != Y
		if(x == y) {
			System.out.println("x != y, NOT DISPLAYED");
		} else {
			System.out.println("x != y, DISPLAYED");
		}
	}
	
}
