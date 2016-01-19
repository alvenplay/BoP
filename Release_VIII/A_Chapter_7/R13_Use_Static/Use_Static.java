package Release_VIII.A_Chapter_7.R13_Use_Static;

public class Use_Static {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Use_Static test = new Use_Static(20);
		meth(42);

	}
	
	static int a=3;
	static int b;
	private static int d;
	
	static {
		System.out.println("Inicjalizacja w bloku statycznym.");
		b=a*4;
	}
	Use_Static(int i) {
		setD(i);
	}
	static void meth(int x) {
		System.out.println("x = " +x);
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("d = " +d);
	}
	public static int getD() {
		return d;
	}
	public static void setD(int d) {
		Use_Static.d = d;
	}

}
