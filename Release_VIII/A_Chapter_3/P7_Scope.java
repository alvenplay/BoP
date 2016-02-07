package Release_VIII.A_Chapter_3;

public class P7_Scope {

	public static void main(String[] args) {
		int x = 10;
		
		if(x == 10) {
			int y = 20;
			System.out.println("x & y " +x +" " +y);
			x = y*2;
		}
		//y = 100;
		
		System.out.println("x = " +x);
	}

}
