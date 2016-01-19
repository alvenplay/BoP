package Release_VIII.A_Chapter_7.S25_Var_Test;

public class Var_Test {
	
	static void vaTest(int ... v) {
	System.out.print("Liczba argumentow: " +v.length +" Zawartosc: ");
		
		for(int x:v) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();

	}

}
