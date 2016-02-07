package Release_VIII.A_Chapter_4;

public class P6_Byte_Shift {

	public static void main(String[] args) {
		byte a = 64, b;
		int i;
		
		i = a<<2;
		b = (byte) (a<<2);
		
		System.out.println("Oryginalna wartosc: " +a);
		System.out.println("i oraz b " +i +" " +b);

	}

}
