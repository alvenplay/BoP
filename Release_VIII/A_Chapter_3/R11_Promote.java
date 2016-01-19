package Release_VIII.A_Chapter_3;

public class R11_Promote {

	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1_024;
		int i = 50_000;
		float f = 5.67f;
		double d = .1234;
		
		double result = (f*b) + (i/c) - (d*s);
		
		System.out.println((f*b) +" + " +(i/c) +" - " +(d*s) +" = " +result);

	}

}
