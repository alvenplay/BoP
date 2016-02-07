package Release_VIII.A_Chapter_7.S26_Var_Args;

public class Var_Args {

	static void vaTest(String msg, int ... v) {
		System.out.print(msg +" " +v.length +" Zawartosc: ");
			
			for(int x:v) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		vaTest("Jeden parametr:", 10);
		vaTest("Trzy parametry:", 1, 2, 3);
		vaTest("Brak parametrow:");

	}

}
