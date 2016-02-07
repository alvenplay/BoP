package Release_VIII.A_Chapter_7.S27_Var_Test;

public class Var_Test {
	
	static void vaTest(int ... v) {
		System.out.print("vaTest(int ... v): " +v.length +" Zawartosc: ");
			
			for(int x:v) {
				System.out.print(x+" ");
			}
			System.out.println();
	}
	
	static void vaTest(boolean ... v) {
		System.out.print("vaTest(bool ... v): " +v.length +" Zawartosc: ");
			
			for(boolean x:v) {
				System.out.print(x+" ");
			}
			System.out.println();
	}
	
	static void vaTest(String msg, int ... v) {
		System.out.print(msg +" " +v.length +" Zawartosc: ");
			
			for(int x:v) {
				System.out.print(x+" ");
			}
			System.out.println();
	}
}
