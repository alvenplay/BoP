package Release_VIII.A_Chapter_4;

public class P3_OpEquals {

	public static void main(String[] args) {
		int a=1, b=2, c=3;
		
		a += 5;
		b *= 4;
		c += a*b;
		c %= 6;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);

	}

}
