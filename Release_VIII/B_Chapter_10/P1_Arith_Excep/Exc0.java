package Release_VIII.B_Chapter_10.P1_Arith_Excep;

public class Exc0 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int d=0;
		
		try {
			int sum=42/d;
		} catch(ArithmeticException e) {
			System.out.println("Dzielenie przez 0.");
		}

	}

}
