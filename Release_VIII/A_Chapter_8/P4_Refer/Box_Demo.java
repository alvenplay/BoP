package Release_VIII.A_Chapter_8.P4_Refer;

public class Box_Demo {

	public static void main(String[] args) {
		Ext_Box b1 = new Ext_Box(3, 5, 7, 8.37);
		Std_Box plain = new Std_Box();
		
		System.out.println("Objetosc b1: " +b1.vol());
		System.out.println("Ciezar b1: " +b1.weight);
		System.out.println();
		
		plain = b1;
		
		System.out.println("Objetosc plain: " +plain.vol());
	//	System.out.println("Ciezar plain: " +plain.weight);
		System.out.println();
		
	}

}
