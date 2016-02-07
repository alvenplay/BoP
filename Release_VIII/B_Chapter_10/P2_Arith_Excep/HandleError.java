package Release_VIII.B_Chapter_10.P2_Arith_Excep;

import java.util.Random;

public class HandleError {

	public static void main(String[] args) {
		Random r = new Random();
		int a=0, b=0, c=0;
		
		for(int i=0; i<32; i++) {
			try {
				a = r.nextInt();
				b = r.nextInt();
				c = 12345 / (a/b);
			} catch(ArithmeticException e) {
				System.out.println("Dzielenie przez 0.");
				c = 0;
			}
			System.out.println("c: " +c);
		}

	}

}
