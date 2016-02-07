package Release_VIII.A_Chapter_7.S24_Pass_Array;

public class Worker {
	static void vaTest(int[] v) {
		System.out.print("Liczba argumentow: " +v.length +" Zawartosc: ");
		
		for(int x:v) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
