package Release_VIII.A_Chapter_3;

public class R10_Conversion {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		
		System.out.println("Int => Byte ");
		b = (byte) i;
		System.out.println("i & b " +i +" " +b);
		
		System.out.println("Double => Int ");
		i = (int) d;
		System.out.println("d & i " +d +" " +i);
		
		System.out.println("Double => Byte");
		b = (byte) d;
		System.out.println("d & b " +d +" " +b);
	}

}
