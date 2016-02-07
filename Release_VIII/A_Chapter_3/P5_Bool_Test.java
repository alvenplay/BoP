package Release_VIII.A_Chapter_3;

public class P5_Bool_Test {

	public static void main(String[] args) {
		boolean b = false;
		
		System.out.println("Bool = " +b);
		
		b = true;
		
		System.out.println("Bool = " +b);

		if(b) {
			System.out.println("MADE");
		}
		
		b = false;

		if(b) {
			System.out.println("NOT MADE");
		}
		
		System.out.println("10 > 9 " +(10>9));
	}

}
